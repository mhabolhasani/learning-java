public class field {
    public static void main(String[] args) {
        field cl = new field();
        learn me = cl.new learn();
        learn you = cl.new learn();
        me.point = 1;
        System.out.println(me.point);
        System.out.println(learn.point);
        you.point = 2; 
        System.out.println(you.point);
        System.out.println(me.point);

    }
    // [access_modifier] [static] [final] type name [= initial value]. 
    // in brackets are additional.
    public class learn {
        // defining static fields in class (they can changed).
        static int point = 0 ;
        int age;
        String name;

        public learn(int age,String name){
            this.age = age;
            this.name = name;
            //additional constructor
        }
        public learn(){
            //defaul constructor
        }
    }
}