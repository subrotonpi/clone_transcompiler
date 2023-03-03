static final int input ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  int maxI = 1 ;
  for ( int i = 1 ;
  i <= ( int ) Math . sqrt ( m ) ;
  i ++ ) {
    if ( m % i != 0 ) continue ;
    int j = m / i ;
    if ( i * n <= m && i > maxI ) maxI = i ;
    if ( j * n <= m && j > maxI ) maxI = j ;
  }
  return maxI ;
}
