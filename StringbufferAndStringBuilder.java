package project;

public class StringbufferAndStringBuilder {

	public static void main(String[] args) {
		//StringBuffer
        StringBuffer sb = new StringBuffer("String Buffer"); 
        System.out.println(sb);
        sb.append("Hello World");
        System.out.println(sb);
        sb.append(55);
        System.out.println("---------------------");
        //StringBuilder 
        StringBuilder sb1=new StringBuilder(" String Builder "); 
        sb1.append(" My Name is khan "); 
        sb1.append(" sharukh khan ");
        System.out.println(sb1);             
	}
}
