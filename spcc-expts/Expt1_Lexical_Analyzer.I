%option noyywrap
%{
    #include<stdio.h>
%}

%s A B

%%
<INITIAL>0 BEGIN A;
<INITIAL>1 BEGIN INITIAL;
<INITIAL>[^0|\n] BEGIN B;
<INITIAL>\n BEGIN INITIAL; printf("String is accepted\n");
<A>0 BEGIN INITIAL;
<A>1 BEGIN A;
<A>[^0|\n] BEGIN B;
<A>\n BEGIN INITIAL; printf("String is rejected\n");
<B>0 BEGIN B;
<B>1 BEGIN B;
<B>[^0|\n] BEGIN B;
<B>\n BEGIN INITIAL; printf("Invalid input\n");
%%

int main()
{
    yylex();
    return 0;
}
