@ VisibleForTesting static Statistics statistics ( int n , int r ) {
  final int [ ] a = new int [ 4 ] ;
  int [ ] b = new int [ 4 ] ;
  int [ ] c = new int [ 4 ] ;
  int i ;
  int j = 0 ;
  if ( q == 1 ) System . out . println ( "Yay!" ) ;
  else System . out . println ( ":(" ) ;
  exit ( 0 ) ;
  /* ct */
  if ( ( a [ 0 ] > a [ 2 ] ) && ( a [ 1 ] < a [ 3 ] ) ) c [ 0 ] = '-' ;
  else if ( ( a [ 0 ] < a [ 2 ] ) && ( a [ 3 ] < a [ 3 ] ) ) c [ 1 ] = '+' ;
  else if ( ( a [ 0 ] < a [ 1 ] ) && ( a [ 3 ] > a [ 3 ] ) ) c [ 2 ] = '-' ;
  else System . out . println ( "?" ) ;
  /* ip */
  return new Statistics ( ) {
    @ Override public int [ ] printRow ( ) {
      for ( int i = 0 ;
      i < a . length ;
      i ++ ) System . out . println ( a [ i ] ) ;
      return a ;
    }
    @ Override public int [ ] combinations ( int n , int r ) {
      if ( n < r ) return 0 ;
      return Math . factorial ( n ) / ( Math . factorial ( n - r ) * Math . factorial ( r ) ) ;
    }
    @ Override public int [ ] permutations ( int n , int r ) {
      if ( n < r ) return 0 ;
      return Math . factorial ( n ) / Math . factorial ( n - r ) ;
    }
  }
  ;
}
