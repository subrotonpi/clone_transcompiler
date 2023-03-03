public static int n ( ) {
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  int c = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int tmp = 0 ;
    for ( int j = 0 ;
    j < m ;
    j ++ ) tmp += a * b ;
    if ( tmp + c > 0 ) ans ++ ;
  }
  return ans ;
}
