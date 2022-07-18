package com.ChainOfResponsibility;

//Chain of Responsibility is a behavioral design pattern
//that lets you pass requests along a chain of handlers.
//Upon receiving a request, each handler decides either to
//process the request or to pass it to the next handler in the chain.

public interface Chain {

        // Defines the next Object to receive the data
        // if this Object can't process it
        public void setNextChain(Chain nextChain);


        // Either solves the problem or passes the data
         public void calculate(Numbers request);
}
