public static void print ( int A , int B ) {
  System . out . println ( 100 + " " + 100 ) ;
  String x1 = new String ( new char [ 100 ] ) ;
  String y1 = new String ( new char [ 100 ] ) ;
  for ( int i = 0 ;
  i < 25 ;
  i ++ ) {
    char [ ] x = new char [ 100 ] ;
    for ( int j = 0 ;
    j < 50 ;
    j ++ ) {
      if ( B > 1 ) {
        x [ 2 * j ] = '#' ;
        B -- ;
      }
    }
    System . out . println ( new String ( x ) ) ;
    System . out . println ( x1 ) ;
  }
  for ( int i = 0 ;
  i < 25 ;
  i ++ ) {
    System . out . println ( y1 ) ;
    char [ ] y = new char [ 100 ] ;
    for ( int j = 0 ;
    j < 50 ;
    j ++ ) {
      y [ 2 * j ] = '#' ;
    }
    for ( int j = 0 ;
    j < 50 ;
    j ++ ) {
      if ( A > 1 ) {
        y [ 2 * j ] = '.' ;
        A -- ;
      }
    }
    System . out . println ( new String ( y ) ) ;
  }
}
