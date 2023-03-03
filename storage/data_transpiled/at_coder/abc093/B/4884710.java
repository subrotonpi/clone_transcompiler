public static int [ ] getNegativeInstances ( ) {
  int A = Integer . parseInt ( input . readLine ( ) ) ;
  int B = Integer . parseInt ( input . readLine ( ) ) ;
  int K = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] ans = new int [ K ] ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    ans [ i ] = A + i ;
    if ( A + i >= B ) break ;
  }
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    ans [ i ] = B - i ;
    if ( B - i <= A ) break ;
  }
  Arrays . sort ( ans ) ;
  for ( int a : ans ) {
    System . out . println ( a ) ;
  }
  return ans ;
}
