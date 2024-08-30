package org.anup.creational.singletone.doublechecklocking;

import javax.xml.crypto.Data;

public class DataBaseConnection {

    private static volatile DataBaseConnection dataBaseConnection = null;
    // volatile keyword ensure that changes made to the instance variable are visible to all threads.
    private DataBaseConnection(){}

    public static DataBaseConnection getInstance() {
        //Double Check locking
        if (dataBaseConnection == null) { //I. Check
            synchronized (DataBaseConnection.class) { // II. Acquire lock // We can use lock also in place of synchronized block.
                if (dataBaseConnection == null) { // III. Check again
                    dataBaseConnection = new DataBaseConnection();
                }
            }
        }
        return dataBaseConnection;
    }

    //Will work in multithreaded environment.

    //Issues :-
    //Slow performance.
}