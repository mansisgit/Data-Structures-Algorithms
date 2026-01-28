
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SalaryCalc {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String inputFile = "employee.txt";
        String validFile = "valid_employee.txt";
        String errorFile = "error_log.txt";

        try {
            BufferedReader br = new BufferedReader
                    (new FileReader("c:/dyp/"+inputFile));
            BufferedWriter bw = new BufferedWriter
                    (new FileWriter("c:/dyp/"+validFile));
            BufferedWriter ew = new BufferedWriter
                    (new FileWriter("c:/dyp/"+errorFile));

            String line;
            while((line = br.readLine()) != null) {
                String[] data = line.split(",");

                try {
                    int id = Integer.parseInt(data[0]);
                    String name = data[1];
                    float salary = Float.parseFloat(data[2]);

                    float bonus = (float) (salary * 0.05);
                    bw.write(id +","+name+","+salary+","+bonus);
                    bw.newLine();
                }
                catch(NumberFormatException nf) {
                    ew.write("Invalid employee data"+ line);
                    ew.newLine();
                }
            }
            ew.close(); bw.close(); br.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("completed...");
    }

}

