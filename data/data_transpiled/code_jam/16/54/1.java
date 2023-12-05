public static String convert ( int t ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  /* inverse of the string */
  char [ ] inverse = new char [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    inverse [ i ] = Character . forDigit ( input . nextLine ( ) ) ;
  }
  /* chapeau of the string */
  if ( inverse . length == 0 ) {
    return "" ;
  }
  int u = 0 ;
  while ( u < inverse . length && inverse [ u ] == inverse [ 0 ] ) {
    u ++ ;
  }
  if ( u == inverse . length ) {
    return inverse [ 0 ] ;
  }
  char [ ] rem = new char [ u ] ;
  System . arraycopy ( inverse , 0 , rem , 0 , u ) ;
  return inverse [ 0 ] + inverse [ i ] + inverse [ i ] + chapeau ( rem ) ;
}
