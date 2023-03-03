static final int _T = Integer . parseInt ( readLine ( ) ) ;
for ( int _t = 1 ;
_t <= _T ;
++ _t ) {
  int N = Integer . parseInt ( readLine ( ) ) ;
  int S = Integer . parseInt ( readLine ( ) ) ;
  int [ ] [ ] A = new int [ N ] [ ] ;
  for ( int i = 0 ;
  i < N ;
  ++ i ) {
    A [ i ] = Integer . parseInt ( readLine ( ) ) ;
  }
  boolean [ ] V = new boolean [ N ] ;
  double [ ] D = new double [ N ] ;
  PriorityQueue < Point > Q = new PriorityQueue < > ( ) ;
  Q . add ( new Point ( 0.0 , 0 ) ) ;
  while ( ! V [ 1 ] ) {
    final double d = Double . parseDouble ( readLine ( ) ) ;
    final int i = Integer . parseInt ( readLine ( ) ) ;
    D [ i ] = d ;
    V [ i ] = true ;
    for ( int j = 0 ;
    j < N ;
    ++ j ) {
      if ( V [ j ] ) continue ;
      final double dx = A [ i ] [ 0 ] - A [ j ] [ 0 ] ;
      final double dy = A [ i ] [ 1 ] - A [ j ] [ 1 ] ;
      final double dz = A [ i ] [ 2 ] - A [ j ] [ 2 ] ;
      final double dd = ( dx * dx + dy * dy + dz * dz ) * 0.5 ;
      final double nd = Math . max ( d , dd ) ;
      new Point ( Q , nd ) ;
    }
  }
  double res = D [ 1 ] ;
  System . out . println ( "Case #" + _t + ": " + res ) ;
}
