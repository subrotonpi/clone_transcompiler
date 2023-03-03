public static int a , int b , int c ;
int a = Integer . parseInt ( input . readLine ( ) ) ;
int b = Integer . parseInt ( input . readLine ( ) ) ;
int c = Integer . parseInt ( input . readLine ( ) ) ;
if ( ( a + b == c ) && ( a - b == c ) ) {
  System . out . println ( "?" ) ;
}
else if ( ( a + b == c ) && ( a - b == c ) ) {
  System . out . println ( "+" ) ;
}
else if ( ( a - b == c ) && ( a - c == c ) ) {
  System . out . println ( "-" ) ;
}
else {
  System . out . println ( "!" ) ;
}
return a ;
}
