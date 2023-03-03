public static int [ ] [ ] readInput ( ) {
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int M = Integer . parseInt ( input . readLine ( ) ) ;
  int D = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] A = new int [ N + 1 ] ;
  for ( int a = 0 ;
  a < A . length ;
  a ++ ) {
    A [ a ] = Integer . parseInt ( input . readLine ( ) ) ;
  }
  int [ ] [ ] Amida = new int [ N + 1 ] [ M + 1 ] ;
  for ( int a = 0 ;
  a < A . length ;
  a ++ ) {
    Amida [ a ] [ a ] = new int [ A [ a ] . length + 1 ] ;
  }
  for ( int a = 0 ;
  a < A . length ;
  a ++ ) {
    Amida [ a ] [ a ] = new int [ A [ a ] . length + 1 ] ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int r = i ;
    int j = 0 ;
    while ( j < Amida [ r ] . length ) {
      r = Amida [ r ] [ j ] [ 0 ] ;
      j = Amida [ r ] [ j ] [ 1 ] ;
    }
    rec [ i - 1 ] = r ;
  }
  int [ ] kaijou = new int [ 30 ] ;
  for ( int i = 0 ;
  i < R . length ;
  i ++ ) {
    int c = 2 * i ;
    if ( c > D ) continue ;
    kaijou [ i ] = i ;
    if ( D == c ) break ;
    D -= c ;
  }
  int [ ] [ ] R = new int [ N + 1 ] [ ] ;
  R [ 0 ] = rec ;
  for ( int a = 0 ;
  a < R . length ;
  a ++ ) {
    R [ a ] = R [ a ] [ a ] ;
  }
  int ans = 0 ;
  for ( int k = 0 ;
  k < kaijou . length ;
  k ++ ) {
    ans = Arrays . copyOf ( ans , k ) ;
  }
  System . out . println ( ( ans ) + "\n" ) ;
  return R ;
}
