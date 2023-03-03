static final int [ ] getMatchingPatterns ( ) {
  int t = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  for ( int testNr = 1 ;
  testNr <= t ;
  testNr ++ ) {
    System . out . println ( "Case #" + testNr + ":" ) ;
    List < Pair > ms = new ArrayList < Pair > ( ) ;
    String [ ] a = System . console ( ) . readLine ( ) . split ( " " ) ;
    for ( int i = 0 , e = a . length ;
    i < e ;
    i ++ ) {
      if ( i % 2 == 1 ) {
        ms . add ( new Pair ( a [ i ] , Integer . parseInt ( a [ i + 1 ] ) ) ) ;
      }
    }
    Map < String , Integer > p = new HashMap < String , Integer > ( ) ;
    p . put ( "O" , 1 ) ;
    p . put ( "B" , 1 ) ;
    int steps = 0 ;
    for ( int i = 0 ;
    i < ms . size ( ) ;
    i ++ ) {
      final String col = ms . get ( i ) . getKey ( ) ;
      final int pos = p . get ( col ) ;
      int now = p . get ( col ) ;
      int time = Math . abs ( now - pos ) + 1 ;
      steps += time ;
      p . put ( col , pos ) ;
      final String otherCol = col . equals ( "B" ) ? "O" : "B" ;
      now = p . get ( otherCol ) ;
      int target = now ;
      final Iterator < Pair > it = ms . subList ( i + 1 , ms . size ( ) ) ;
      while ( it . hasNext ( ) ) {
        final Pair c = it . next ( ) ;
        if ( c . equals ( otherCol ) ) {
          target = it . next ( ) ;
          break ;
        }
      }
      final int time2 = Math . abs ( target - now ) ;
      if ( time2 <= time ) {
        p . put ( otherCol , target ) ;
      }
      else {
        if ( target < now ) {
          p . put ( otherCol , now - time ) ;
        }
        else if ( target > now ) {
          p . put ( otherCol , now + time ) ;
        }
        else {
        }
      }
    }
    System . out . println ( steps ) ;
  }
  return null ;
}
