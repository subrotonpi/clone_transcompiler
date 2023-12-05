static final java . util . Map < String , Integer > map = new java . util . LinkedHashMap < String , Integer > ( ) {
  private static final long serialVersionUID = - 5743705263738203615L ;
  private static final long serialVersionUID = - 5743705263738203615L ;
  private static final long serialVersionUID = - 5743705263738203615L ;
  private static final long serialVersionUID = - 5743705263738203615L ;
  private static final long serialVersionUID = - 5743705263738203615L ;
  private final long inf = 10 * 20 ;
  private final long mod = 10 * 9 + 7 ;
  private final long [ ] st = new long [ 2 ] ;
  {
    int [ ] hs = new int [ 2 ] ;
    int [ ] ws = new int [ 2 ] ;
    for ( int g = 0 ;
    g < st . length ;
    g ++ ) {
      if ( 0 < g [ 0 ] && 0 < g [ 1 ] ) {
        hs [ 0 ] = g [ 0 ] ;
        ws [ 1 ] = g [ 1 ] ;
        continue ;
      }
    }
    return new long [ ] {
      Math . min ( hs [ 0 ] , Math . max ( hs [ 0 ] , 1 ) - 1 ) + 1 / k - 1 }
      ;
    }
    @ Override public void main ( String [ ] args ) {
      int h = li ( args [ 0 ] ) ;
      int w = li ( args [ 1 ] ) ;
      int k = li ( args [ 2 ] ) ;
      boolean [ ] a = new boolean [ h ] ;
      int [ ] st = null ;
      for ( int i = 0 ;
      i < h ;
      i ++ ) {
        String s = args [ 1 ] ;
        if ( s . contains ( "S" ) ) st [ i ] = s . indexOf ( "S" ) ;
        a [ i ] = new boolean [ s . length ( ) ] ;
        for ( int j = 0 ;
        j < s . length ( ) ;
        j ++ ) st [ i ] = s . indexOf ( "#" ) ;
      }
      {
        int i = k ;
        int j = k ;
        r = new boolean [ h ] ;
        if ( i < h - 1 ) r [ i ] = ( i + 1 ) ;
        if ( j < w - 1 ) r [ j ] = ( j + 1 ) ;
        if ( i > 0 ) r [ i ] = ( i - 1 ) ;
        if ( j > 0 ) r