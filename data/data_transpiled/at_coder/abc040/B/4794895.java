static final int round ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Math . floor ( Math . sqrt ( n ) ) ;
  int ans = 100000 ;
  for ( int i = 1 ;
  i <= m ;
  i ++ ) {
    for ( int j = 1 ;
    j <= n / i ;
    j ++ ) {
      ans = Math . min ( Math . abs ( i - j ) + ( n - i * j ) , ans ) ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
