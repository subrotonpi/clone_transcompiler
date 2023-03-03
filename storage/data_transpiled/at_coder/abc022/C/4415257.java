static final int [ ] [ ] G ( ) {
  final Scanner in = new Scanner ( System . in ) ;
  final int x = 10 * 9 ;
  final int N = in . nextInt ( ) ;
  final int M = in . nextInt ( ) ;
  final int [ ] [ ] D = new int [ N ] [ N ] ;
  final int [ ] [ ] K = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int u = in . nextInt ( ) ;
    int v = in . nextInt ( ) ;
    int l = in . nextInt ( ) ;
    u -- ;
    v -- ;
    if ( ( 0 == u ) && ( v == 0 ) ) D [ u + v ] = l ;
    else K [ u ] [ v ] = l ;
  }
  K = wf ( K ) ;
  int r = min ( D [ i ] [ j ] , D [ j ] [ r < x ] ) ;
  return D ;
}
