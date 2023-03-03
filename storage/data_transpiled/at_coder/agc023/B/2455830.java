public static void print ( int n ) {
  int [ ] s = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) s [ i ] = input . nextInt ( ) ;
  String [ ] st = new String [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) st [ i ] = String . valueOf ( ) . join ( s_ ) ;
  int sol = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int k = 0 ;
    k < n ;
    k ++ ) {
      if ( s [ k ] != st [ k ] ) break ;
    }
  }
  System . out . println ( sol * n ) ;
}
