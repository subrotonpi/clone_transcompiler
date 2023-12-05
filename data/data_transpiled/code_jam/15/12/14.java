static final String imp = "org.apache.commons.math.linear.IntegerMath" ;
/* iline */
return map . get ( in ) . trim ( ) . split ( " " ) ;
/* test */
int B = iline ( ) ;
int N = iline ( ) ;
int M = iline ( ) ;
/* solve */
int L = 0 ;
int R = max ( M ) * N ;
while ( L < R ) {
  int T = ( L + R ) / 2 ;
  int n = Integer . valueOf ( T / M + 1 ) ;
  if ( n >= N ) {
    R = T ;
  }
  else {
    L = T + 1 ;
  }
  n = Integer . valueOf ( L / M + 1 ) ;
  int k [ ] = new int [ M ] ;
  for ( int i = 0 , m = M ;
  i < n ;
  i ++ ) {
    k [ i ] = M [ i ] + 1 ;
    if ( L % m == 0 ) {
      k [ N - n - 1 ] = M [ i ] ;
    }
  }
  System . out . println ( k ) ;
}
if ( className . equals ( "org.apache.commons.math.linear.IntegerMath" ) ) {
  int T = input . nextInt ( ) ;
  for ( int i : xrange ( 1 , T + 1 ) ) {
    System . out . println ( "Case #" + i + ":" ) ;
    test ( ) . run ( ) ;
  }
}
return null ;
}
