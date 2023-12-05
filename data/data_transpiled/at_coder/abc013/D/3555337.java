public static int [ ] [ ] f ( int N , int M , int D ) {
  int [ ] A = Integer . parseInt ( input ( ) ) ;
  int [ ] a = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a [ i ] = i + 1 ;
  }
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int ex = A [ i ] - 1 ;
    a [ ex ] = a [ ex + 1 ] ;
  }
  int [ ] [ ] d = new int [ 32 ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    d [ 0 ] [ a [ i ] ] = i + 1 ;
  }
  for ( int i = 2 ;
  i < 31 ;
  i += 2 ) {
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      d [ i ] [ j + 1 ] = d [ i - 2 ] [ d [ i - 2 ] [ d [ i - 2 ] [ j + 1 ] ] ] ;
    }
  }
  return d ;
}
