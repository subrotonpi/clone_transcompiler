static void n ( int n , int x ) {
  int i , a ;
  a = Integer . parseInt ( input . nextLine ( ) ) ;
  a . sort ( ) ;
  ans = 0 ;
  for ( i = 0 ;
  i < n ;
  i ++ ) {
    if ( a [ i ] > x ) break ;
    else {
      ans ++ ;
      x -= a [ i ] ;
      if ( i == n - 1 && x != 0 ) ans -- ;
    }
  }
  System . out . println ( ans ) ;
}
