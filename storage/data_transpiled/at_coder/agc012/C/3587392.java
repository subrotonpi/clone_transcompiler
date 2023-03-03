public static int [ ] [ ] getBinaryArray ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( Integer . toString ( n + 1 ) ) - 2 ;
  n = n - ( 2 * ( m - 1 ) - 1 ) ;
  int [ ] fact = new int [ m + 2 ] ;
  int tmp = 1 ;
  for ( int i = 1 ;
  i <= m ;
  i ++ ) {
    fact [ i ] = tmp ;
    tmp = tmp * i ;
  }
  int [ ] [ ] binom = new int [ m + 1 ] [ m + 1 ] ;
  for ( int i = 0 ;
  i < m + 1 ;
  i ++ ) {
    for ( int j = 0 ;
    j < i + 1 ;
    j ++ ) {
      binom [ i ] [ j ] = ( fact [ i ] / ( fact [ j ] * fact [ i - j ] ) ) ;
    }
  }
  ArrayList < Integer > binomsums = new ArrayList < > ( ) ;
  for ( int j = 0 ;
  j < m / 2 + 1 ;
  j ++ ) {
    tmp = 1 ;
    for ( int i = 1 ;
    i <= j ;
    i ++ ) {
      tmp += binom [ j ] [ i ] * binom [ m - j ] [ i ] ;
    }
    binomsums . add ( tmp ) ;
  }
  int [ ] a = new int [ m / 2 + 1 ] ;
  int ind = m / 2 ;
  while ( n != 0 ) {
    int b = binomsums . remove ( binomsums . size ( ) - 1 ) ;
    int c = n / b ;
    n = b ;
    a [ ind ] = c ;
    ind -- ;
  }
  int [ ] [ ] ans = new int [ m ] [ m ] ;
  int i = 2 ;
  for ( int j = 0 ;
  j < m / 2 + 1 ;
  j ++ ) {
    for ( int k = 0 ;
    k < a [ j ] ;
    k ++ ) {
      ans [ k ] = i ++ ;
    }
    ans [ j ] = 1 ;
  }
  ans = ans . clone ( ) ;
  i -- ;
  while ( i >= 2 ) {
    ans [ i ] = i -- ;
  }
  System . out . println ( ans . length ) ;
  System . out . println ( Arrays . toString ( ans ) ) ;
  return ans ;
}
