
package reserve;

public class Book extends Name{
    
    private int RoomNum;
    
    
    public void setRoom(int RoomNum){
        this.RoomNum = RoomNum;
    }
    
    public int getRoom(){
        return RoomNum;
    }
   
    @Override
    public String getFname(){
       return (super.getFname() );
    }
    
    @Override
    public String getLname(){
        return (super.getLname());
    }

}
