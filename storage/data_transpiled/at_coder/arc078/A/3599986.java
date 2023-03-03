public static void print ( int n ) {
  int [ ] a = Integer . parseInt ( input ( ) . trim ( ) ) ;
  int sumx = a [ 0 ] ;
  int sumy = Integer . parseInt ( a [ 1 ] ) ;
  int ans = Math . abs ( sumx - sumy ) ;
  for ( int i = 1 ;
  i < n - 1 ;
  i ++ ) {
    sumx += a [ i ] ;
    sumy -= a [ i ] ;
    ans = Math . min ( ans , Math . abs ( sumx - sumy ) ) ;
  }
  System . out . println ( ans ) ;
}
