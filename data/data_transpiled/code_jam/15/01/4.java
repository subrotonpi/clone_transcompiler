public static final void main ( String s ) {
  if ( s . equals ( "" ) ) {
    int T = Integer . parseInt ( s ) ;
    for ( int t = 0 ;
    t < T ;
    t ++ ) {
      String n = s . substring ( 0 , t ) ;
      String sraw = s . substring ( t + 1 ) ;
      int len = sraw . length ( ) ;
      n = Integer . parseInt ( n ) ;
      int [ ] shy = new int [ len ] ;
      for ( int i = 0 ;
      i < len ;
      i ++ ) shy [ i ] = Integer . parseInt ( sraw . substring ( i , i + 1 ) ) ;
      int gap = 0 ;
      int psum = 0 ;
      for ( int i = 0 ;
      i < n + 1 ;
      i ++ ) {
        if ( shy [ i ] != 0 ) {
          gap = Math . max ( gap , i - psum ) ;
          psum = psum + shy [ i ] ;
        }
      }
      System . out . println ( "Case #" + ( t + 1 ) + ": " + gap ) ;
    }
  }
}
