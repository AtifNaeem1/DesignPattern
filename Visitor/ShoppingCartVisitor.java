package com.Visitor;

// The Visitor interface declares a set of visiting methods that
// correspond to element classes.

interface ShoppingCartVisitor {

    int visit(Book book);

    int visit(Fruit fruit);
}
