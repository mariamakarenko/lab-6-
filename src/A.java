import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class A{
    HashMap<Integer,String> a = new HashMap<>();
    Random rand  = new Random();
    public void mapping(){
        for (int i = 0; i<10; i++){
            a.put(i,random_name());
        }
    }

    public String random_name(){
        String name = "abcdrfghijklmopqrstuvwxyz";
        String names = "";
        for(int i = 0; i < rand.nextInt(10); i++){
            names += name.charAt(rand.nextInt(10));
        }
        return names;
    }

    public void outall(){
        System.out.println(a.values());
    }
    public void out(int number) {
        a.get(number);
    }
}