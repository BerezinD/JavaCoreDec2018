package Java_SE_01.SixthTask;

import static org.junit.jupiter.api.Assertions.*;

class NotepadTest {

    @org.junit.jupiter.api.Test
    void addRecord() {
        Notepad myNotepad = new Notepad();
        NotepadRecord firstRecord = new NotepadRecord("our record");
        assertTrue(myNotepad.addRecord(firstRecord));
        assertEquals("our record", myNotepad.readRecord(firstRecord));
        assertNotEquals("none", myNotepad.readRecord(null));
    }

    @org.junit.jupiter.api.Test
    void delRecord() {
        Notepad myNotepad = new Notepad();
        myNotepad.addRecord(new NotepadRecord("first"));

        assertTrue(myNotepad.delRecord(1));
        assertNull(myNotepad.readRecord(1));
        assertTrue(myNotepad.addRecord(new NotepadRecord("first")));

        NotepadRecord second = new NotepadRecord("second");
        NotepadRecord third = new NotepadRecord("third");
        NotepadRecord fourth = new NotepadRecord("fourth");

        myNotepad.addRecord(second);
        myNotepad.addRecord(third);
        myNotepad.addRecord(fourth);

        assertTrue(myNotepad.delRecord(third));
        assertFalse(myNotepad.delRecord(third));
        assertEquals("second", myNotepad.readRecord(second));
        assertEquals("second", myNotepad.readRecord(2));
        assertEquals("fourth", myNotepad.readRecord(fourth));
        assertEquals("fourth", myNotepad.readRecord(3));
        assertEquals(-1, third.getRecordNumber());
        assertEquals(2, fourth.getRecordNumber());
    }

    @org.junit.jupiter.api.Test
    void editRecord() {
        Notepad myNotepad = new Notepad();
        myNotepad.addRecord(new NotepadRecord("first"));

        assertTrue(myNotepad.editRecord(1, "newFirst"));
        assertEquals("newFirst", myNotepad.readRecord(1));

        NotepadRecord second = new NotepadRecord("");
        myNotepad.addRecord(second);
        assertTrue(myNotepad.editRecord(second, "newSecond"));
        assertEquals("newSecond", myNotepad.readRecord(second));
        assertEquals("newSecond", myNotepad.readRecord(2));

        NotepadRecord third = new NotepadRecord("third");
        assertFalse(myNotepad.editRecord(0, ""));
        assertFalse(myNotepad.editRecord(3, ""));
        assertFalse(myNotepad.editRecord(-1, ""));
        assertFalse(myNotepad.editRecord(third, ""));
    }

    @org.junit.jupiter.api.Test
    void readAllRecords() {
        Notepad myNotepad = new Notepad();
        myNotepad.addRecord(new NotepadRecord("first"));
        myNotepad.addRecord(new NotepadRecord("second"));
        myNotepad.addRecord(new NotepadRecord(""));
        myNotepad.addRecord(new NotepadRecord("WOOW"));
        assertEquals("first\nsecond\n\nWOOW\n", myNotepad.readAllRecords());

        myNotepad = new Notepad();
        assertEquals(myNotepad.readAllRecords(), "");
    }

    @org.junit.jupiter.api.Test
    void readRecord() {
        Notepad myNotepad = new Notepad();
        myNotepad.addRecord(new NotepadRecord("first"));
        assertNotEquals("first", myNotepad.readRecord(new NotepadRecord("first")));
        assertNull(myNotepad.readRecord(new NotepadRecord("first")));
        assertNull(myNotepad.readRecord(0));
        assertNull(myNotepad.readRecord(2));

        NotepadRecord second = new NotepadRecord("second");
        myNotepad.addRecord(second);
        assertEquals("second", myNotepad.readRecord(second));
        assertEquals("second", myNotepad.readRecord(2));
    }
}