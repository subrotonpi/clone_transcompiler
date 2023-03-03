static final String getFactorial ( int n , int r ) {
  int i ;
  int n , r ;
  int d ;
  int l ;
  /* if (r>n) return 0; else return fact(n)/(fact(n-r)*fact(r)); */
  /* cal(n, d, l) */
  if ( ( n <= 0 ) || ( n - d <= 0 ) ) return 0 ;
  /* get the number of inner */
  all_ = cal ( x * y , d , l ) ;
  /* get the number of inner */
  ng = cal ( ( x - 1 ) * y , d , l ) * 2 + cal ( x * ( y - 1 ) , d , l ) * 2 - cal ( ( x - 2 ) * y , d , l ) - cal ( ( x - 1 ) * ( y - 1 ) , d , l ) * 4 - cal ( x * ( y - 2 ) , d , l ) + cal ( ( x - 2 ) * ( y - 1 ) , d , l ) * 2 + cal ( ( x - 1 ) * ( y - 2 ) , d , l ) * 2 - cal ( ( x - 2 ) * ( y - 2 ) , d , l ) ;
  /* main */
  input = new Scanner ( System . in ) ;
  r = Integer . parseInt ( input . nextLine ( ) ) ;
  c = Integer . parseInt ( input . nextLine ( ) ) ;
  x = Integer . parseInt ( input . nextLine ( ) ) ;
  y = Integer . parseInt ( input . nextLine ( ) ) ;
  d = Integer . parseInt ( input . nextLine ( ) ) ;
  l = Integer . parseInt ( input . nextLine ( ) ) ;
  o = ( r - x + 1 ) * ( c - y + 1 ) ;
  if ( ( d + l ) == ( x * y ) ) {
    n = x * y ;
    i = nCr ( n , d ) ;
  }
  else {
    i = getNumInner ( x , y , d , l ) ;
  }
  System . out . println ( ( o * i ) % 1000000007 ) ;
}
