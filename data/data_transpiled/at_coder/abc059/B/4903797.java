[ ] ;
for ( int i = 0 ;
i < 2 ;
i ++ ) {
  ab [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( ( ab [ 0 ] > ab [ 1 ] ) && ( ab [ 1 ] < ab [ 2 ] ) ) {
    System . out . println ( "GREATER" ) ;
  }
  else if ( ( ab [ 0 ] < ab [ 1 ] ) && ( ab [ 1 ] < ab [ 2 ] ) ) {
    System . out . println ( "LESS" ) ;
  }
  else {
    System . out . println ( "EQUAL" ) ;
  }
}
