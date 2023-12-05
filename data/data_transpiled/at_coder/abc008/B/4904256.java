public static void print ( int n ) {
  int [ ] a = new int [ n ] ;
  int [ ] b = new int [ n ] ;
  int k = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    String s = input . next ( ) ;
    if ( ! a [ s ] ) {
      a [ s ] ++ ;
    }
    else {
      b [ s ] ++ ;
    }
  }
}
