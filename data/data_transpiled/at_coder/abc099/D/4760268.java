static final int [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] ) {
  int N = Integer . parseInt ( input [ 0 ] [ 0 ] ) ;
  int C = Integer . parseInt ( input [ 1 ] [ 0 ] ) ;
  int [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] = new int [ C ] [ N ] [ 3 ] [ 3 ] [ 3 ] [ 3 ] ;
  for ( int i = 0 ;
  i < C ;
  i ++ ) {
    Arrays . sort ( [ ] [ ] ) ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int [ ] [ ] s = new int [ N ] [ ] [ ] [ ] ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      s [ j ] = Integer . parseInt ( input [ 1 ] [ 0 ] ) - 1 ;
    }
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      L [ ( i + j ) % 3 ] [ s [ j ] ] ++ ;
    }
  }
  int ans = Integer . MIN_VALUE ;
  for ( int [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] ) {
    int kans = Integer . valueOf ( sum ( [ D [ i ] [ 0 ] [ 0 ] [ 0 ] ] [ ] ) * sum ( [ D [ i ] [ 1 ] [ 0 ] [ 0 ] ] ) * sum ( [ D [ i ] [ 1 ] [ 1 ] [ 0 ] ] ) ) ;
    ans = Math . min ( ans , kans ) ;
  }
  System . out . println ( ans ) ;
}
