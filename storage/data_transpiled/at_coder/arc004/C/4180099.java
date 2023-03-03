public static int X = Integer . parseInt ( input ) {
  int gcd = X , _ = Y ;
  while ( _ != 0 ) {
    gcd = _ ;
    _ = gcd % _ ;
  }
  X = _X = X / gcd ;
  Y = _Y = Y / gcd ;
  List < int [ ] > ans = new ArrayList < > ( ) ;
  int ng = 0 , ok = 10 * 100 ;
  while ( ok - ng > 1 ) {
    int mid = ( ok + ng ) / 2 ;
    if ( Y * mid * ( Y * mid + 1 ) / 2 - mid * X > 0 ) {
      ok = mid ;
    }
    else {
      ng = mid ;
    }
  }
  X = X * ok ;
  Y = Y * ok ;
  do {
    int M = Y * ( Y + 1 ) / 2 - X ;
    if ( 0 < M && M <= Y ) {
      ans . add ( new int [ ] {
        Y , M }
        ) ;
      }
      else if ( M > Y ) {
        break ;
      }
      X = X + _X ;
      Y = Y + _Y ;
    }
    while ( true ) ;
    if ( ans . size ( ) > 0 ) {
      System . out . print ( ( String ) ans . get ( 0 ) ) ;
    }
    else {
      System . out . println ( "Impossible" ) ;
    }
    return 0 ;
  }
  