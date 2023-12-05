public static void print ( ) {
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int ans = 0 ;
  int l = 0 ;
  int r = 0 ;
  while ( l < n ) {
    int s = 0 ;
    while ( r < n && a [ r ] > 0 ) {
      s += a [ r ] ;
      r ++ ;
    }
    ans += s / 2 ;
    l = r + 1 ;
    r = l ;
  }
  System . out . println ( ans ) ;
}
