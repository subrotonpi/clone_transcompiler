public static int n ( int x , int y ) {
  int l = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = 0 ;
  int i = 0 ;
  while ( x > 0 ) {
    if ( x % 2 == 1 ) ans += l [ i ] ;
    x /= 2 ;
    i ++ ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
