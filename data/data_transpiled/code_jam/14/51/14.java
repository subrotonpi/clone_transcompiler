public static void main ( String ifn , String ofn ) throws Exception {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  try ( BufferedReader inf = new BufferedReader ( new FileReader ( ifn ) ) ;
  BufferedWriter ouf = new BufferedWriter ( new FileWriter ( ofn ) ) ) {
    int noc = Integer . parseInt ( inf . readLine ( ) ) ;
    for ( int tnoc : xrange ( 1 , noc + 1 ) ) {
      ouf . write ( "Case #" + tnoc + ": " ) ;
      System . out . println ( "Case #" + tnoc + ": " ) ;
      int n = Integer . parseInt ( inf . readLine ( ) . trim ( ) ) ;
      int p = Integer . parseInt ( inf . readLine ( ) ) ;
      int q = Integer . parseInt ( inf . readLine ( ) ) ;
      int r = Integer . parseInt ( inf . readLine ( ) ) ;
      int s = Integer . parseInt ( inf . readLine ( ) ) ;
      int [ ] aa = new int [ n ] ;
      for ( int i = 0 ;
      i < n ;
      i ++ ) aa [ i ] = ( ( i * p + q ) % r + s ) ;
      int [ ] a = Arrays . copyOf ( aa , aa . length ) ;
      n = a . length ;
      int [ ] sum0 = new int [ n + 1 ] ;
      int [ ] sum1 = new int [ n + 1 ] ;
      for ( int i = 0 ;
      i < n ;
      i ++ ) sum0 [ i + 1 ] = sum0 [ i ] + a [ i ] ;
      for ( int i = n - 1 ;
      i >= 0 ;
      i -- ) sum1 [ i ] = sum1 [ i + 1 ] + a [ i ] ;
      int allv = sum0 [ n - 1 ] ;
      int bestAnswer = allv ;
      int j = 0 ;
      for ( int i = 0 ;
      i < n ;
      i ++ ) {
        if ( sum0 [ i ] >= allv ) break ;
        int ps = allv - sum0 [ i ] ;
        j = Math . max ( j - 1 , i ) ;
        while ( j <= n ) {
          int v1 = sum1 [ j ] ;
          int tmp = Math . max ( sum0 [ i ] , v1 , ps - v1 ) ;
          if ( tmp < bestAnswer ) bestAnswer = tmp ;
          if ( ( double ) v1 > ps / 2.0 ) ++ j ;
          