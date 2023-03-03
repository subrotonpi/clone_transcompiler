public static void main ( int n , int s , int t ) {
  int w = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = 0 ;
  if ( w >= s && w <= t ) {
    ans ++ ;
  }
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    w += a ;
    if ( w >= s && w <= t ) {
      ans ++ ;
    }
  }
  System . out . println ( ans ) ;
}
