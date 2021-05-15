package com.olympic.cis143.m04.student.tacotruck.set;

import java.util.HashSet;
import java.util.Set;


public class OrdersSetImpl  implements Orders {

    //set of tacos
    Set<TacoImpl> tacoset = new HashSet<TacoImpl>();


    @Override
    public void addOrder(TacoImpl tacoOrder) {
      tacoset.add(tacoOrder);
    }

    @Override
    public boolean hasNext() {
        if(tacoset.size() > 0){
          return true;
        }else{
          return false;
        }
    }

    @Override
    public TacoImpl closeNextOrder() {
        TacoImpl taco = tacoset.iterator().next();
        if(tacoset.size() > 0){
         tacoset.remove(taco);
         return taco;
        }
        return taco;
    }

    @Override
    public int howManyOrders() {
        return tacoset.size();
    }
}
