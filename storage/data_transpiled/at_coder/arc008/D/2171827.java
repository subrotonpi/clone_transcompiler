) public static void main ( String [ ] args ) {
  V = 1 ;
  P = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < V * Integer . parseInt ( input ( args [ 0 ] ) ) ;
  i ++ ) {
    Q = new HashMap < > ( ) ;
    for ( int j = 0 ;
    j < P . size ( ) ;
    j ++ ) {
      Q . put ( P . get ( j ) , i ) ;
    }
  }
  int N = 2 * 20 ;
  C = new int [ N ] ;
  C [ 0 ] = ( byte ) 1 ;
  for ( int x = 0 ;
  x < P . size ( ) ;
  x ++ ) {
    int a = P . get ( x ) ;
    int b = Q . get ( x ) + N / 2 ;
    C [ x ] = a ;
    C [ x ] = b ;
    while ( x -- != 0 ) x >>>= 1 ;
    a = C [ 2 * x ] ;
    C [ 2 * x + 1 ] = a * c ;
    C [ 2 * x + 2 ] = c * b + d ;
    V += c + d ;
  }
  System . out . println ( min ( V ) + " " + max ( V ) ) ;
}
