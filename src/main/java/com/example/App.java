package com.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Statement;
import com.hp.hpl.jena.rdf.model.StmtIterator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Model m = ModelFactory.createDefaultModel();
        try {
            m.read(new FileInputStream(new File(args[1])), null, args[0]);
            // m.write(System.out, "TTL");
            System.out.println("=========================================");
            StmtIterator  siter = m.listStatements();
            FileOutputStream fo = new FileOutputStream(new File(args[2]));
            while(siter.hasNext()){
                Statement s = siter.next();
                // System.out.println(s.getSubject().toString() + "\t" +
                //                                 s.getPredicate().toString() + "\t" +
                //                                 s.getObject().toString());
                fo.write(new String(s.getSubject().toString() + " " +
                s.getPredicate().toString() + " " +
                s.getObject().toString() + "\n").getBytes());
            }
            fo.flush();
            fo.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
