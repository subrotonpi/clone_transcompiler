public static final void main ( String [ ] args ) throws Exception {
  final ArgumentParser ap = new ArgumentParser ( ) ;
  ap . parse ( args ) ;
  final Scanner scanner = ap . getScanner ( ) ;
  final StringTokenizer toks = new StringTokenizer ( scanner . nextLine ( ) ) ;
  toks . nextToken ( ) ;
  final int T = Integer . parseInt ( toks . nextToken ( ) ) ;
  for ( int t = 0 ;
  t < xrange ( T ) ;
  t ++ ) {
    final int N = Integer . parseInt ( toks . nextToken ( ) ) ;
    final int K = Integer . parseInt ( toks . nextToken ( ) ) ;
    final double U = Double . parseDouble ( toks . nextToken ( ) ) ;
    final double [ ] P = new double [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      P [ i ] = Double . parseDouble ( toks . nextToken ( ) ) ;
    }
    assert N == K ;
    Arrays . sort ( P ) ;
    int span = 1 ;
    while ( true ) {
      while ( span < P . length && P [ 0 ] == P [ span ] ) {
        span ++ ;
      }
      if ( span == P . length ) {
        P [ 0 ] += U / span ;
        break ;
      }
      final double next = P [ span ] ;
      final double need = span * ( next - P [ 0 ] ) ;
      if ( U >= need ) {
        U -= need ;
        P [ 0 ] = next ;
      }
      else {
        P [ 0 ] += U / span ;
        break ;
      }
    }
    for ( int i = 0 ;
    i < xrange ( 1 , span ) ;
    i ++ ) {
      P [ i ] = P [ 0 ] ;
    }
    double r = 1 ;
    for ( double p : P ) {
      r *= p ;
    }
    System . out . println ( "Case #" + ( t + 1 ) + ": " + r ) ;
  }
}
