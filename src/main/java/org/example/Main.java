package org.example;

import db.Database;
import org.hibernate.Session;

public class Main {
    public static void main(String[] args) {
        Session session = Database.getHibSesh();

        //Tasks tasks = session.find(Tasks.class, 1);
        //System.out.println(tasks);
        //Tasks.deleteTasks(1);
        //Tasks tasks = session.find(Tasks.class, 1);
        //System.out.println(tasks);
        //Tasks tasks = new Tasks("test","test2","2022-12-10",true);


}
}