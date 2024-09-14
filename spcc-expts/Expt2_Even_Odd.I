%option noyywrap
%{
    #include<stdio.h>
    #include<stdlib.h>
%}


%%
[0-9]+    {
             int number = atoi(yytext);
             if (number % 2 == 0)
                 printf("Entered number is even\n");
             else
                 printf("Entered number is odd\n");
          }

%%

int main()
{
    printf("Enter Number: ");
    yylex();
    return 0;
}
