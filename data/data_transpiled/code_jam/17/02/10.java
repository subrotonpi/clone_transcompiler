public static void input ( ) {
  t = input . nextInt ( ) ;
  for ( int tc = 0 ;
  tc < xrange . t ;
  tc ++ ) {
    int n = input . nextInt ( ) + 1 ;
    String s = String . valueOf ( n ) ;
    int l = s . length ( ) ;
    int [ ] [ ] dp = new int [ xrange . 10 ] [ xrange . l + 1 ] ;
    for ( int j = 0 ;
    j < xrange . l ;
    j ++ ) dp [ j ] [ j ] = - 1 ;
    dp [ 0 ] [ 9 ] = 0 ;
    int ans = 0 ;
    for ( int i = 0 ;
    i < xrange . l ;
    i ++ ) {
      for ( int k = xrange . l ;
      k < Integer . parseInt ( s . substring ( i , i + 1 ) ) ;
      k ++ ) {
        String t = s . substring ( 0 , i ) + Integer . toString ( k ) + "9" * ( l - i - 1 ) ;
        boolean ok = true ;
        for ( int j = xrange . l - 1 ;
        j < xrange . l ;
        j ++ ) ok &= Integer . parseInt ( t . substring ( j , j + 1 ) ) <= Integer . parseInt ( t . substring ( j + 1 , j + 1 ) ) ;
        if ( ok ) ans = Math . max ( ans , Integer . parseInt ( t ) ) ;
      }
    }
  }
  System . out . println ( "Case #" + ( tc + 1 ) + ": " + ans ) ;
}
