package Java_SE_01.SixthTask;

import com.sun.istack.internal.Nullable;

import java.util.ArrayList;

/**
 * This class use for collect records in notepad
 * @author BerezinD
 * @version 2.0
 * from <i>11.12.2013</i>
 */
public class Notepad {

    private ArrayList<NotepadRecord> records = new ArrayList<>();
    private int countOfRecords = 0;

    /**
     * Add new NotepadRecord to array of records
     * @param record it's a record for our Notepad
     *               Type is NotepadRecord, that keep some string
     * @return true, if we can add it and we don't add it before
     */
    public boolean addRecord(NotepadRecord record){
        if (record.getRecordNumber() == -1) {
            record.setRecordNumber(countOfRecords);
            countOfRecords++;
            return records.add(record);
        }
        else return false;
    }

    /**
     * Delete record by the its number
     * and mark existing NotepadRecord as not use
     * and re-indexing all others
     * @param recordNumber index (from 1 to end) of existing record
     * @return true if we can delete it
     */
    public boolean delRecord(int recordNumber){
        if (recordNumber >= 1 && recordNumber <= records.size()){
            records.get(recordNumber-1).setRecordNumber(-1);
            records.remove(recordNumber-1);
            countOfRecords--;

            for (int i = recordNumber-1; i < countOfRecords; i++) {
                records.get(i).setRecordNumber(i);
            }

            return true;
        }
        return false;
    }

    /**
     * Delete record by the its number
     * and mark existing NotepadRecord as not use
     * and re-indexing all others
     * @param record object that we wanna delete
     * @return true if we can delete it
     */
    public boolean delRecord(NotepadRecord record){
        if (records.contains(record)){
            records.remove(record);
            countOfRecords--;

            for (int i = record.getRecordNumber(); i < countOfRecords; i++) {
                records.get(i).setRecordNumber(i);
            }

            record.setRecordNumber(-1);
            return true;
        }
        return false;
    }

    /**
     * Edit existing record by replacing old string to newRecord string
     * @param recordNumber index (from 1 to end) of existing record
     * @param newRecord new record - new string value
     * @return true if edit were correct
     */
    public boolean editRecord(int recordNumber, String newRecord){
        if (recordNumber >= 1 && recordNumber <= records.size()){
            records.get(recordNumber-1).setRecord(newRecord);
            return true;
        }
        return false;
    }

    /**
     * Edit existing record by replacing old string to newRecord string
     * @param record object that we wanna edit
     * @param newRecord new record - new string value
     * @return true if edit were correct
     */
    public boolean editRecord(NotepadRecord record, String newRecord){
        if (records.contains(record)){
            record.setRecord(newRecord);
            return true;
        }
        return false;
    }

    /**
     * Method to collect all records from Notepad to one string
     * with \n on the end of each
     * @return single string, contains all records, separated by "enter"
     */
    public String readAllRecords(){
        String result = "";
        for (NotepadRecord note: records){
            result += note.getRecord();
            result += "\n";
        }
        return result;
    }

    /**
     * Read record with record index (from 1 to end - place in the Notepad)
     * @param recordNumber - it's a place of record in Notepad
     * @return record (string) from Notepad or NULL if record not exist
     */
    @Nullable
    public String readRecord(int recordNumber){
        return
                (recordNumber <= records.size() && recordNumber >= 1) ?
                        records.get(recordNumber-1).getRecord() : null;
    }

    /**
     * Read the firs record that contains exactly the same object
     * @param record object that we search
     * @return string of record or NULL if record not exist
     */
    @Nullable
    public String readRecord(NotepadRecord record){
        return records.contains(record) ? record.getRecord() : null;
    }

}
