@ GwtIncompatible ( "java.util.concurrent.atomic.ConcurrentHashMap" ) private static void solve ( int u , int cnt , Set < Integer > c , Set < Integer > t , boolean vis ) {
  if ( best && cnt > best ) return ;
  if ( DEST . contains ( u ) ) {
    Set < Integer > tt = t . removeAll ( c ) ;
    if ( best == null || cnt < best || ( best == cnt && tt . size ( ) > bestt . size ( ) ) ) {
      best = cnt ;
      bestt = tt ;
    }
    return ;
  }
  for ( Integer x : al . get ( u ) ) {
    if ( ! vis . get ( x ) ) {
      vis . put ( x , true ) ;
      Set < Integer > nc = c . stream ( ) . map ( x -> x . intValue ( ) ) . collect ( Collectors . toSet ( ) ) ;
      Set < Integer > nt = t . stream ( ) . map ( x -> al . get ( x ) ) . collect ( Collectors . toSet ( ) ) ;
      solve ( x , cnt + 1 , nc , nt ) ;
      vis . put ( x , false ) ;
    }
  }
  if ( Class . isEnum ( ) ) {
    for ( int caseno : xrange ( Integer . parseInt ( readLine ( ) ) ) ) {
      int P = Integer . parseInt ( readLine ( ) ) ;
      int W = Integer . parseInt ( readLine ( ) ) ;
      Map < Integer , Integer > al = new LinkedHashMap < Integer , Integer > ( ) ;
      for ( String s : readLine ( ) . split ( " " ) ) {
        int a = Integer . parseInt ( readLine ( ) ) ;
        int b = Integer . parseInt ( readLine ( ) ) ;
        al . put ( a , b ) ;
        al . put ( b , a ) ;
      }
      DEST = Collections . singletonMap ( x , 1 ) ;
      vis = new HashMap < Integer , Boolean > ( ) ;
      best = null ;
      bestt = null ;
      solve ( 0 , 0 , new HashSet < Integer > ( Arrays . asList ( 0 ) ) , new HashSet < Integer > ( Arrays . asList ( al . get ( 0 ) ) ) ) ;
      System . out . printf ( "Case #%d: %d %d%n" , caseno + 1 , best , bestt . size ( ) ) ;
    }
  }
}
