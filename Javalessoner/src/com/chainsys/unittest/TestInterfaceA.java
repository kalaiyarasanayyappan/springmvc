package com.chainsys.unittest;

import edu.lessons.oop.interfaces.InterfaceA;
import edu.lessons.oop.interfaces.InterfaceCImpl;

public class TestInterfaceA {
    
        public static void main(String[] args) 
        {
            InterfaceA.echo();
            InterfaceA a1=new InterfaceCImpl();
            a1.print();
            a1.print("Hello");
        }
    }
