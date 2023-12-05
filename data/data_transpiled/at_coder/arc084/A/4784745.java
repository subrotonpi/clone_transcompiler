public static int [ ] getN ( ) {
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] B = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    B [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] C = new int [ N ] ;
  Arrays . sort ( A ) ;
  Arrays . sort ( B ) ;
  Arrays . sort ( C ) ;
  int ans = 0 ;
  int [ ] midNum = new int [ N ] ;
  int index = 0 ;
  for ( int i = 0 ;
  i < B . length ;
  i ++ ) {
    do {
      if ( index == N || A [ index ] >= B [ i ] ) {
        midNum [ index ] = i ;
        break ;
      }
      else index ++ ;
    }
    while ( i < C [ i ] ) ;
  }
  System . out . println ( ans ) ;
  return midNum ;
}
