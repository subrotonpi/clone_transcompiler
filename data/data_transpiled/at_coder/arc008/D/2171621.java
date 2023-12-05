public static int M = Integer . parseInt ( input . nextLine ( ) ) ;
int p = 0 ;
int q = 1 ;
P = new int [ M ] ;
for ( int i = 0 ;
i < M ;
i ++ ) {
  P [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
}
Q = new HashMap < > ( ) ;
for ( int i = 0 ;
i < P . length ;
i ++ ) Q . put ( P [ i ] , i ) ;
N = 2 * Integer . SIZE ;
C = new double [ N * 2 ] ;
for ( int x = 1 , a = 0 , b = 0 ;
x < P [ 0 ] ;
x ++ ) {
  a = Q . get ( x ) + N ;
  C [ x ] = a ;
  C [ x ] = b ;
  while ( x -- > 0 ) x >>= 1 ;
  a = C [ 2 * x ] ;
  b = C [ 2 * x + 1 ] ;
  C [ x ] = a * c ;
  C [ 2 * x + 1 ] = c * b + d ;
  int r = Integer . parseInt ( C [ 1 ] ) ;
  p = Math . min ( r , p ) ;
  q = Math . max ( r , q ) ;
}
System . out . println ( p + " " + q ) ;
return p ;
}
