public class str {
    public static void main(String[] args) {
        String name = new StringBuilder("ALI").append("mohammad").toString(); // ترکیب دو رشته 
        System.out.println(name.length()); // len method  
        String age = "eighteen";
        String SubAge = age.substring(0,3);
        System.out.println(SubAge); // sub string creator 
        // 'index of' that returns an int
        String s1 = "what the hell is heli ?";
        int index = s1.indexOf("the");
        int index1 = s1.indexOf("heli");
        System.out.println(index);
        System.out.println(index1);
        String theString = "is this good or is this bad?";
        String substring = "is"; 
        //'indexof' takes another parameter that starts from that
        int index2 = theString.indexOf(substring);
        while(index2 != -1) {
            System.out.println(index2);
            index2 = theString.indexOf(substring, index2 + 1);
        }
        //'lastindex' method 
        String sd = "alie man kojast ? ";
        System.out.println(sd.lastIndexOf("?"));        
        // comparing strings 
        String one = "abc";
        String two = "def" ; 
        String three = "ABC";
        System.out.println(one.equals(two)); // false
        System.out.println(one.equals(three)); // false 
        System.out.println(two.equals(three)); // false 
        System.out.println(one.equals(one)); // true
        System.out.println("-------------------");
        // ignore case method 
        System.out.println(one.equalsIgnoreCase(three)); // true 
        String four = "AbC";
        System.out.println(one.equalsIgnoreCase(four)); // true 
        // starts with and ends with 
        System.out.println("-------------------");
        String one1 = "This is a good day to code";
        System.out.println( one1.startsWith("This"));
        System.out.println( one1.startsWith("This",10));
        System.out.println("-------------------");
        // compare to that returns an int 
        System.out.println(""); // bored more than you think ! 

        // trimming 
        String text    = "  And he ran across the field   ";
        String trimmed = text.trim();
        System.out.println(trimmed); 
        // soon will updated ! i will back! 
}        
}
