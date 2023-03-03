@ VisibleForTesting static final boolean isBlack ( ) {
  final boolean AIR = true ;
  final boolean ROCK = false ;
  {
    final Ref < Pos > ret = new Ref < > ( ) ;
    hpush ( ret , ( ) -> {
      final Pos pos = new Pos ( ) ;
      pos . numDigs = 1 ;
      pos . c = - 1 ;
      return pos ;
    }
    ) ;
  }
  {
    final Ref < Pos > ret = new Ref < > ( ) ;
    if ( R - 1 == R ) {
      return ret ;
    }
    if ( R - 1 == R ) {
      return hpop ( ) . get ( ) ;
    }
    final Ref < Pair < Integer , Integer >> kids = p . generate ( R , F ) ;
    for ( final Pair < Integer , Integer > kid : kids ) {
      if ( ! done . containsKey ( doneKey ( kid ) ) ) {
        LOG . debug ( "new kid: " + kid ) ;
        ret . set ( kid ) ;
      }
    }
    return ret ;
  }
  private final Ref < Pair < Integer , Integer >> fallDist ( final Map < Integer , Integer > map , final int R , final int pos ) {
    final int rOrig = pos ;
    final int cOrig = pos ;
    int r = rOrig + 1 ;
    while ( r < R && map . get ( new Pair < > ( r , cOrig ) ) . equals ( AIR ) ) {
      r = r + 1 ;
    }
    return r - rOrig - 1 ;
  }
  private final Ref < Pair < Integer , Integer >> getPosAfterFar ( final Map < Integer , Integer > map , final int R , final int pos ) {
    final int d = fallDist ( map , R , pos ) ;
    final int [ ] sc = new int [ C ] ;
    for ( int i = 0 ;
    i < sc . length ;
    i ++ ) {
      sc [ i ] = lines . get ( L ) . intValue ( ) - 1 ;
    }
    final List < Pair < Integer , Integer >> cols = new ArrayList < > ( ) ;
    for ( final Pair < Integer , Integer > pair : sc ) {
      cols . add ( readCell ( pair ) ) ;
    }
    map . put ( "id" , NEXT_MAP_ID ++ ) ;
    LOG . debug ( strMap ( map , R , C ) ) ;
    final Ref < Pair < Integer , Integer >> fringe = new Ref < > ( ) ;
    final Ref < Pair < Integer , Integer >> result = new Ref < >