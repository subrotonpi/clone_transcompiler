public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  List < List < Integer >> a = Arrays . asList ( Integer . parseInt ( input ) ) ;
  int h = 0 ;
  for ( int i = 0 ;
  i < n - 2 ;
  i ++ ) {
    for ( int j = i + 1 ;
    j < n - 1 ;
    j ++ ) {
      for ( int d = j + 1 ;
      d < n ;
      d ++ ) {
        int s = a . get ( j ) . get ( 0 ) - a . get ( i ) . get ( 0 ) ;
        int t = a . get ( d ) . get ( 0 ) - a . get ( i ) . get ( 0 ) ;
        int u = a . get ( j ) . get ( 1 ) - a . get ( i ) . get ( 1 ) ;
        int r = a . get ( d ) . get ( 1 ) - a . get ( i ) . get ( 1 ) ;
        if ( Math . abs ( s * r - t * u ) % 2 == 0 && s * r != t * u ) {
          h ++ ;
        }
      }
    }
  }
  System . out . println ( h ) ;
}
