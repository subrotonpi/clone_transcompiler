public static int A , B ;
int i ;
A = Integer . parseInt ( input . nextLine ( ) ) ;
B = Integer . parseInt ( input . nextLine ( ) ) ;
if ( ( i = A ) == ( i = B ) ) {
  System . out . println ( "Draw" ) ;
}
else if ( ( i = A ) == ( i = 1 ) ) {
  System . out . println ( "Alice" ) ;
}
else if ( ( i = B ) == ( i = B ) ) {
  System . out . println ( "Bob" ) ;
}
else if ( ( i = A ) > ( i = B ) ) {
  System . out . println ( "Alice" ) ;
}
else {
  System . out . println ( "Bob" ) ;
}
return i ;
}
