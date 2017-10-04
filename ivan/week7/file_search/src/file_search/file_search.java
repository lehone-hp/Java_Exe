package file_search;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.io.IOException;

public class file_search {
    static String searchlin(Path p,String a) {
    	String b=" ";
    	if(Files.isDirectory(p)) {
            try{
            	DirectoryStream<Path> pd= Files.newDirectoryStream(p);
                for(Path i : pd) {
                	//System.out.printf("searching for %s in %s\n",a,i.toString());
                    if((i.toString()).equalsIgnoreCase(p.toString()+"/"+a)) {
                	    b=i.toString();
                	    break;
                    }
                    else
                        if(Files.isDirectory(i)) {
                        	b=searchlin(i,a);
                        	if(b.startsWith("/"))
                        		break;
                        }      
                }
            }
            catch(IOException e) {
            	System.out.printf("%s \n",e);
            }
        }
        return (b.equals(" "))?("File not found."):b;
    }
    static String searchwin(Path p,String a) {
    	String b=" ";
    	if(Files.isDirectory(p)) {
            try{
            	DirectoryStream<Path> pd= Files.newDirectoryStream(p);
                for(Path i : pd) {
                    //System.out.printf("searching for %s in %s\n",a,p.toString());
                    if((i.toString()).equalsIgnoreCase((p.toString()).endsWith("\\")?(p.toString()+a):(p.toString()+"\\"+a))) {
                	    b=i.toString();
                	    break;
                    }
                    else
                        if(Files.isDirectory(i)) {
                        	b=searchlin(i,a);
                        	if(b.startsWith("C"))
                        		break;
                        }      
                }
            }
            catch(IOException e) {
            	System.out.printf("%s\n",e);
            }
        }
        return (b.equals(" "))?("File not found."):b;
    }
    public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
    	Path l= Paths.get("/home");
        Path w= Paths.get("C:\\");
        int i;
        System.out.printf("which operating system are you using 1:linux 2:Windows :");
        try{
            i=input.nextInt();
        }
        catch(InputMismatchException e){
            System.out.printf("%s",e);
            return;
        }
    	System.out.printf("Enter the name of the file you are searching for in the home directory  :");
        String c=input.nextLine();
        String a=input.nextLine();
        System.out.printf("\nSearching for %s \n",a);
        System.out.printf("\n%s\n",(i==1)?searchlin(l,a):searchwin(w,a));
    }
}
