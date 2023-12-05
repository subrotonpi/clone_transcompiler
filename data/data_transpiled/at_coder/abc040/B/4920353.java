static final int n ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = n ;
  int nn = ( int ) Math . sqrt ( n ) / 1 ;
  for ( int i = nn / 2 ;
  i <= nn * 3 / 2 ;
  i ++ ) {
    for ( int j = 0 ;
    j < i + 1 ;
    j ++ ) {
      if ( ( Math . abs ( i - j ) + ( n - i * j ) ) < m && i * j <= n ) {
        m = ( Math . abs ( i - j ) + ( n - i * j ) ) ;
      }
    }
  }
  System . out . println ( m ) ;
  return m ;
}
