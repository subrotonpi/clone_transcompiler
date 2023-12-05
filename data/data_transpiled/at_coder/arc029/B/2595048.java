@ Nullable public static String print ( @ NotNull Scanner input ) {
  int a = input . nextInt ( ) ;
  int b = input . nextInt ( ) ;
  int n = input . nextInt ( ) ;
  a = Math . min ( a , b ) ;
  b = Math . max ( a , b ) ;
  double ab = sqrt ( a * a + b * b ) , th = atan ( a / b ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int c = input . nextInt ( ) ;
    int d = input . nextInt ( ) ;
    c = Math . min ( c , d ) ;
    d = Math . max ( c , d ) ;
    if ( a <= c && b <= d ) ans = "YES" ;
    else {
      double hi = atan ( b / a ) , lo = 0 ;
      for ( int j = 0 ;
      j < 100 ;
      j ++ ) {
        double mid = ( hi + lo ) / 2 ;
        if ( ab * sin ( mid + th ) <= d ) lo = mid ;
        else hi = mid ;
      }
      if ( ab * cos ( lo - th ) <= c ) ans = "YES" ;
      else ans = "NO" ;
    }
    System . out . println ( ans ) ;
  }
  return null ;
}
