public static void main ( ) {
  int n = Integer . parseInt ( input ( ) ) ;
  int minCost = 10 * 9 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    for ( int j = 1 ;
    j <= n / i ;
    j ++ ) {
      int cost = Math . abs ( i - j ) + n - ( i * j ) ;
      minCost = Math . min ( minCost , cost ) ;
    }
  }
  System . out . println ( minCost ) ;
}
