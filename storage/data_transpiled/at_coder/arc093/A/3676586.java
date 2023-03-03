public static void print ( int n ) {
  int [ ] a = Integer . parseInt ( input . nextLine ( ) ) ;
  int s = 0 ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    s += Math . abs ( a [ i + 1 ] - a [ i ] ) ;
  }
  s += Math . abs ( a [ 0 ] ) + Math . abs ( a [ n - 1 ] ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int mae = i == 0 ? 0 : a [ i - 1 ] ;
    int ato = i == n - 1 ? 0 : a [ i + 1 ] ;
    int q = Math . abs ( a [ i ] - mae ) + Math . abs ( ato - a [ i ] ) ;
    int w = Math . abs ( ato - mae ) ;
    System . out . println ( s - q + w ) ;
  }
}
