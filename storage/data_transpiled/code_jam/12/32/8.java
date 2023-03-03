static final double [ ] [ ] solve ( ) throws IOException {
  final double infinite = 1E+9 ;
  class DiamondInheritance implements Runnable {
    @ Override public void run ( ) throws IOException {
    }
    @ Override public double dist ( double v , double a , double t ) {
      return v * t + 0.5 * a * ( t * t ) ;
    }
    @ Override public void modify ( double [ ] T , double [ ] X , double [ ] D ) {
      if ( T . length == 1 || X [ 0 ] >= D ) {
        return ;
      }
      final double [ ] _X = new double [ T . length ] , _T = new double [ T . length ] ;
      for ( int j = 0 ;
      j < T . length ;
      j ++ ) {
        final double [ ] row = fi . next ( ) . split ( ) ;
        t [ j ] = Double . parseDouble ( row [ 0 ] ) ;
        x [ j ] = Double . parseDouble ( row [ 1 ] ) ;
      }
      Arrays . fill ( T , Double . parseDouble ( D ) ) ;
      return ;
    }
  }
  {
    final PrintStream fo = new PrintStream ( output ) ;
    final DiamondInheritance problem = new DiamondInheritance ( ) ;
    for ( int i = 0 ;
    i < T . length ;
    i ++ ) {
      final double [ ] _X = new double [ T . length ] , _T = new double [ T . length ] ;
      for ( int j = 0 ;
      j < T . length ;
      j ++ ) {
        final double v = ( X [ i ] - X [ j ] ) / ( T [ i ] - T [ j ] ) ;
        _T [ i ] = T [ i ] + ( D - X [ i - 1 ] ) / v ;
        _X [ i ] = D ;
        _T [ i ] = infinite ;
        _X [ j ] = D ;
        break ;
      }
    }
  }
  @ Override public double [ ] subsol ( double pos , double v , double a , double x ) {
    final double [ ] T = modify ( T , X , D ) ;
    final double v = 0 , pos = 0 , _t = 0 , _x = X [ 0 ] ;
    for ( int i = 1 ;
    i < T . length ;
    i ++ ) {
      final double [ ] c = T [ i ] ;
      final double t = c [ i ] ;
      final double x = c [ i ] ;
      if ( pos + dist ( v , a , t - _t ) >= x ) {
        return