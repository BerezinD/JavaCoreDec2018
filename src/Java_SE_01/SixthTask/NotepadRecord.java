package Java_SE_01.SixthTask;

class NotepadRecord {

    private String record;
    private int recordNumber = -1;

    NotepadRecord(String record) {
        this.record = record;
    }


    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record;
    }

    public int getRecordNumber() {
        return recordNumber;
    }

    public void setRecordNumber(int recordNumber) {
        this.recordNumber = recordNumber;
    }
}
