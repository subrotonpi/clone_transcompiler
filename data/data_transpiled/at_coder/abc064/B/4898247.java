public static void print ( int n ) {
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  Arrays . sort ( a ) ;
  long ans = 0 ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    ans += a [ i ] - a [ i - 1 ] ;
  }
  System . out . println ( ans ) ;
}
