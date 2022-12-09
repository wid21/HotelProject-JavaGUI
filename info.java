import java.io.*;

public class info
{
    private String name ;
    private String id ;
    private String phone;
    private String email;
    private float roomPrice;
    private String roomType;
    private String bookingDate ;
    private String bookingtime ;
    private String cardt;
    private String cardN;
    private String code;
    private String codeD;
    private String RoomNO;

    public boolean writeFile() {
          try{
              FileWriter file = new FileWriter("bill.txt", true);
              BufferedWriter bufferedWriter = new BufferedWriter(file);
              bufferedWriter.write(this.getName() + ",");
              bufferedWriter.write(this.getId() + ",");
              bufferedWriter.write(this.getPhone() + ",");
              bufferedWriter.write(this.getEmail() + ",");
              bufferedWriter.write(this.getRoomType() + ",");
              bufferedWriter.write(this.getRoomNO() + ",");
              bufferedWriter.write(this.getRoomPrice() + ",");
              bufferedWriter.write(this.getBookingDate() + ",");
              bufferedWriter.write(this.getBookingtime() + ",");
              bufferedWriter.write(this.getCardt() + ",");
              bufferedWriter.write(this.getCardN() + ",");
              bufferedWriter.write(this.getCode() + ",");
              bufferedWriter.write(this.getCodeD() + ",");

              bufferedWriter.write("\n");
              bufferedWriter.close();
              return true;
          } catch (IOException ioException) {
              return false;
          }

    }

    public String[] ReadFile(){
        String[] booking = new String[13];
        try {
            BufferedReader csvReader = new BufferedReader(new FileReader("bill.txt"));
            String row ;

            while ((row= csvReader.readLine()) != null) {
                booking = row.split(",");
            }
            csvReader.close();
            return booking;
        }
        catch (IOException e1) {
            System.out.println("Error:" + e1.getMessage());
            return booking;
        }
    }







    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(float roomPrice) {
        this.roomPrice = roomPrice;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getBookingtime() {
        return bookingtime;
    }

    public void setBookingtime(String bookingtime) {
        this.bookingtime = bookingtime;
    }

    public String getCardN() {

        return cardN;
    }

    public void setCardN(String cardN) {

        this.cardN = cardN;
    }

    public String getCode() {

        return code;
    }

    public void setCode(String code) {

        this.code = code;
    }

    public String getCodeD() {
        return codeD;
    }

    public void setCodeD(String codeD) {
        this.codeD = codeD;
    }

    public String getRoomNO() {
        return RoomNO;
    }

    public void setRoomNO(String roomNO) {
        RoomNO = roomNO;
    }

    public String getCardt() {
        return cardt;
    }

    public void setCardt(String cardt) {
        this.cardt = cardt;
    }
}
