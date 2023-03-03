public static void print ( int n ) {
  int [ ] [ ] c = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) c [ i ] = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) c [ i ] [ i ] = input . nextInt ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < n ;
    j ++ ) System . out . print ( c [ n - j - 1 ] [ i ] + " " ) ;
  }
  System . out . println ( ) ;
}
