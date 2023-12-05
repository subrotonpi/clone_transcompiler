static final Scanner scanner = new Scanner ( System . in ) {
  @ Override public void next ( ) {
    final int tc = Integer . parseInt ( scanner . nextLine ( ) ) ;
    for ( int tmpTC = xrange ( tc ) ;
    tmpTC < 10000 ;
    tmpTC ++ ) {
      Arrays . fill ( Integer . parseInt ( scanner . nextLine ( ) ) , ( byte ) ( ( tmpTC >>> 24 ) & 0xFF ) ) ;
      final Set < Integer > W1 = new HashSet < Integer > ( ) ;
      final Set < Integer > W2 = new HashSet < Integer > ( ) ;
      final Set < Integer > lines = new HashSet < Integer > ( ) ;
      for ( int n : xrange ( 2 , N ) ) lines . add ( new Integer ( n ) ) ;
      Integer res = null ;
      for ( int cfg : xrange ( 1 << ( N - 2 ) ) ) {
        Set < Integer > w1 = new HashSet < Integer > ( W1 ) ;
        Set < Integer > w2 = new HashSet < Integer > ( W2 ) ;
        for ( int i = 0 ;
        i < lines . size ( ) ;
        i ++ ) {
          if ( ( 1 << i ) & cfg ) w1 . addAll ( lines . get ( i ) ) ;
          else w2 . addAll ( lines . get ( i ) ) ;
        }
        int tmp = 0 ;
        for ( int w : w1 ) if ( w2 . contains ( w ) ) tmp ++ ;
        if ( res == null || tmp < res ) res = tmp ;
      }
      if ( res == null ) {
        res = 0 ;
        for ( int w : W1 ) if ( W2 . contains ( w ) ) tmp ++ ;
      }
      System . out . println ( "Case #" + ( ++ tmpTC ) + ": " + res ) ;
    }
  }
}
