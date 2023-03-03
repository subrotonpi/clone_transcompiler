public static int a , int b , int c ;
int A = Integer . parseInt ( input . nextLine ( ) ) ;
int B = Integer . parseInt ( input . nextLine ( ) ) ;
if ( A == c && B == c ) {
  System . out . println ( "?" ) ;
}
else if ( A == c && B != c ) {
  System . out . println ( "+" ) ;
}
else if ( A != c && B == c ) {
  System . out . println ( "-" ) ;
}
else {
  System . out . println ( "!" ) ;
}
return A + B ;
}
