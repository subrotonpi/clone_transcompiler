static final int [ ] [ ] input ( ) {
  int H = Integer . parseInt ( input . readLine ( ) ) ;
  int W = Integer . parseInt ( input . readLine ( ) ) ;
  int K = Integer . parseInt ( input . readLine ( ) ) ;
  String [ ] [ ] HW = new String [ H ] [ W ] ;
  for ( int i = 0 ;
  i < HW . length ;
  i ++ ) {
    String h = HW [ i ] [ 0 ] ;
    if ( h . contains ( "S" ) ) {
      int y = i ;
      int x = h . indexOf ( "S" ) ;
    }
  }
  List < Pair > A = new ArrayList < > ( ) ;
  A . add ( new Pair ( x , y ) ) ;
  int m = 800 ;
  /* idou */
  List < Pair > X = new ArrayList < > ( ) ;
  for ( int i2 = 0 ;
  i2 < 4 ;
  i2 ++ ) {
    int t , k ;
    switch ( i2 ) {
      case 0 : t = a - 1 ;
      k = b ;
      break ;
      case 1 : t = a ;
      k = b - 1 ;
      break ;
      case 2 : t = a + 1 ;
      k = b ;
      break ;
      case 3 : t = a ;
      k = b + 1 ;
      break ;
    }
    if ( 0 <= t && t < W && 0 <= k && k < H && HW [ k ] [ t ] . equals ( "." ) ) {
      HW [ k ] [ t ] = "o" ;
      X . add ( new Pair ( t , k ) ) ;
    }
  }
  int cnt = 0 ;
  while ( cnt < K ) {
    cnt ++ ;
    List < Pair > B = new ArrayList < > ( ) ;
    for ( Pair p : A ) {
      int x = p . first ( ) ;
      int y = p . second ( ) ;
      List < Pair > b = idou ( x , y ) ;
      B . addAll ( b ) ;
    }
    A = B . toArray ( new Pair [ B . size ( ) ] ) ;
  }
  int [ ] [ ] M = new int [ M . length ] [ ] ;
  for ( int i = 0 ;
  i < M . length ;
  i ++ ) {
    String w = HW [ i ] [ 0 ] ;
    if ( w . contains ( "o" ) || w . contains ( "S" ) ) {
      M [ i ] = Math . min ( i , W - i - 1 ) ;
    }
  }
  m = Math . min