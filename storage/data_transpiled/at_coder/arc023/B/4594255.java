public static void print ( int r , int c , int d ) {
  int b = d % 2 ;
  int l = 0 ;
  List < Integer > a = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < r ;
  i ++ ) {
    a . add ( Integer . valueOf ( i ) ) ;
  }
  for ( int i = 0 ;
  i < r ;
  i ++ ) {
    for ( int j = 0 ;
    j < c ;
    j ++ ) {
      if ( ( i + j ) % 2 == b && i + j <= d && a . get ( i ) . get ( j ) > l ) {
        l = a . get ( i ) . get ( j ) ;
      }
    }
  }
  System . out . println ( l ) ;
}
