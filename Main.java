import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

class Admin_Teacher{
    Scanner input = new Scanner(System.in);
    private String Teacher_name;
    private int Teacher_id;
    private int Teacher_password;
    private int Teacher_age;
    private String Teacher_number;
    private String Teacher_Father_Name;
    private String Teacher_location;
    private String Teacher_Subject;
    int Length = 0;
    public void teacher(){
    try{
        System.out.println("1->Add");
        System.out.println("2->View");
        System.out.println("3->Search");
        System.out.println("4->Edit");
        System.out.println("5->Delete");
        System.out.println("6->Back");
        System.out.println("7->Exit");
        System.out.println("Enter your choice: ");
            int ch = input.nextInt();
            switch (ch) {
                case 1:
                    Add();
                    teacher();
                    break;
                case 2:
                    View();
                    teacher();
                    break;
                case 3:
                    Search();
                    teacher();
                    break;
                case 4:
                    Edit();
                    teacher();
                    break;
                case 5:
                    Delete();
                    teacher();
                    break;
                case 6:
                    Management management = new Management();
                    management.Main();
                    break;
                case 7:
                    Exit();
                    break;
                default:
                    System.out.println("Ivalid choice ... !");
                    teacher();
                    break;
            }
        }
        catch(Exception e){
            System.out.println("Something Went Wrong...!");
            teacher();
        }
    
        }
       private static LinkedList<String> NameList = new LinkedList<String>();
       private static LinkedList<Integer>IDList =  new LinkedList<Integer>();
       private static LinkedList<Integer>PasswordList = new LinkedList<Integer>();
       private static LinkedList<Integer> AgeList = new LinkedList<Integer>();
       private static LinkedList<String> PhoneList = new LinkedList<String>();
       private static LinkedList<String> FatherList = new LinkedList<String>();
       private static LinkedList<String> LocationList = new LinkedList<String>();
       private static LinkedList<String> Subject_List  = new LinkedList<String>();
    public static LinkedList<String> getNameList() {
        return NameList;
    }
    public static void setNameList(String nameList) {
        NameList.add(nameList);
    }
    public static LinkedList<Integer> getIDList() {
        return IDList;
    }
    public static void setIDList(int iDList) {
        IDList.add(iDList);
    }
    public static LinkedList<Integer> getPasswordList(){
        return PasswordList;
    }
    public static void setPasswordList(int password){
        PasswordList.add(password);

    }
    public static LinkedList<Integer> getAgeList() {
        return AgeList;
    }
    public static void setAgeList(int  ageList) {
        AgeList.add(ageList);
    }
    public static LinkedList<String> getPhoneList() {
        return PhoneList;
    }
    public static void setPhoneList(String phoneList) {
        PhoneList.add(phoneList);
    }
    public static LinkedList<String> getFatherList() {
        return FatherList;
    }
    public static void setFatherList(String fatherList) {
        FatherList.add(fatherList);
    }
    public static LinkedList<String> getLocationList() {
        return LocationList;
    }
    public static void setLocationList(String locationList) {
        LocationList.add(locationList);
    }
    public static LinkedList<String> getSubject_List() {
        return Subject_List;
    }
    public static void setSubject_List(String subject_List) {
        Subject_List.add(subject_List);
    }
        public void Add(){
            try{
            System.out.println("How many Teacher you want's to Enter : ");
            int n = input.nextInt();
            for(int i=0;i<n;i++){
                System.out.println("Enter Teacher Name: ");
                Teacher_name = input.next();
                setNameList(Teacher_Father_Name);
                System.out.println("Enter Teacher I'D: ");
                Teacher_id = input.nextInt();
            
                setIDList(Teacher_id);
                System.out.println("Enter Password ");
                Teacher_password = input.nextInt();
                setPasswordList(Teacher_password);
                System.out.println("Enter Teacher Age: ");
                Teacher_age = input.nextInt();
                setAgeList(Teacher_age);
                System.out.println("Enter Teacher phone numher: ");
                Teacher_number = input.next();
                setPhoneList(Teacher_number);
                System.out.println("Enter Teacher Father name: ");
                Teacher_Father_Name = input.next();
                setFatherList(Teacher_Father_Name);
                System.out.println("Enter Teacher Location: ");
                Teacher_location = input.next();
                setLocationList(Teacher_location);
                System.out.println("Enter Teacher Subject");
                Teacher_Subject = input.next();
                setSubject_List(Teacher_Subject);
                
            }
        }
        catch(Exception e){
            System.out.println("Something Went Wron...!");
            Add();

        }
        }
        public void View(){
            for(int i=0;i<Length;i++){
                System.out.println("Name: "+ NameList.get(i));
                System.out.println("I'D: "+ IDList.get(i));
                System.out.println("Age: "+ AgeList.get(i));
                System.out.println("Phone Number: "+ PhoneList.get(i));
                System.out.println("Father Name: "+ FatherList.get(i));
                System.out.println("Location: "+ LocationList.get(i));
                System.out.println("Class: "+ Subject_List.get(i));
                System.out.println("-----------------------------------");
    
                if (IDList.indexOf(i) == 0) {
                    System.out.println("Not found in Data...!");
                    teacher();
                    break;
                    
                }
            }
        }
        public void Search() {
            System.out.println("Enter ID: ");
            int searchId = input.nextInt(); 
            
            boolean found = false; 
            for (int i = 0; i < Length; i++) {
                if (searchId == IDList.get(i)) { 
                    System.out.println("--------------------------");
                    System.out.println(" Name: "+ NameList.get(i));
                    System.out.println(" I'D: "+ IDList.get(i));
                    System.out.println(" Age: "+ AgeList.get(i));
                    System.out.println(" Phone Number: "+ PhoneList.get(i));
                    System.out.println(" Father Name: "+ FatherList.get(i));
                    System.out.println(" Location: "+ LocationList.get(i));
                    System.out.println(" Class: "+ Subject_List.get(i));
                    System.out.println("--------------------------");
                    System.out.println("\n");
    
                    System.out.println("Are you wan't Search another Teacher(yes/no): ");
                    String an = input.nextLine();
                    if(an == "yes")
                    {
                        Search();
                    }
                    else if(an == "no"){
                        teacher();
                    }
                    else{
                        System.out.println("Something Went Wrong .....!");
                        teacher();
    
                    }
                            found = true;
                            break; 
                }
            }
            
            if (!found) {
                System.out.println("ID not found.");
            }
        }
        
        public void Edit(){
            try{
            System.out.println("Enter ID: ");
            int searchId = input.nextInt(); 
            
            boolean found = false; 
            for (int i = 0; i < Length; i++) {
                if (searchId == IDList.get(i)) { 
                    found = true;
                    System.out.println("--------------------------");
                    System.out.println(" Name: "+ NameList.get(i));
                    System.out.println(" I'D: "+ IDList.get(i));
                    System.out.println(" Age: "+ AgeList.get(i));
                    System.out.println(" Phone Number: "+ PhoneList.get(i));
                    System.out.println(" Father Name: "+ FatherList.get(i));
                    System.out.println(" Location: "+ LocationList.get(i));
                    System.out.println(" Subject: "+ Subject_List.get(i));
                    System.out.println("--------------------------");
                    System.out.println("\n");
    
                    System.out.println("What you wan't to Edit");
                    System.out.println("1->Name");
                    System.out.println("2->I'D");
                    System.out.println("3->Age");
                    System.out.println("4->Phone Number ");
                    System.out.println("5->Father Name ");
                    System.out.println("6->Location ");
                    System.out.println("7->Subject ");
                    System.out.println("What you wan't to Edit: ");
                    int ch = input.nextInt();
                   switch (ch) {
                    case 1:
                        System.out.println("Enter new name: ");
                        String new_name = input.next();
                        NameList.set(i, new_name);
                        break;
                    case 2:
                        System.out.println("Enter new I'D: ");
                        int new_id = input.nextInt();
                        IDList.set(i,new_id);
                        break;
                    case 3:
                        System.out.println("Enter new Age: ");
                        int new_Age = input.nextInt();
                        AgeList.set(i, new_Age);
                        break;
                    case 4:
                        System.out.println("Enter new Phone Number");
                        String new_phone = input.next();
                        PhoneList.set(i, new_phone);
                        break;
                    case 5:
                        System.out.println("Enter Father Name:");
                        String updated_Father_Name = input.next();
                        FatherList.set(i, updated_Father_Name);
                        break;
                    case 6:
                        System.out.println("Enter new Location: ");
                        String updated_location = input.next();
                        LocationList.set(i, updated_location);
                        break;
                    case 7: 
                        System.out.println("Enter new class: ");
                        String new_class = input.next();
                        Subject_List.set(i, new_class);
                        break;
                    default:
                        System.out.println("Invalid Choice...!");
                        teacher();
                        break;
                   }
                    System.out.println("Do you wan't Edit another student(yes/no): ");
                    String an = input.next();
                    if(an.equals("yes"))
                    {
                        Edit();
                    }
                    else if(an.equals("no")){
                        teacher();
                    }
                    else{
                        System.out.println("Something Went Wrong .....!");
                        teacher();
    
                    }
                            break;
                }
            }
            
            if (!found) {
                System.out.println("ID not found.");
            }
        }
         catch (Exception e) {
            System.out.println("Something Went Wrong...!");
            Edit();
        }
        }
        public void Delete(){
            try{
            System.out.println("Enter ID: ");
            int searchId = input.nextInt(); 
            
            boolean found = false; 
            for (int i = 0; i < Length; i++) {
                if (searchId == IDList.get(i)) {
                    IDList.remove(i);
                    NameList.remove(i);
                    AgeList.remove(i);
                    PhoneList.remove(i);
                    FatherList.remove(i);
                    LocationList.remove(i);
                    Subject_List.remove(i);
        
                    System.out.println("Teacher with ID " + searchId + " has been deleted.");
                    found = true;
                    break;
                }
            }
        
            if (found) {
                System.out.println("Do you want to delete another Teacher? (yes/no): ");
                String an = input.nextLine();
                if (an.equalsIgnoreCase("yes")) {
                    Delete();
                } else if (an.equalsIgnoreCase("no")) {
                    teacher();
                } else {
                    System.out.println("Invalid input. Returning to the main menu...");
                    teacher();
                }
            } 
            else {
                System.out.println("ID not found.");
            }
        }
        catch(Exception e){
            System.out.println("Something Went Wrong....!");
            Management management = new Management();
            management.Main();
        }
        }
    public void Exit()
    {
        System.out.println("Exiting program...");
        System.exit(0);
    }

}
class Teacher extends Admin_Teacher{
    Scanner sc = new Scanner(System.in);
    public void login() {
        try {
            System.out.print("Enter your ID: ");
            int new_id = sc.nextInt();
            System.out.print("Enter Password: ");
            int new_password = sc.nextInt();
    
            boolean found = false;
    
            for (int i = 0; i < getIDList().size(); i++) {
                if (new_id == getIDList().get(i) && new_password == getPasswordList().get(i)) {
                    found = true;
    
                    while (true) {
                        System.out.println("\n1-> ADD Assignment");
                        System.out.println("2->Edit Assignment");
                        System.out.println("3->Delete Assignment");
                        System.out.println("4->Back");
                        System.out.println("5->Exit");
                        System.out.print("Enter your choice: ");
                        int choice = sc.nextInt();
    
                        switch (choice) {
                            case 1:
                                Add_Assignment();
                                break;
                            case 2:
                                Edit_Assignments();
                                break;
                            case 3:
                                Delete();
                                break;
                            case 4:
                                 Management management = new Management();
                                 management.Main();
                            case 5:
                                System.out.println("Exiting...");
                                return;
                            default:
                                System.out.println("Invalid choice, please try again.");
                                Admin admin = new Admin();
                                admin.admin(new_id, new_password);
                        }
                    }
                }
            }
    
            if (!found) {
                System.out.println("Invalid ID or Password!");
                Admin admin = new Admin();
                admin.admin(new_id, new_password);
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input.");
            Management management = new Management();
            management.Main();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            login();
        }
    }

    private static LinkedList<Integer> Assignment_Marks_Result_List = new LinkedList<Integer>();
    private static LinkedList<Integer> Sesional_Marks_Result_List = new LinkedList<Integer>();
    private static LinkedList<Integer> Final_Marks_Result_List = new LinkedList<Integer>();
    private static LinkedList<Integer> Mid_Term_Result_List = new LinkedList<Integer>();
    private static LinkedList<Integer> Total_Marks = new LinkedList<Integer>();
    public static LinkedList<Integer> getTotal_Marks() {
        return Total_Marks;
    }
    public static void setTotal_Marks(int total_Marks) {
        Total_Marks.add(total_Marks);
    }
    public  LinkedList<Integer> getAssignment_Marks_Result_List() {
        return Assignment_Marks_Result_List;
    }
    public  void setAssignment_Marks_Result_List(int assignment_Marks_Result_List) {
        Assignment_Marks_Result_List.add(assignment_Marks_Result_List);
    }
    public  LinkedList<Integer> getSesional_Marks_Result_List() {
        return Sesional_Marks_Result_List;
    }
    public  void setSesional_Marks_Result_List(int sesional_Marks_Result_List) {
        Sesional_Marks_Result_List.add(sesional_Marks_Result_List);
    }
    public  LinkedList<Integer> getFinal_Marks_Result_List() {
        return Final_Marks_Result_List;
    }
    public  void setFinal_Marks_Result_List(int final_Marks_Result_List) {
        Final_Marks_Result_List.add(final_Marks_Result_List);
    }
    public  LinkedList<Integer> getMid_Term_Result_List() {
        return Mid_Term_Result_List;
    }
    public static void setMid_Term_Result_List(int mid_Term_Result_List) {
        Mid_Term_Result_List.add(mid_Term_Result_List);
    }
    public void Add_Assignment(){
    try{
         Scanner input = new Scanner(System.in);
        System.out.println("Enter Subject Code in Which you want to Add Marks");
        int subject_code = input.nextInt();
        Student student = new Student();
        boolean found = false;
        for(int i=0;i<student.getStudentsSubjectsList().size();i++){
            if(subject_code == student.getStudentsSubjectsList().get(i)){
                found = true;
                    System.out.println("Enter Assignment Marks: ");
                    int assignments_marks = input.nextInt();
                    setAssignment_Marks_Result_List(assignments_marks);
                    System.out.println("Enter Sessional Marks: ");
                    int sessional_marks = input.nextInt();
                    setSesional_Marks_Result_List(sessional_marks);
                    System.out.println("Enter Mid_Term Marks: ");
                    int mid_term_marks = input.nextInt();
                    setMid_Term_Result_List(mid_term_marks);
                    System.out.println("Enter Final Term marks: ");
                    int final_term_marks = input.nextInt();
                    setFinal_Marks_Result_List(final_term_marks);
                    int Total = assignments_marks + sessional_marks + mid_term_marks + final_term_marks ;
                    setTotal_Marks(Total);
                    login();

            }
            else{
                System.out.println("Not found...!");
                login();
            }
        }
    }
        catch(Exception e){
            System.out.println("Something Went Wrong...!");
            Add_Assignment();

        }
    }

    public void Edit_Assignments(){
    try{
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Subject Code in Which you want to Add Marks");
        int subject_code = input.nextInt();
        Student student = new Student();
        boolean found = false;
        for(int i=0;i<student.getStudentsSubjectsList().size();i++){
            if(subject_code == student.getStudentsSubjectsList().get(i)){
                found = true;
                    System.out.println("Enter Updated Assignment Marks: ");
                    int new_assignment_Marks = input.nextInt();
                    Assignment_Marks_Result_List.set(i, new_assignment_Marks);
                    System.out.println("Enter Updated Sesional  Marks: ");
                    int new_Sesional__Marks = input.nextInt();
                    Sesional_Marks_Result_List.set(i, new_Sesional__Marks);
                    System.out.println("Enter Updated Final_Term Marks: ");
                    int new_Final_Marks = input.nextInt();
                    Final_Marks_Result_List.set(i, new_Final_Marks);
                    System.out.println("Enter Updated Mid_Term Marks: ");
                    int new_Mid_Marks = input.nextInt();
                    Mid_Term_Result_List.set(i, new_Mid_Marks);
                    int Total = new_assignment_Marks + new_Mid_Marks + new_Sesional__Marks + new_Final_Marks;
                    setTotal_Marks(Total);
                    System.out.println("Updated Succesfully..!");
                    login();

            }
            else{
                System.out.println("Not found...!");
                login();
            }
        }
    }
    catch(Exception e){
        System.out.println("Something Went Wrong...!");
        Edit_Assignments();
    }
}
    public void Delete() {
    try{
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Subject Code in Which you want to Add Marks");
        int subject_code = input.nextInt();
        Student student = new Student();
        boolean found = false;
        for(int i=0;i<student.getStudentsSubjectsList().size();i++){
        if(subject_code == student.getStudentsSubjectsList().get(i)){
            found = true;
                setAssignment_Marks_Result_List(0);
                setFinal_Marks_Result_List(0);
                setMid_Term_Result_List(0);
                setSesional_Marks_Result_List(0);
                int Total = 0;
                setTotal_Marks(Total);
                System.out.println("Updated Succesfully..!");
                login();

        }
        else{
            System.out.println("Not found...!");
            login();
        }
    }
}
catch(Exception e){
    System.out.println("Something Went Wrong...!");
    Delete();
}
}

}
class Admin_Student{
    Scanner sc = new Scanner(System.in);
    private String name;
    private int id;
    private int age;
    private String number;
    private String Father_Name;
    private String location;
    private int Class;
    private int Password;
    int Length = 0;
    public void student(){
        System.out.println("1->Add");
        System.out.println("2->View");
        System.out.println("3-> Search");
        System.out.println("4->Edit");
        System.out.println("5->Delete");
        System.out.println("6->Back");
        System.out.println("7->Exit");
        System.out.println("Enter your choice: ");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                Add();
                student();
                break;
            case 2:
                View();
                student();
                break;
            case 3:
                Search();
                student();
                break;
            case 4:
                Edit();
                break;
            case 5:
                Delete();
                break;
            case 6 :
                Admin admin = new Admin();
                admin.admin(0, 0);
                break;
            case 7:
                Exit();
                break;
            default:
            System.out.println("Ivalid Choice: ");
                Management management = new Management();
                management.Main();
                break;
        }

    }
    private static LinkedList<String>  NameList = new LinkedList<String>();
    private static LinkedList<Integer> PasswordList = new LinkedList<Integer>();
    private static LinkedList<Integer> IDList =  new LinkedList<Integer>();
    private static LinkedList<Integer> AgeList = new LinkedList<Integer>();
    private static LinkedList<String>  PhoneList = new LinkedList<String>();
    private static LinkedList<String>  FatherList = new LinkedList<String>();
    private static LinkedList<String>  LocationList = new LinkedList<String>();
    private static LinkedList<Integer> ClassList  = new LinkedList<Integer>();
    
   
    public LinkedList<String> getNameList() {
        return NameList;
    }
    public void setNameList(String nameList) {
        NameList.add(nameList);

    }
    public LinkedList<Integer> getPasswordList() {
        return PasswordList;
    }
    public void setPasswordList(int passwordList) {
        PasswordList.add(passwordList);
    }
    public LinkedList<Integer> getIDList() {
        return IDList;
    }
    public void setIDList(int iDList) {
         IDList.add(iDList);
    }
    public LinkedList<Integer> getAgeList() {
        return AgeList;
    }
    public void setAgeList(int ageList) {
        AgeList.add(ageList);
    }
    public LinkedList<String> getPhoneList() {
        return PhoneList;
    }
    public void setPhoneList(String phoneList) {
        PhoneList.add(phoneList);
    }
    public LinkedList<String> getFatherList() {
        return FatherList;
    }
    public void setFatherList(String fatherList) {
        FatherList.add(fatherList);
    }
    public LinkedList<String> getLocationList() {
        return LocationList;
    }
    public void setLocationList(String locationList) {
        LocationList.add(locationList);
    }
    public LinkedList<Integer> getClassList() {
        return ClassList;
    }
    public void setClassList(int classList) {
        ClassList.add(classList);
    }
    public void Add(){
        try {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many Students you want's to Enter : ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter Student Name: ");
            name = sc.next();
            setNameList(name);
            System.out.println("Enter Student I'D: ");
            id = sc.nextInt();
            setIDList(id);
            System.out.println("Set Password: ");
            Password = sc.nextInt();
            setPasswordList(Password);
            System.out.println("Enter Student Age: ");
            age = sc.nextInt();
            setAgeList(age);
            System.out.println("Enter phone numher: ");
            number = sc.next();
            setPhoneList(number);
            System.out.println("Enter Father name: ");
            Father_Name = sc.next();
            setPhoneList(Father_Name);
            System.out.println("Enter Location: ");
            location = sc.next();
            setLocationList(location);
            System.out.println("Enter Class");
            Class = sc.nextInt();
            setClassList(Class);
        }
    }
    catch(InputMismatchException e){
            System.err.println("Something went wrong..!");
            Add();
    }
    }
    public void View(){
        for(int i=0;i<Length;i++){
            System.out.println("Name: "+ getNameList().get(i));
            System.out.println("I'D: "+ getIDList().get(i));
            System.out.println("Age: "+ getAgeList().get(i));
            System.out.println("Phone Number: "+ getPhoneList().get(i));
            System.out.println("Father Name: "+ getFatherList().get(i));
            System.out.println("Location: "+ getLocationList().get(i));
            System.out.println("Class: "+ getClassList().get(i));
            System.out.println("-----------------------------------");

            if (IDList.indexOf(i) == 0) {
                System.out.println("Not found in Data...!");
                student();
                break;
                
            }
        }
    }

    public void Search() {
        System.out.println("Enter ID: ");
        int searchId = sc.nextInt();
        boolean found = false; 
        for (int i = 0; i < Length; i++) {
            if (searchId == IDList.get(i)) { 
                System.out.println("--------------------------");
                System.out.println(" Name: "+ NameList.get(i));
                System.out.println(" I'D: "+ IDList.get(i));
                System.out.println(" Age: "+ AgeList.get(i));
                System.out.println(" Phone Number: "+ PhoneList.get(i));
                System.out.println(" Father Name: "+ FatherList.get(i));
                System.out.println(" Location: "+ LocationList.get(i));
                System.out.println(" Class: "+ ClassList.get(i));
                System.out.println("--------------------------");
                System.out.println("\n");

                System.out.println("Are you wan't Search another student(yes/no): ");
                String an = sc.next();
                if(an == "yes")
                {
                    Search();
                }
                else if(an == "no"){
                    student();
                }
                else{
                    System.out.println("Something Went Wrong .....!");
                    student();

                }
                        found = true;
                        break; 
            }
        }
        
        if (!found) {
             System.out.println("ID not found.");
        }
    }
    
    public void Edit(){
        try{
        System.out.println("Enter ID: ");
        int searchId = sc.nextInt(); 
        
        boolean found = false; 
        for (int i = 0; i < Length; i++) {
            if (searchId == IDList.get(i)) { 
                found = true;
                System.out.println("--------------------------");
                System.out.println(" Name: "+ NameList.get(i));
                System.out.println(" I'D: "+ IDList.get(i));  
                System.out.println(" Age: "+ AgeList.get(i));
                System.out.println(" Phone Number: "+ PhoneList.get(i));
                System.out.println(" Father Name: "+ FatherList.get(i));
                System.out.println(" Location: "+ LocationList.get(i));
                System.out.println(" Class: "+ ClassList.get(i));
                System.out.println("--------------------------");
                System.out.println("\n");

                System.out.println("What you wan't to Edit");
                System.out.println("1->Name");
                System.out.println("2->I'D");
                System.out.println("3->Age");
                System.out.println("4->Phone Number ");
                System.out.println("5-> Father Name ");
                System.out.println("6-> Location ");
                System.out.println("7-> Class ");
                System.out.println("What you wan't to Edit: ");
                int ch = sc.nextInt();
               switch (ch) {
                case 1:
                    System.out.println("Enter new name: ");
                    String new_name = sc.next();
                    NameList.set(i, new_name);
                    break;
                case 2:
                    System.out.println("Enter new I'D: ");
                    int new_id = sc.nextInt();
                    IDList.set(i,new_id);
                    break;
                case 3:
                    System.out.println("Enter new Age: ");
                    int new_Age = sc.nextInt();
                    AgeList.set(i, new_Age);
                    break;
                case 4:
                    System.out.println("Enter new Phone Number");
                    String new_phone = sc.next();
                    PhoneList.set(i, new_phone);
                    break;
                case 5:
                    System.out.println("Enter Father Name:");
                    String updated_Father_Name = sc.next();
                    FatherList.set(i, updated_Father_Name);
                    break;
                case 6:
                    System.out.println("Enter new Location: ");
                    String updated_location = sc.next();
                    LocationList.set(i, updated_location);
                    break;
                case 7: 
                    System.out.println("Enter new class: ");
                    int new_class = sc.nextInt();
                    ClassList.set(i, new_class);
                    break;
                default:
                    System.out.println("Invalid Choice...!");
                    student();
                    break;
               }
                System.out.println("Do you wan't Edit another student(yes/no): ");
                String an = sc.next();
                if(an.equals("yes"))
                {
                    Edit();
                }
                else if(an.equals("no")){
                    student();
                }
                else{
                    System.out.println("Something Went Wrong .....!");
                    student();

                }
                        break;
            }
        }
        
        if (!found) {
            System.out.println("ID not found.");
        }
    }
    catch(Exception e){
        System.out.println("Something Went Wrong....!");
        Edit();
    }
    }
    public void Delete(){
        try{
        System.out.println("Enter ID: ");
        int searchId = sc.nextInt(); 
        
        boolean found = false; 
        for (int i = 0; i < Length; i++) {
            if (searchId == IDList.get(i)) {
                IDList.remove(i);
                NameList.remove(i);
                AgeList.remove(i);
                PhoneList.remove(i);
                FatherList.remove(i);
                LocationList.remove(i);
                ClassList.remove(i);
    
                System.out.println("Student with ID " + searchId + " has been deleted.");
                found = true;
                break;
            }
        }
    
        if (found) {
            System.out.println("Do you want to delete another student? (yes/no): ");
            String an = sc.nextLine();
            if (an.equalsIgnoreCase("yes")) {
                Delete();
            } else if (an.equalsIgnoreCase("no")) {
                student();
            } else {
                System.out.println("Invalid input. Returning to the main menu...");
                student();
            }
        } 
        else {
            System.out.println("ID not found.");
        }
    }
    catch(Exception e){
        System.out.println("Something Went Wrong....!");
        Delete();
    }
    }
public void Exit()
{
    System.out.println("Program Exit ...");
                System.exit(0);
}
}


class Student extends Admin_Student {
    Scanner sc = new Scanner(System.in);
    private static LinkedList<Integer> studentsSubjectsList = new LinkedList<Integer>();
    
    
    public LinkedList<Integer> getStudentsSubjectsList() {
        return studentsSubjectsList;
    }


    public void setStudentsSubjectsList(int subjects) {
            studentsSubjectsList.add(subjects);
    }


    public void login() {
      try{
        System.out.println("    Login Account    \n");
        System.out.print("Enter ID: ");
        int newId = sc.nextInt();
        System.out.print("Enter Password: ");
        int newPassword = sc.nextInt();

        boolean isAuthenticated = false;
        for (int i = 0; i < getIDList().size(); i++) {
            if (newId == getIDList().get(i) && newPassword == getPasswordList().get(i)) {
                isAuthenticated = true;
                displayMenu();
                break;
            }
        }

        if (!isAuthenticated) {
            System.out.println("Invalid ID or Password!");
            Management management = new Management();
            management.Main(); 
        }
    }
    catch(Exception e){
        System.out.println("Spmethionng Went Wrong...!");
        login();
    }
    }

    
    private void displayMenu() {
        while (true) {
            System.out.println("\n1 -> Enroll Subjects");
            System.out.println("2 -> View Assignments");
            System.out.println("3 -> Drop Subjects");
            System.out.println("4-> Back");
            System.out.println("5 -> Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    enrollSubjects();
                    break;
                case 2:
                    viewAssignments(); 
                    break;
                case 3:
                    dropSubjects(); 
                    break;
                case 4:
                    Management management = new Management();
                    management.Main();
                    break;
                case 5:
                    System.out.println("Program Exit Succefully");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
                    displayMenu();
            }
        }
    }

    public void enrollSubjects() {
        try{
        System.out.print("How many subjects do you want to enroll in? ");
        int numberOfSubjects = sc.nextInt();
        sc.nextLine(); 

        for (int i = 1; i <= numberOfSubjects; i++) {
            System.out.print("Enter Subject Code " + i + ": ");
            int subjectCode = sc.nextInt();
            setStudentsSubjectsList(subjectCode);
        }
        System.out.println("Subjects enrolled successfully!");
    }
    catch(Exception e){
        System.out.println("Someting Went Wrong ...!");
        enrollSubjects();
    }
    }

    private void viewAssignments() {
        boolean found =false;
        Teacher teacher = new Teacher();
        for(int i=0;i<getStudentsSubjectsList().size();i++){
            System.out.println(getStudentsSubjectsList().get(i));
            System.out.println("Assignments: " + teacher.getAssignment_Marks_Result_List().get(i));
            System.out.println("Sessional_Marks:"+ teacher.getSesional_Marks_Result_List().get(i));
            System.out.println("Mid_Term Marks: " + teacher.getMid_Term_Result_List().get(i));
            System.out.println("Final Term Marks: "+ teacher.getFinal_Marks_Result_List().get(i));
            System.out.println("Total Marks: "+ teacher.getTotal_Marks().get(i));   
            System.out.println("-----------------------------------------------------");
        }
    }

    private void dropSubjects() {
        try{
        System.out.println("Enter ID: ");
        int newId = sc.nextInt();
        System.out.println("Enter Password: ");
        int newPassword = sc.nextInt();
        boolean isAuthenticated = false;
        for (int i = 0; i < getIDList().size(); i++) {
            if (newId == getIDList().get(i) && newPassword == getPasswordList().get(i)) {
                isAuthenticated = true;
                System.out.println("Enter Subject code which you want to drop: ");
                int cod = sc.nextInt();
                for(int j=0;j<studentsSubjectsList.size();j++){
                    if(cod  == studentsSubjectsList.get(j)){
                        studentsSubjectsList.remove();
                        System.out.println("Subject Drop Succesfully..!");
                        System.out.println("Do you want drop another subject Yes or No");
                        String ch = sc.next();
                        if(ch == "yes" || ch == "YES" || ch == "Yes"){
                            dropSubjects();

                        }
                        else if(ch == "No" || ch == "no"|| ch == "NO") {
                            Management management = new Management();
                            management.Main();
                        }
                        else{
                            System.out.println("Invalid...!");
                            Management management = new Management();
                            management.Main();
                        }
                    }
                }
                

                }

                
                break;
            }
        

        if (!isAuthenticated) {
            System.out.println("Invalid ID or Password!");
            Management management = new Management();
            management.Main(); 
        }
    }
    catch(Exception e){
        System.out.println("Something Went Wrong...!");
        dropSubjects();
    }
    }

}



class Admin{
            private String name;
            private int id;
            private int age;
            private int password;
            private int Login_Id;
            private int Login_Password;
          
              public int getId() {
                  return id;
              }
          
              public void setId(int id) {
                  this.id = id;
              }
              public int getAge() {
                  return age;
              }
          
              public void setAge(int age) {
                  this.age = age;
              }
          
              public int getPassword() {
                  return password;
              }
          
              public void setPassword(int password) {
                  this.password = password;
              }
          
              public String getName() {
                  return name;
              }
          
              public void setName(String name) {
                  this.name = name;
              }
              Scanner sc= new Scanner(System.in);
              public void admin(int id,int password){
                      System.out.println("1->Create Account ");
                      System.out.println("2-> Login Account");
                      System.out.println("3-> back");
                      System.out.println("4.Exit");
                      System.out.println("Enter your Choice: ");
                      int ch = sc.nextInt();
                      switch (ch) {
                          case 1:
                              Create_Account();
                              break;
                          case 2:
                              login(id,password);
                              break;
                          case 3:
                              Management manage = new Management();
                              manage.Main();
                              break;
                          case 4: 
                              System.out.println("Exit");
                              break;
                          default:
                              System.out.println("Enter Correct choice ");
                              admin(id,password);
                              break;
                      }
              }
          
              public void Create_Account(){
                  System.out.println("Enter Your Name: ");
                  name = sc.next();
                  System.out.println("Enter your I'D: ");
                  id = sc.nextInt();
                  System.out.println("Enter your Age: ");
                  age = sc.nextInt();
                  System.out.println("Set Password");
                  password = sc.nextInt();
                  admin(id,password);
              }
                 
              //if Alreay Account creaeted then login
              public void login(int ID,int Password){
                   ID = 131;
                   Password = 123;
                  
                  System.out.println("Enter I'D: ");
                  Login_Id = sc.nextInt();
                  System.out.println("Enter Password: ");
                  Login_Password = sc.nextInt();
                  if(Login_Id == ID && Login_Password == Password){
                      System.out.println("1->Add Student");
                      System.out.println("2->Add Teacher");
                      System.out.println("Enter your choice: ");
                      int ch = sc.nextInt();
                      switch (ch) {
                          case 1:
                              Admin_Student student = new Admin_Student();
                              student.student();
                              break;
                          case 2:
                              Admin_Teacher teacher = new Admin_Teacher();
                              teacher.teacher();
                              break;
                          case 3: 
                          System.out.println("Exit");
                          break;
                          default:
                              System.out.println("Sorry we can't found it...!");
                              login(ID,Password);
                              break;
                      }
                  }
                  
                  else {
                      System.out.println("Please try again...!");
                      login(ID,Password);
                  }
              }
          }
          
class Management{
    public void Main(){
                try{
                  System.out.println("Welcome to Stduent Management System ");
                  System.out.println("1->Admin");
                  System.out.println("2->Student");
                  System.out.println("3->Teacher");
                  System.out.println("4->Exit");
                  System.out.println("Enter choice : ");
                  Scanner sc =new Scanner(System.in);
                  int ch = sc.nextInt();
                  switch (ch) {
                      case 1:
                          Admin admin = new Admin();
                          admin.admin(0,0);
                          break;
                      case 2:
                           Student student = new Student();
                           student.login();
                           break;
                    case 3:
                            Teacher teacher = new Teacher();
                            teacher.login();
                            break;
                    case 4:
                        exit();
                        break;
                    default:
                        System.out.println("Invalid...!");
                        Main();
                        break;
        }
    }
    catch(InputMismatchException e){
        System.out.println("invalid input..!");
        Management management = new Management();
        management.Main();
    }
    }
  public void exit(){
        System.out.println("Program Exit...!");
        System.exit(0);

    }
}

public class Main {

    public  static void main(String[] args){
        Management m = new Management();
        m.Main();
        
    }
}
