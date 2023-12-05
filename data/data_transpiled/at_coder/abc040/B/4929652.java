static final int round ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = 10 * 9 ;
  for ( int i = 1 ;
  i <= Math . floor ( Math . sqrt ( n ) ) ;
  i ++ ) {
    ans = Math . min ( ans , n - i * ( n / i ) + Math . abs ( i - ( n / i ) ) ) ;
  }
  System . out . println ( ans ) ;
}
