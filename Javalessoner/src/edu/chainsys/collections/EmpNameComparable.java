package edu.chainsys.collections;

import java.util.Comparator;

public class EmpNameComparable  implements Comparator<EmpComparable>{

    @Override
    public int compare(EmpComparable o1, EmpComparable o2) {
          int result=0;
          result=0;
          result=o1.Name.compareTo(o2.Name);
        return result;
    }

    
    
}
