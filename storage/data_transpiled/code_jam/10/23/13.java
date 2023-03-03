static final int NN = 100003 ;
final Map < Integer , Integer > cache = new HashMap < Integer , Integer > ( ) ;
int c ;
int n ;
int k ;
if ( ( n < k ) || ( k < 0 ) ) return 0 ;
if ( ( n < k ) || ( k > n ) ) return cache . get ( new Integer ( n ) ) ;
s = 1 ;
for ( int i : xrange ( k + 1 , n + 1 ) ) s *= i ;
for ( int i : xrange ( 1 , n - k + 1 ) ) s /= i ;
s = s % NN ;
cache . put ( new Integer ( n ) , s ) ;
/* calcola */
if ( ( k == 1 ) || ( k == 2 ) ) return 1 ;
if ( ( k == 3 ) || ( k == - 1 ) ) return n - 3 ;
if ( ( N [ n ] [ k ] != - 1 ) ) return N [ n ] [ k ] ;
s = 0 ;
for ( int t : xrange ( 1 , k ) ) s = ( s + bin ( n - k - 1 , k - t - 1 ) * calcola ( N , k , t ) ) % NN ;
N [ n ] [ k ] = s % NN ;
/* C */
c = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
for ( c = 0 ;
c < C ;
c ++ ) {
  n = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  N = new int [ n + 1 ] [ n ] ;
  for ( int i : xrange ( n + 1 , n ) ) N [ i ] = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) N [ i ] [ i ] = - 1 ;
  s = 1 ;
  for ( int i : xrange ( 2 , n ) ) s = ( s + calcola ( N , n , i ) ) % NN ;
  System . out . println ( "Case #" + ( c + 1 ) + ": " + s ) ;
}
return 0 ;
}
