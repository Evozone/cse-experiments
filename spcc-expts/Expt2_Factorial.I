%option noyywrap

%{
#include<stdio.h>
#include<stdlib.h>
%}

%%
[0-9]+ {int number = atoi(yytext), fact = 1, i = 1;
    if (number != 0 || number != 1){
        for (int i = 2; i <= number; i++){
            fact *= i;
        }
    }
    printf("The factorial is %d", fact);
}

%%

int main()
{
    printf("Enter Number: ");
    yylex();
    return 0;
}
