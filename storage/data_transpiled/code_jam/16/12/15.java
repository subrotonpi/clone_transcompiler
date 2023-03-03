public static int t = Integer . parseInt ( readLine ( ) ) {
  for ( int cas : xrange ( 1 , t + 1 ) ) {
    int n = Integer . parseInt ( readLine ( ) ) ;
    Map < Integer , Integer > ct = Maps . newHashMap ( ) ;
    for ( int i : xrange ( 1 , 2501 ) ) {
      int [ ] nums = Integer . parseInt ( readLine ( ) ) ;
      for ( int num : nums ) {
        ct . put ( num , ++ i ) ;
      }
    }
    List < Integer > ans = new ArrayList < > ( ) ;
    for ( int i : ct . keySet ( ) ) {
      if ( ct . get ( i ) % 2 == 1 ) {
        ans . add ( i ) ;
      }
    }
    Collections . sort ( ans ) ;
    ans = Arrays . stream ( ans ) . collect ( Collectors . joining ( ) ) ;
    System . out . println ( "Case #" + cas + ": " + ans ) ;
  }
  return t ;
}
