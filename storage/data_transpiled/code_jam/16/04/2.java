static final String solve ( final Solver solver , final String fn , final String outFn ) {
  final String inFn = fn + ".in" ;
  if ( outFn == null ) {
    outFn = fn + ".out" ;
  }
  final String inFn = fn + ".in" ;
  final String outFn = fn + ".out" ;
  final String inFn = fn + ".in" ;
  final String outFn = fn + ".out" ;
  final String inFn = fn + ".in" ;
  final String outFn = fn + ".out" ;
  final int K = inFn ;
  final int C = inFn ;
  final int S = inFn ;
  final int [ ] I = new int [ ( K - 1 ) / C + 1 ] ;
  for ( int i = 0 ;
  i < I . length ;
  i ++ ) {
    I [ i ] = inFn ;
  }
  for ( int i = 0 ;
  i < C ;
  i ++ ) {
    I [ i ] = inFn ;
  }
  if ( I . length > S ) {
    return "IMPOSSIBLE" ;
  }
  final StringBuilder res = new StringBuilder ( ) ;
  for ( int i = 0 ;
  i < C ;
  i ++ ) {
    res . append ( Math . pow ( Math . min ( I [ i ] , K - 1 ) * K * C , i ) ) ;
  }
  for ( int i = 0 ;
  i < C ;
  i ++ ) {
    res . append ( Math . pow ( i , S ) ) ;
  }
  for ( int i = 0 ;
  i < C ;
  i ++ ) {
    res . append ( Math . pow ( i , S ) ) ;
  }
  return res . toString ( ) ;
}
