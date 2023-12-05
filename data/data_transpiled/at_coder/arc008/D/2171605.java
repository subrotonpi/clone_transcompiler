public static int M = Integer . parseInt ( input . nextLine ( ) ) ;
e = 1 ;
C = new HashMap < > ( ) ;
g = C . get ;
p = q = 1 ;
P = new ArrayList < > ( ) ;
for ( int i = 0 ;
i < M ;
i ++ ) P . add ( new LinkedList < > ( ) ) ;
Q . put ( p , i ) ;
Q . put ( p , i ) ;
N = 2 * Integer . SIZE ;
for ( int i = 0 ;
i < P . size ( ) ;
i ++ ) Q . put ( p , i ) ;
N = 2 * Integer . SIZE ;
for ( int i = 0 ;
i < Q . size ( ) ;
i ++ ) {
  int x = P . get ( i ) ;
  a = Q . get ( x ) ;
  x += N ;
  C . put ( x , a ) ;
  b = Q . get ( x ) ;
  c = Q . get ( x ) ;
  d = Q . get ( x ) ;
  C . put ( x , a * c , c * b + d ) ;
  int r = sum ( C . get ( 1 ) ) ;
  p = Math . min ( r , p ) ;
  q = Math . max ( r , q ) ;
}
System . out . println ( p + " " + q ) ;
return p ;
}
