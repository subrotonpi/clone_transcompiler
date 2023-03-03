static final LinkedHashMap < Integer , Integer > args = new LinkedHashMap < Integer , Integer > ( ) {
  private final BufferedReader in = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  private int T = Integer . parseInt ( in . readLine ( ) ) ;
  for ( int cas : xrange ( 1 , T + 1 ) ) {
    System . out . println ( "Case #" + cas + ":" ) ;
    final int N = Integer . parseInt ( in . readLine ( ) ) ;
    final LinkedHashMap < Integer , Integer > attacks = new LinkedHashMap < Integer , Integer > ( N ) ;
    for ( final int d : xrange ( N ) ) {
      final int n = Integer . parseInt ( in . readLine ( ) ) ;
      final int w = Integer . parseInt ( in . readLine ( ) ) ;
      final int e = Integer . parseInt ( in . readLine ( ) ) ;
      final int s = Integer . parseInt ( in . readLine ( ) ) ;
      final int delta_d = Integer . parseInt ( in . readLine ( ) ) ;
      final int delta_p = Integer . parseInt ( in . readLine ( ) ) ;
      final int delta_s = Integer . parseInt ( in . readLine ( ) ) ;
      for ( int i : xrange ( n ) ) {
        attacks . put ( d + delta_d * i , new Integer ( w + delta_p * i ) ) ;
      }
    }
    final LinkedHashMap < Integer , Integer > wall = new LinkedHashMap < Integer , Integer > ( ) ;
    int ans = 0 ;
    for ( final int i : xrange ( 676060 + 1 ) ) {
      if ( ! attacks . containsKey ( i ) ) continue ;
      final LinkedHashMap < Integer , Integer > nwall = wall . clone ( ) ;
      for ( final int w = attacks . get ( i ) ;
      w < e ;
      w ++ ) {
        final int e = attacks . get ( i ) ;
        final int s = attacks . get ( i ) ;
        boolean failed = false ;
        for ( final int x : xrange ( w , e ) ) {
          if ( wall . get ( x ) < s ) {
            failed = true ;
            nwall . put ( x , Math . max ( nwall . get ( x ) , s ) ) ;
          }
        }
        if ( failed ) ans ++ ;
      }
      wall = nwall ;
    }
    System . out . println ( ans ) ;
  }
  return null ;
}
