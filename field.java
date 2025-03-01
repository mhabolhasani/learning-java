public class field {
    public static void main(String[] args) {
        field cl = new field();
        learn me = cl.new learn();
        learn you = cl.new learn();
        me.point = 1;
        System.out.println(learn.point);
        you.point = 2; // it will changed for all because it is the only one !
        System.out.println(you.point);
        System.out.println(me.point);

    }

    // [access_modifier] [static] [final] type name [= initial value]. 
    // in brackets are additional.

    public class learn {
        // defining static fields in class (they can changed).

        static int point = 0 ;
        //access modifier.

        private String email;
        String position;   //no modifier = package access modifier
        protected String name;
        public String city;

        // final fields 
        final String field1 = "fixed value";
        // static final set for unchangable fixed.
        static final String FixedValue = "fixes"; // or like colors in 'color' class
        // defining constructor
        public learn(String email,String name,String city){
            this.email = email;
            this.name = name;
            this.city = city;
        }
        public learn(){}
    }
}