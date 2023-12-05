@ GwtIncompatible ( "java.util.concurrent.atomic.AtomicInteger" ) public static String [ ] [ ] calc2 ( final int [ ] grid , final int start , final int [ ] E , final int [ ] S ) {
  final int N = ints ( ) ;
  final int Q = ints ( ) ;
  final int [ ] [ ] E = new int [ N ] [ N ] ;
  final int [ ] [ ] S = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    E [ i ] = ints ( ) ;
    S [ i ] = ints ( ) ;
  }
  final int [ ] [ ] grid = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    grid [ i ] = ints ( ) ;
  }
  final int [ ] [ ] grid2 = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    grid2 [ i ] = calc ( grid , i , E [ i ] , S [ i ] ) ;
  }
  final String [ ] [ ] res = new String [ Q ] [ N ] ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    final int U = ints ( ) ;
    final int V = ints ( ) ;
    res [ i ] = calc2 ( grid2 , U - 1 , V - 1 ) ;
  }
  return res ;
}
