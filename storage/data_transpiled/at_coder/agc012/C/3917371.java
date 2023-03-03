static int [ ] fact = new int [ 101 ] ;
fact [ 0 ] = 1 ;
for ( int i = 1 ;
i < fact . length ;
i ++ ) {
  fact [ i ] = fact [ fact . length - 1 ] * i ;
}
{
  int a = fact [ 0 ] ;
  int b = fact [ 0 ] ;
  int c = fact [ a ] / ( fact [ b ] * fact [ a - b ] ) ;
  int c = fact [ a ] / ( fact [ b ] * fact [ a - b ] ) ;
  int c = fact [ a ] / ( fact [ b ] * fact [ a - b ] ) ;
  int c = fact [ b ] / ( fact [ a ] * fact [ b ] ) ;
  int ret [ ] = new int [ Math . min ( c , c ) ] ;
  int k = 0 ;
  int rem = 0 ;
  for ( int i = 0 ;
  i < Math . min ( c , c ) ;
  i ++ ) {
    ret [ i ] += c * c ;
  }
  int kk = c ;
  if ( k <= 0 ) {
    return new int [ ] {
      k }
      ;
    }
    int i = 0 ;
    while ( k <= 0 ) {
      int tmp = c ;
      if ( tmp <= rem ) {
        ret [ i ] = kk ;
        ret [ i ] = kk ;
        kk ++ ;
        rem -= tmp ;
      }
      else {
        break ;
      }
    }
    return ret + calc ( rem , kk ) ;
  }
  