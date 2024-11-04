package practise.recordAndPojo;

public class Main {
    public static void main(String[] args){
        UseOfRecord record = new UseOfRecord("un", 29, "yahoo1yahoo@gmai.com");
        System.out.println("Using record: \n" + record);

        practiseRecordVsPojo pojo = new practiseRecordVsPojo("rin", 25,"linrin11@gmail.com" );
        System.out.println("POJO :\n" + pojo);

    }


}
