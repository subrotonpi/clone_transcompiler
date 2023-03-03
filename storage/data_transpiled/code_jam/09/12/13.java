static final int re = 0 , sys = 0 ;
final int NE = 0 ;
final int NW = 1 ;
final int SE = 2 ;
final int SW = 3 ;
{
  final int i = 0 ;
  final int c = 0 ;
  final int newCorner = 0 ;
  {
    if ( NE == i ) {
      return "NE" ;
    }
    else if ( NW == i ) {
      return "NW" ;
    }
    else if ( SE == i ) {
      return "SE" ;
    }
    else {
      System . out . println ( "  ignoring " + kid ) ;
    }
  }
  {
    final int [ ] lines = System . in . readInts ( ) ;
    final int C = Integer . parseInt ( lines [ 0 ] ) ;
    int l = 1 ;
    for ( int c = 0 ;
    c <= C ;
    ++ c ) {
      final int [ ] params = {
        Integer . parseInt ( lines [ l ++ ] ) , }
        ;
        assert ( c == 0 || c == 2 ) ;
        final int N = params . length ;
        final int M = params . length ;
        final int [ ] intersections = new int [ N ] ;
        for ( int n = 0 ;
        n < M ;
        ++ n ) {
          final int [ ] params = {
            Integer . parseInt ( lines [ l ++ ] ) , }
            ;
            assert ( n == M ) ;
            final int o = n * 3 ;
            final int S = params [ o + 0 ] , T = params [ o + 1 ] ;
            intersections [ ( n ++ ) ] = new Intersection ( S , W , T ) ;
          }
          final int [ ] fringe = new int [ M ] ;
          final int [ ] done = new int [ M ] ;
          {
            int start = Pos . N - 1 , W = 0 , t = 0 ;
          }
          public int getBegin ( ) {
            return ( t - t0 ) ;
          }
          public int getEnd ( ) {
            return ( t - t0 ) ;
          }
          public int getStart ( ) {
            return ( t - t0 ) ;
          }
          public int getEnd ( ) {
            return ( t - t0 ) ;
          }
          public int getStart ( ) {
            return ( t - t0 ) ;
          }
          public int getEnd ( ) {
            return ( t - t0 ) ;
          }
          public int getStart ( ) {
            return ( t - t0 ) ;
          }
          public int getEnd ( ) {
            return ( t - t0 ) ;
          }
        }
        ;
      }
      