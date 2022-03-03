package filehandling;
import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
public class FileHandling {
	public static List<String> readFileInList(String fileName){ 
	  
	    List<String> lines = Collections.emptyList(); 
	    try{ 
	      lines = 
	       Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8); 
	    } 
	      catch (IOException e){ 
	      e.printStackTrace(); 
	    } 
	    return lines; 
	  } 
	public static void main(String[] args)  throws IOException, InterruptedException{
		String cont = "y";
		while(cont.equalsIgnoreCase("Y")) {
		System.out.println("1.Add the data");
		System.out.println("2.Read the data");
		System.out.println("3.Append the data");
		System.out.println("Enter the number ");
		Scanner sc1=new Scanner(System.in);
		int choose=sc1.nextInt();
		
		if(choose==1){
		File file=new File("c:\\hello\\addedfile.txt");
		if(file.createNewFile()){
			System.out.println("New File is Created");   
		}
		else {
			System.out.println("File already Exists");
		}
		 
        FileWriter writer = new FileWriter(file);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Content you want to add in the created file:");
        String str=sc.nextLine();
        writer.write(str);
        writer.flush();
        writer.close();
        System.out.println("Entered Content added to the file");
        System.out.println("Do you want to continue? y/n");
      	 cont = sc.nextLine();
		}
		
		else if(choose==2) {
        System.out.println("Reading the content in the file.....");
        Thread.sleep(2000);
        List li=readFileInList("c:\\hello\\addedfile.txt");
        Iterator<String> it=li.iterator();
        while(it.hasNext())
        	System.out.println(it.next());
        System.out.println("Do you want to continue? y/n");
        Scanner sc=new Scanner(System.in);
      	 cont = sc.nextLine();
		}
       
		else if(choose==3){
			System.out.println("Append the data");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the data to append :");
			String str=sc.nextLine();
        List<String> lines = Arrays.asList("\n"+str);
        Files.write(Paths.get("c:\\hello\\addedfile.txt"),
                     lines,
                     StandardCharsets.UTF_8,
                     StandardOpenOption.CREATE,
                     StandardOpenOption.APPEND);
        System.out.println("data append completed");
        System.out.println("Do you want to continue? y/n");
        
      	 cont = sc.nextLine();
            }
         }
	 }
 }