static final int [ ] getEdges ( ) {
  final int INF = 10 * 18 ;
  final int MOD = 10 * 9 + 7 ;
  {
    final int [ ] LI = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      LI [ i ] = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    }
    final int [ ] LI_ = new int [ N ] ;
    for ( int i = 0 ;
    i < LI_ . length ;
    i ++ ) {
      LI_ [ i ] = Integer . parseInt ( System . console ( ) . readLine ( ) ) - 1 ;
    }
    final float [ ] LF = new float [ N ] ;
    for ( float f : LF ) {
      LF [ i ] = Float . parseFloat ( System . console ( ) . readLine ( ) ) ;
    }
    final double [ ] LS = new double [ N ] ;
    for ( int i = 0 ;
    i < LS ;
    i ++ ) {
      LS [ i ] = Double . parseDouble ( System . console ( ) . readLine ( ) ) ;
    }
    final int II = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    final int SI = input ( ) ;
    @ SuppressWarnings ( "unchecked" ) final int N = LI [ 0 ] ;
    final int M = LI_ [ 0 ] ;
    final Map < Integer , Integer > edges = new TreeMap < Integer , Integer > ( ) ;
    for ( int i = 0 ;
    i < M ;
    i ++ ) {
      final int a = LI_ [ i ] ;
      final int b = LI_ [ i ] ;
      edges . put ( a , b ) ;
      edges . put ( b , a ) ;
    }
    final int [ ] quads = new int [ N ] ;
    int large = 0 ;
    for ( final Map . Entry < Integer , Integer > e : edges . entrySet ( ) ) {
      final int c = e . getKey ( ) . intValue ( ) ;
      if ( c % 2 == 1 ) {
        return "No" ;
      }
      if ( c >= 6 ) {
        large ++ ;
      }
      if ( c == 4 ) {
        quads [ large ++ ] = e . getKey ( ) ;
      }
    }
    if ( large > 0 ) {
      return "Yes" ;
    }
    if ( quads . length > 2 ) {
      return "Yes" ;
    }
    if ( quads . length < 2 ) {
      return "No" ;
    }
    for ( int v : edges . get ( quads [ 0 ] ) ) {
      final int [ ] visited =