public static int a ( String input ) {
  int n = Integer . parseInt ( input ) ;
  Map < Integer , Integer > [ ] m = new Map [ n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    m [ i ] = new HashMap < > ( ) ;
  }
  int w = 10 * 9 + 7 ;
  {
    StringBuilder sb = new StringBuilder ( ) ;
    for ( int i = 0 ;
    i < 4 ;
    i ++ ) {
      String t = sb . toString ( ) ;
      if ( i >= 1 ) {
        t . set ( i - 1 , t . get ( i ) ) ;
      }
      if ( sb . toString ( ) . indexOf ( "AGC" ) > 0 ) {
        return false ;
      }
    }
    return true ;
  }
}
