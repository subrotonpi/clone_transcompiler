public static int N ( int start , int [ ] D ) {
  int i ;
  int j ;
  int k ;
  int [ ] P ;
  int [ ] result ;
  int x ;
  int i ;
  int d ;
  for ( i = 0 ;
  i < N ;
  i ++ ) {
    k = N ;
    D [ i ] = i ;
    i = i + 1 ;
  }
  input ( ) ;
  Q = new LinkedList < Integer > ( ) ;
  for ( i = 0 ;
  i < Q . length ;
  i ++ ) {
    Q [ i ] = new Integer ( k - 1 ) ;
  }
  Arrays . sort ( Q ) ;
  P = new int [ N ] ;
  P [ 0 ] = start ;
  for ( i = 0 ;
  i < D . length ;
  i ++ ) {
    d = D [ i ] ;
    a = P [ P . length - 1 ] ;
    b = Math . abs ( a - d ) ;
    P [ i ] = Math . min ( a , b ) ;
  }
  result = new boolean [ Q . length ] ;
  result [ Q . length - 1 ] = null ;
  x = 1 ;
  for ( i = 0 ;
  i < D . length ;
  i ++ ) {
    d = D [ i ] ;
    if ( Q [ Q . length - 1 ] . intValue ( ) == i ) {
      result [ Q . length - 1 ] = P [ i ] >= x ;
      Q [ Q . length - 1 ] = Q [ Q . length - 1 ] ;
      if ( Q . length == 0 ) break ;
    }
    if ( Math . abs ( x - d ) < x ) x += d ;
  }
  for ( boolean r : result ) System . out . println ( r ? "YES" : "NO" ) ;
  return 0 ;
}
