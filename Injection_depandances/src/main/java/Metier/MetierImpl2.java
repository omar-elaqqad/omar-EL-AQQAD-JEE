package Metier;

import Dao.IDao;

public class MetierImpl2 implements IMetier{

    IDao dao;

    MetierImpl2(){
    }

    public MetierImpl2(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calculate() {
        return 0;
    }
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}