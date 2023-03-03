public static void main ( String [ ] args ) {
  int N = Integer . parseInt ( input ) ;
  int T = 0 , X = 0 , Y = 0 ;
  for ( ;
  ;
  ) {
    int t = Integer . parseInt ( input ) ;
    int x = Integer . parseInt ( input ) ;
    int y = Integer . parseInt ( input ) ;
    int dx = Math . abs ( x - X ) ;
    int dy = Math . abs ( y - Y ) ;
    int dt = t - T ;
    if ( ( dx + dy ) % 2 != dt % 2 ) {
      System . out . println ( "No" ) ;
      return ;
    }
    if ( dx + dy > dt ) {
      System . out . println ( "No" ) ;
      return ;
    }
    T = t ;
    X = x ;
    Y = y ;
  }
  System . out . println ( "Yes" ) ;
}
