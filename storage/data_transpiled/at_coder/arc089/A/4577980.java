public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] now = new int [ ] {
    0 , 0 , 0 }
    ;
    boolean result = true ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      int t = Integer . parseInt ( input ) ;
      int a = Integer . parseInt ( input ) ;
      int b = Integer . parseInt ( input ) ;
      int time = t - now [ 0 ] ;
      int x = Math . abs ( a - now [ 1 ] ) ;
      int y = Math . abs ( b - now [ 2 ] ) ;
      if ( ( x + y - time ) % 2 != 0 || ( x + y ) > time ) {
        result = false ;
      }
      else {
        now = new int [ ] {
          t , a , b }
          ;
        }
      }
      if ( result ) {
        System . out . println ( "Yes" ) ;
      }
      else {
        System . out . println ( "No" ) ;
      }
    }
    