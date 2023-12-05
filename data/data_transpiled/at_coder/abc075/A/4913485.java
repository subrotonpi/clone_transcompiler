public static int a , int b , int c ;
int a = Integer . parseInt ( input . readLine ( ) ) ;
int b = Integer . parseInt ( input . readLine ( ) ) ;
int c = Integer . parseInt ( input . readLine ( ) ) ;
if ( ( a == b ) && ( c == a ) ) {
  System . out . println ( c ) ;
}
else if ( ( b == c ) && ( a == a ) ) {
  System . out . println ( a ) ;
}
else {
  System . out . println ( b ) ;
}
return a ;
}
