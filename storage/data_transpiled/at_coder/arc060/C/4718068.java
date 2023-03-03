static final int [ ] [ ] solve ( ) {
  int INF = 10 * 18 ;
  int MOD = 10 * 9 + 7 ;
  @ SuppressWarnings ( "resource" ) int [ ] [ ] prod = new int [ N ] [ N ] ;
  int [ ] [ ] AB = new int [ N ] [ N ] ;
  int [ ] [ ] X = new int [ N ] [ N ] ;
  int [ ] [ ] LI_ = new int [ N ] [ N ] ;
  int [ ] [ ] LF = new int [ N ] [ N ] ;
  int [ ] LS = new int [ N ] [ N ] ;
  int [ ] [ ] I = new int [ N ] [ N ] ;
  int [ ] [ ] I = new int [ N ] [ N ] ;
  int [ ] [ ] I = new int [ N ] [ N ] ;
  int [ ] [ ] I = new int [ N ] [ N ] ;
  int [ ] [ ] [ ] AB = new int [ Q ] [ N ] ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    AB [ i ] = LI_ [ i ] ;
  }
  Unreachs = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < X . length - 1 ;
  i ++ ) {
    int [ ] u = Arrays . copyOf ( X [ i ] , X [ i ] . length + L ) ;
    Unreachs [ i ] [ i ] = u ;
  }
  boolean updated = true ;
  while ( updated ) {
    updated = false ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      int [ ] u = Unreachs [ Unreachs [ i ] [ N - 1 ] - 1 ] [ i ] ;
      updated = updated || ( u != Unreachs [ i ] [ N - 1 ] ) ;
      Unreachs [ i ] [ N - 1 ] = u ;
    }
  }
  for ( int a = 0 ;
  a < AB . length ;
  a ++ ) {
    int [ ] b = AB [ a ] ;
    if ( a > b ) {
      a = b ;
    }
    int ans = 0 ;
    do {
      int k = Arrays . binarySearch ( Unreachs [ a ] , b ) - 1 ;
      if ( k < 0 ) {
        ans ++ ;
        break ;
      }
      ans += 2 * k ;
      a = Unreachs [ a ] [ k ] - 1 ;
    }
    while ( true ) ;
    System . out . println (