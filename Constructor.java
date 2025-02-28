class Show
{
    public void Show()//deafult constructor as no parameters are passed
    {
          System.out.println("in default constructor");
    }
    public void Show(String s)//parameterised constructor
    {
        System.out.println("hello " + s);
    }
}


public class Constructor
{
    public static void main(String[] args) 
    {
        Show obj = new Show();
    }
}












// class Greet{
//     String name;
    
//        public Greet(String name)//parameterized constructor
//        {
//            // System.out.println("enter your name:"); 
//            //Scanner input = new Scanner(System.in);
//            this.name=name;
//        }
   
//        public Greet() //default constructor
//        {
   
//           System.out.println("in default constru");
//        }
   

       
   
//        public void hello()
//        {
//            System.out.println("hello " +this.name + " , how are you!!");
//        }
   
//        public String getName() {
//            return name;
//        }
   
//     }
   
   
//    public class Constructor
//    {
//        public static void main(String[] args) 
//        {   
//            System.out.println("enter your name:"); 
//           // Scanner input = new Scanner(System.in);
//            //String name = input.nextLine();

//            Greet obj=new Greet(name);
//            obj.hello();
//           // Scanner input=new Scanner(System.in);
//        }
//    }