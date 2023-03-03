public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] h = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    h [ i ] = Integer . parseInt ( input ) ;
  }
  int ans = 0 ;
  for ( int cheight = 0 ;
  cheight < 101 ;
  cheight ++ ) {
    boolean renz = false ;
    for ( int x = 0 ;
    x < n ;
    x ++ ) {
      if ( h [ x ] > cheight ) {
        if ( ! renz ) {
          renz = true ;
          ans ++ ;
        }
      }
      else {
        renz = false ;
      }
    }
  }
  System . out . println ( ans ) ;
}
