package org.anup.creational.singletone.eagerloading;

public class DataBaseConnection {

    private static final DataBaseConnection dataBaseConnection = new DataBaseConnection();
    //static : The variable belongs to the class rather than any specific instance of the class. This means that there is only one copy of the variable, shared by all instances of the class.
    //final : The variable's value cannot be changed once it has been initialized. In other words, it can be assigned only once.
    private DataBaseConnection(){}

    public static DataBaseConnection getInstance() {
        return dataBaseConnection;
    }

    //Will work in multithreaded environment provide thread safety.

    //Issues :-

    //1. In case we have more Singleton classes like this, then app startup will increase as well not memory efficient if the instance is not always needed.
    //2. We can't pass any attribute inside the constructor.
}
