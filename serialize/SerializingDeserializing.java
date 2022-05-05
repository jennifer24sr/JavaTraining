package serialize;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import expense.*;

public class SerializingDeserializing   {
    public void Serilizing() {
        try {
            Employee emp = new Employee("Sowmya", "sowmya@gmail.com", 4567, "hdh", "black");
            FileOutputStream fileOut = new FileOutputStream("file.txt");
            ObjectOutputStream outStr = new ObjectOutputStream(fileOut);
            outStr.writeObject(emp);
            outStr.flush();
            outStr.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void Deserilizing(){
        try{
            FileInputStream fileIn = new FileInputStream("file.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Employee e = (Employee)in.readObject();
            System.out.println(e.getUserId() + " " +e.getName());
            fileIn.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }

    
}
