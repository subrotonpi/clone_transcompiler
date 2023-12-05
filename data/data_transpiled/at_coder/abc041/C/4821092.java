public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] a = Integer . parseInt ( input ) ;
  int [ ] [ ] A = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int h = a [ i ] ;
    A [ i ] [ h ] = i + 1 ;
  }
  int [ ] aSorted = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    aSorted [ i ] = A [ i ] [ 1 ] ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    System . out . println ( aSorted [ i ] [ 0 ] ) ;
  }
}
