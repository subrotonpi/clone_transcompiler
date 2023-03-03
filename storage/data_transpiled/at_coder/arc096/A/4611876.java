public static int [ ] A ( ) {
  int [ ] result = new int [ 4 ] ;
  for ( int i = 0 ;
  i < result . length ;
  i ++ ) {
    result [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  if ( 2 * result [ 2 ] < result [ 0 ] + result [ 1 ] ) {
    int m = Math . min ( result [ 3 ] , result [ 4 ] ) ;
    System . out . println ( result [ 2 ] * m * 2 + ( result [ 3 ] - m ) * Math . min ( result [ 0 ] , 2 * result [ 2 ] ) + ( result [ 4 ] - m ) * Math . min ( result [ 1 ] , 2 * result [ 2 ] ) ) ;
  }
  else {
    System . out . println ( result [ 3 ] * result [ 0 ] + result [ 4 ] * result [ 1 ] ) ;
  }
  return result ;
}
