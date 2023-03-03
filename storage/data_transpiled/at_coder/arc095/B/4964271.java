static final int N = Integer . parseInt ( input ) {
  final int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( A ) ;
  /* Calculate the number of letters in the list */
  for ( int n = 0 ;
  n < A . length ;
  n ++ ) {
    A [ n ] = A [ n ] / ( Math . factorial ( n - r ) * Math . factorial ( r ) ) ;
  }
  if ( A . length == 2 ) {
    System . out . println ( A [ 1 ] ) ;
    System . out . println ( A [ 0 ] ) ;
  }
  final int half = A [ A . length - 1 ] / 2 ;
  for ( int i = 0 ;
  i < N - 2 ;
  i ++ ) {
    if ( Math . abs ( A [ i ] - half ) >= Math . abs ( A [ i + 1 ] - half ) && Math . abs ( A [ i + 2 ] - half ) <= Math . abs ( A [ i + 2 ] - half ) ) {
      System . out . println ( A [ A . length - 1 ] ) ;
      System . out . println ( A [ i + 1 ] ) ;
      exit ( ) ;
    }
  }
  return A . length ;
}
