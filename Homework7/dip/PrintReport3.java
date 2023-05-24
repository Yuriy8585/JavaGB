package Homework7;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class PrintReport3 extends Output {

    @Override
    public void output(List<ReportItem> items) {
        String fileName = "Homework7/dip/order.txt";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            for (ReportItem item : items) {
                writer.write("printer " + item.getDescription() + " - " + item.getAmount() + "\n");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
