package model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.PriorityQueue;

public class PresentAction {
    private String name;
    private PriorityQueue<Toys> presents;
    File file;

    public PresentAction(String name) {
        this.name = name;
        this.presents = new PriorityQueue<>(new ToyComparator());
        this.file = new File(this.name + ".txt");
    }
    public void addPresent(Toys toy){
        this.presents.add(toy);

    }

    public void getPresent(){
        try(FileWriter fw = new FileWriter(this.file, true)) {
            fw.write(this.presents.poll().toString()+"\n");
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }

    public void printPresents(){
        Toys toy ;
        while((toy = this.presents.poll())!=null){
            System.out.println(toy);
        }
    }
}
