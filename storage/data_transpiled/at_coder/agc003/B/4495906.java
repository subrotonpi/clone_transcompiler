public static void print ( int n ) {
  int c = 0 ;
  int d = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int b = input . nextInt ( ) ;
    if ( b != 0 ) {
      d += b ;
    }
    else {
      c += d / 2 ;
      d = 0 ;
    }
  }
  System . out . println ( c + d / 2 ) ;
}
