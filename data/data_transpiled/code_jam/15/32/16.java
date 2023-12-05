public static void testSum ( ) {
  for ( int test : xrange ( testSum ) ) {
    int k = Integer . parseInt ( readLine ( ) ) ;
    int l = Integer . parseInt ( readLine ( ) ) ;
    int s = Integer . parseInt ( readLine ( ) ) ;
    String a = readLine ( ) ;
    String b = readLine ( ) ;
    int minPos = b . length ( ) ;
    for ( int i : xrange ( 1 , b . length ( ) ) ) {
      if ( b . substring ( i ) . equals ( b . substring ( 0 , b . length ( ) - i ) ) ) {
        minPos = i ;
        break ;
      }
    }
    double maxBa = ( s - ( b . length ( ) - minPos ) ) / minPos ;
    HashMap < Character , Double > dic = new HashMap < Character , Double > ( ) ;
    for ( char ch : a . toCharArray ( ) ) {
      if ( dic . containsKey ( ch ) ) {
        dic . put ( ch , dic . get ( ch ) + 1 ) ;
      }
      else {
        dic . put ( ch , 1 ) ;
      }
    }
    double p = 1.0 ;
    for ( char ch : b . toCharArray ( ) ) {
      if ( dic . containsKey ( ch ) ) {
        p = p * dic . get ( ch ) / a . length ( ) ;
      }
      else {
        p = 0 ;
        break ;
      }
    }
    double expBa = p * ( s - b . length ( ) + 1 ) ;
    double ans ;
    if ( expBa == 0 ) {
      ans = 0 ;
    }
    else {
      ans = maxBa - expBa ;
    }
    System . out . println ( "Case #" + ( test + 1 ) + ":" + ans ) ;
  }
}
