public static final int [ ] [ ] compress ( final int [ ] [ ] [ ] xCompressor , final int [ ] yCompressor ) {
  final int [ ] [ ] [ ] in = new int [ xCompressor . length ] [ yCompressor . length ] [ ] ;
  System . arraycopy ( xCompressor , 0 , in [ 0 ] , 0 , xCompressor . length ) ;
  System . arraycopy ( yCompressor , 0 , in [ 0 ] , 0 , yCompressor . length ) ;
  final int [ ] [ ] [ ] in = new int [ xCompressor . length ] [ yCompressor . length ] [ ] ;
  for ( int i = 0 ;
  i < xCompressor . length ;
  i ++ ) {
    in [ i ] [ 0 ] = in [ i ] [ 0 ] ;
  }
  final int [ ] [ ] grid = cum_2d ( in ) ;
  final double ans = Double . POSITIVE_INFINITY ;
  for ( int xleft = 1 ;
  xleft < n ;
  xright ++ ) {
    for ( int ylow = 1 ;
    ylow < n ;
    yhigh ++ ) {
      if ( grid [ xright ] [ yhigh ] - grid [ xright - 1 ] [ ylow ] + grid [ xleft - 1 ] [ ylow - 1 ] < k ) continue ;
      final int xnw = xDecomposition [ xleft ] [ ylow ] ;
      final int xne = xDecomposition [ yhigh ] ;
      final int yse = yDecomposition [ ylow ] ;
      ans = Math . min ( ans , ( xne - xnw ) * ( yse - yse ) ) ;
    }
  }
  System . arraycopy ( in , 0 , in [ 0 ] , 0 , xCompressor . length ) ;
  final int ni = ( int ) ( in [ 0 ] . length * ( xCompressor . length - 1 ) ) ;
  final int nf = ( float ) ( in [ 0 ] . length * ( xCompressor . length - 1 ) ) ;
  final int [ ] [ ] [ ] in = new int [ xCompressor . length ] [ yCompressor . length ] [ ] ;
  for ( int i = 0 ;
  i < xCompressor . length ;
  i ++ ) {
    in [ i ] [ 0 ] = in [ i ] [ 0 ] ;
  }
  final int [ ] [ ] in = new int [ xCompressor . length ] [ yCompressor . length ] ;
  for ( int i = 0 ;
  i < yCompressor . length ;
  i ++ ) {
    in [ i