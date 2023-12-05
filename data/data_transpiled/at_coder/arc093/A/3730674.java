public static void print ( int n ) {
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  a [ n ] = 0 ;
  int res = 0 ;
  int p = 0 ;
  for ( int i = 0 ;
  i < n + 1 ;
  i ++ ) {
    res += Math . abs ( p - a [ i ] ) ;
    p = a [ i ] ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int ass = res - Math . abs ( a [ i ] - a [ i - 1 ] ) - Math . abs ( a [ i + 1 ] - a [ i ] ) + Math . abs ( a [ i + 1 ] - a [ i - 1 ] ) ;
    System . out . println ( ass ) ;
  }
}
