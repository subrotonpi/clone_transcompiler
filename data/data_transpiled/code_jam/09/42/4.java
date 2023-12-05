@ GwtIncompatible ( "java.util.ResourceBundle" ) public static Enumeration < String > digits = new Enumeration < String > ( ) {
  private final String s ;
  private int [ ] posDigs = new int [ 2 ] ;
  {
    int i ;
    @ Override public boolean hasMoreElements ( ) {
      return false ;
    }
    @ Override public String nextElement ( ) {
      int y = 0 ;
      int x = 0 ;
      for ( int o = 1 ;
      o < - 1 ;
      o ++ ) {
        int yy = y ++ ;
        int xx = x + o ;
        if ( ( ( yy = y + 1 ) >= 0 ) || ( ( yy = y + 1 ) >= 0 ) ) {
          posDigs [ i ] = j ;
        }
      }
      return null ;
    }
    @ Override public String nextElement ( ) {
      return s ;
    }
  }
  ;
  String TEST_DATA = ( / * ▁ 4 ▁ 8 ▁ 3 STRNEWLINE . . . . . . . . # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # #