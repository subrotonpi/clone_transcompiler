static final void main ( String [ ] args ) {
  if ( args . length == 0 ) {
    int n = Integer . parseInt ( args [ 0 ] ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      System . out . print ( "Case #" + ( i + 1 ) + ": " ) ;
      n = Integer . parseInt ( args [ i ] ) ;
      String [ ] l = args [ i + 1 ] . split ( "\\s+" ) ;
      Arrays . sort ( l ) ;
      int total = 0 ;
      int ans = 0 ;
      for ( int i = 0 ;
      i < l . length ;
      i ++ ) {
        int p = l [ i ] . length ( ) ;
        if ( total < i ) {
          ans = ans + l [ i ] . charAt ( total ) - total ;
          total = i ;
        }
        total = total + p ;
      }
      System . out . println ( ans ) ;
    }
  }
}
