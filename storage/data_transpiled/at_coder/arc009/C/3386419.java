static int n ( int i ) {
  int n = ( i = input . nextInt ( ) ) , k = ( i + 1 ) % 2 ;
  int [ ] x = new int [ k ] , y = new int [ k ] , mod = 1777777777 , m = 1 ;
  for ( int j = k ;
  j >= 1 ;
  j -- ) {
    if ( j % 2 == 0 ) x [ j ] = m ;
    else y [ j ] = m ;
    m = ( m * i ) % mod ;
  }
  /*power*/
  if ( k == 1 ) return n ;
  else if ( k % 2 == 0 ) return n ;
  else return n ;
}
