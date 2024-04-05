public class Ex4_4 {
    String title; 
    String author; 
    
    public Ex4_4 () { // 생성자 
        title = "해리포터"; author = "잘 몰라 "; 
    }
        public Ex4_4(String t) { // 생성자 
        title = t; author = "작자미상";
    }

    public Ex4_4(String t, String a) { // 생성자
        title = t; author = a;
    }
    
    public static void main(String [] args) { 
        Ex4_4 FOO = new Ex4_4(); 
        Ex4_4 lovestory = new Ex4_4("춘향전"); 
        Ex4_4 littlePrince = new Ex4_4("어린왕자", "생텍쥐페리"); 
        System.out.println(FOO.title + " " + FOO.author); 
        System.out.println(lovestory.title + " " + lovestory.author); 
        System.out.println(littlePrince.title+" " + littlePrince.author);
    }
}
