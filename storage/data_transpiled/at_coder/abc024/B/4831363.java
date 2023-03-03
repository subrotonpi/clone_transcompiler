public static void print ( int n , int t ) {
  int [ ] a = new int [ n ] ;
  int x = 0 ;
  int y = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    if ( Math . abs ( a [ i ] - a [ i - 1 ] ) > t ) {
      x += t ;
    }
    else if ( Math . abs ( a [ i ] - a [ i - 1 ] ) - y <= t ) {
      x += Math . abs ( a [ i ] - a [ i - 1 ] ) ;
      y = t ;
    }
  }
  System . out . println ( x + t ) ;
}
