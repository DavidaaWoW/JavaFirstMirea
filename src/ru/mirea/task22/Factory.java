package ru.mirea.task22;

public class Factory {
    public Chair getChair(Client.chair Chair_){
        Chair chair = null;
        switch (Chair_){
            case Magic:
                chair = new MagicChair();
                break;
            case Victorian:
                chair = new VictorianChair();
                break;
            case Multifunctional:
                chair = new MultifunctionalChair();
                break;
        }
        return chair;
    }
}
