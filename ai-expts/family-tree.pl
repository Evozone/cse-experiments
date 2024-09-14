# Family tree of a family
male(chandrakant).
male(sitaram).
male(krishnaraj).
male(ganpat).
male(rahul).
male(raj).

female(radha).
female(parubai).
female(laxmi).
female(meena).

parent_of(chandrakant, sitaram).
parent_of(sitaram, rahul).
parent_of(radha, laxmi).
parent_of(radha, ganpat).
parent_of(parubai, rahul).
parent_of(krishnaraj, meena).
parent_of(laxmi, meena).
parent_of(rahul, raj).
parent_of(meena, raj).

father_of(X,Y):- male(X), parent_of(X,Y).
mother_of(X,Y):- female(X), parent_of(X,Y).

child_of(X,Y):- parent_of(Y,X).

son_of(A,B):- male(A), child_of(A,B).
daughter_of(A,B):- female(A), child_of(A,B).

sibling_of(X,Y):- parent_of(Z,X), parent_of(Z,Y), X\=Y.

brother_of(X,Y):- male(X), sibling_of(X,Y).
sister_of(X,Y):- female(X), sibling_of(X,Y).

grandfather_of(X,Y):- father_of(X,Z), parent_of(Z,Y).
grandmother_of(X,Y):- mother_of(X,Z), parent_of(Z,Y).

grandchild_of(X,Y):- parent_of(Y,Z), parent_of(Z,X).

grandson_of(X,Y):- male(X), grandchild_of(X,Y).
granddaughter_of(X,Y):- female(X), grandchild_of(X,Y).

married_to(X,Y):- parent_of(X,Z), parent_of(Y,Z), X\=Y.

husband_of(X,Y):- male(X), married_to(X,Y).
wife_of(X, Y):- female(X), married_to(X,Y).

uncle_of(X,Y):- brother_of(X,Z), parent_of(Z,Y).
aunt_of(X,Y):- sister_of(X,Z), parent_of(Z,Y).
