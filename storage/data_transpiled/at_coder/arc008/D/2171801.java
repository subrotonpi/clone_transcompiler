{
  P = new int [ Integer . parseInt ( input . nextLine ( ) ) ] ;
  Q = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < P . length ;
  i ++ ) Q . put ( P [ i ] , i ) ;
  N = 2 * Integer . numberOfLeadingZeros ( Q . get ( i ) ) ;
  C = new double [ N * 2 ] ;
  V = new int [ N ] ;
  for ( int x = 0 ;
  x < P . length ;
  x ++ ) {
    int a = P [ x ] ;
    int b = Q . get ( x ) + N ;
    C [ x ] = a ;
    C [ x ] = b ;
    while ( x -- > 0 ) C [ x ] >>= 1 ;
    a = C [ 2 * x ] ;
    b = C [ 2 * x + 1 ] ;
    C [ x ] = a * c ;
    C [ x ] = c * b + d ;
    V [ x ] = c + d ;
  }
  System . out . println ( min ( V ) + max ( V ) ) ;
}
