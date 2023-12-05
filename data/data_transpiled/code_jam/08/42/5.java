static final void psyco ( ) {
  final String s = System . getProperty ( "line.separator" ) ;
  psyco ( ) . profile ( ) ;
  {
    final BufferedReader rl = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
    for ( int t = 0 ;
    t < xrange ( Integer . parseInt ( rl . readLine ( ) ) ) ;
    t ++ ) {
      final int n = Integer . parseInt ( rl . readLine ( ) . trim ( ) ) ;
      final int m = Integer . parseInt ( rl . readLine ( ) . trim ( ) ) ;
      final int a = Integer . parseInt ( rl . readLine ( ) . trim ( ) ) ;
      boolean ans = false ;
      final HashMap < Integer , Integer > val = new HashMap < Integer , Integer > ( ) ;
      for ( int x = 0 ;
      x <= n ;
      x ++ ) {
        for ( int y = 0 ;
        y <= m ;
        y ++ ) {
          if ( ! val . containsKey ( x * y ) ) {
            val . put ( x * y , new Integer ( x ) ) ;
          }
        }
      }
      for ( int x = 1 ;
      x <= m ;
      x ++ ) {
        val . put ( x , x ) ;
      }
    }
  }
}
