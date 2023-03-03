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
      LS [ i ] = Float . parseFloat ( System . console ( ) . readLine ( ) ) ;
    }
    final int [ ] LS = new int [ N ] ;
    for ( int i = 0 ;
    i < LS ;
    i ++ ) {
      LS [ i ] = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    }
    final int II = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    final int SI = input ( ) ;
    @ SuppressWarnings ( "unused" ) final int N = LI [ i ] ;
    final int M = LI_ [ i ] ;
    final Map < Integer , Set < Integer >> edges = new HashMap < Integer , Set < Integer >> ( ) ;
    for ( int i = 0 ;
    i < M ;
    i ++ ) {
      final int a = LI_ [ i ] ;
      final int b = LI_ [ i ] ;
      edges . put ( a , b ) ;
      edges . get ( b ) . add ( a ) ;
    }
    final Set < Integer > quads = new HashSet < Integer > ( ) ;
    int sixes = 0 ;
    for ( final Map . Entry < Integer , Set < Integer >> e : edges . entrySet ( ) ) {
      final int c = e . getKey ( ) . intValue ( ) ;
      if ( c % 2 == 1 ) {
        return false ;
      }
      if ( c >= 6 ) {
        sixes ++ ;
      }
      if ( c == 4 ) {
        quads . add ( e . getKey ( ) ) ;
      }
    }
    if ( sixes > 0 ) {
      return true ;
    }
    if ( quads . size ( ) > 2 ) {
      return true ;
    }
    if ( quads . size ( ) < 2 ) {
      return false ;
    }
    final int s = quads . iterator ( )