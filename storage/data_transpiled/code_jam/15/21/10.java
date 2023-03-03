public static int [ ] split ( int nn , int sp ) {
  int aareal = nn / ( 10 * sp ) ;
  int bb = nn % ( 10 * sp ) ;
  int aa = Integer . parseInt ( String . valueOf ( aareal ) . substring ( 0 , aareal ) ) ;
  return new int [ ] {
    aareal , aa , bb }
    ;
  }
  int tt = Integer . parseInt ( readLine ( ) ) ;
  for ( int t = xrange ( 1 , tt + 1 ) ;
  t <= tt ;
  t ++ ) {
    int n = Integer . parseInt ( readLine ( ) ) ;
    int l = String . valueOf ( n ) . length ( ) ;
    int ans = 0 ;
    if ( l == 1 ) ans = n ;
    else {
      for ( int i : xrange ( 1 , l ) ) {
        if ( i == 1 ) ans += 10 ;
        else if ( i % 2 == 0 ) ans += 2 * ( 10 * ( i / 2 ) ) - 1 ;
        else ans += ( 10 * ( ( i + 1 ) / 2 ) ) + ( 10 * ( ( i - 1 ) / 2 ) ) - 1 ;
      }
      if ( l % 2 == 0 ) {
        int delta = n - ( 10 * ( l - 1 ) ) ;
        if ( delta > 2 ) {
          int alen = l / 2 ;
          int blen = l / 2 ;
          final int areal = split ( n , blen ) ;
          final int a = Integer . parseInt ( String . valueOf ( areal ) . substring ( 0 , alen ) ) ;
          final int b = Integer . parseInt ( String . valueOf ( areal ) . substring ( alen + 1 , blen ) ) ;
          if ( b == 0 ) delta = Math . min ( delta , Integer . parseInt ( String . valueOf ( areal - 1 ) . substring ( 0 , alen ) ) + ( 10 * blen ) ) ;
          else delta = Math . min ( delta , a + b ) ;
        }
        ans += delta ;
      }
    }
    System . out . println ( "Case #" + t + ": " + ans ) ;
  }
  