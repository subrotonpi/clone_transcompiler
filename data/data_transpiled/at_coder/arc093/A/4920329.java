public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] a = new int [ n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input ) ;
  }
  a [ n ] = 0 ;
  a [ n ] = 0 ;
  int totalTmp = 0 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    totalTmp += Math . abs ( a [ i ] - a [ i - 1 ] ) ;
  }
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    int total = totalTmp - Math . abs ( a [ i ] - a [ i - 1 ] ) - Math . abs ( a [ i + 1 ] - a [ i ] ) + Math . abs ( a [ i + 1 ] - a [ i - 1 ] ) ;
    System . out . println ( total ) ;
  }
}
