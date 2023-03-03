public static int a , int b , int c ;
int i ;
a = Integer . parseInt ( input . nextLine ( ) ) ;
b = Integer . parseInt ( input . nextLine ( ) ) ;
c = Integer . parseInt ( input . nextLine ( ) ) ;
if ( a + b == c ) {
  if ( a - b == c ) System . out . println ( "?" ) ;
  else System . out . println ( "+" ) ;
}
else {
  if ( a - b == c ) System . out . println ( "-" ) ;
  else System . out . println ( "!" ) ;
}
return i ;
}
