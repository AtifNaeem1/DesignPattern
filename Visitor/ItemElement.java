package com.Visitor;

// The element interface declares an `accept` method that takes
// the base visitor interface as an argument.

interface ItemElement {
    public int accept(ShoppingCartVisitor visitor);
}


