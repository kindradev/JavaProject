
public class Test {
    public static void main(String[] args) {
        try {
            StudentService serv = new StudentService();
            serv.getNameBySid(null);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

class StudentService {
    String getNameBySid(String sid) throws StudentNotFoundException{
        if (sid == null || sid.isEmpty())
            throw new StudentNotFoundException(sid);
        else
            return "Indar";
    }
}

class StudentNotFoundException extends RuntimeException {
    //String sid;

    StudentNotFoundException(String sid) {
        super(sid);

    }
   /* public String getMessage(){
        return sid;*/
}

