static private int [ ] [ ] isHappy ( int [ ] flavors , ArrayList < ArrayList < String >> custLikes ) throws IOException {
  int happy ;
  for ( ArrayList < String > c : custLikes ) {
    happy = 0 ;
    for ( int f = 0 ;
    f < c . size ( ) ;
    f ++ ) {
      if ( flavors [ f - 1 ] . equals ( c . get ( f ) ) ) happy = 1 ;
    }
    if ( ! ( happy = System . in . read ( ) ) . equals ( "__main__" ) ) fpin = new FileReader ( System . in ) ;
    if ( args . length > 2 ) fpout = new PrintStream ( args [ 2 ] ) ;
    else fpout = new PrintStream ( args [ 1 ] ) ;
    int cases = Integer . parseInt ( fpin . readLine ( ) . trim ( ) ) ;
    for ( int m = 1 ;
    m < cases ;
    m ++ ) {
      final int [ ] thisLike = new int [ numFlavors ] ;
      Arrays . fill ( thisLike , ( int ) ( m * 2 ) ) ;
      custLikes . add ( thisLike ) ;
    }
    for ( int j = 0 ;
    j < M ;
    j ++ ) {
      if ( flavors [ j ] == '?' ) {
        flavors [ j ] = 0 ;
      }
    }
    if ( isHappy ( flavors , custLikes ) ) return flavors ;
    if ( i == 0 ) return 0 ;
    for ( int j = k + 1 ;
    j < flavors . length ;
    j ++ ) {
      final ArrayList < String > p = new ArrayList < String > ( ) ;
      for ( String s : flavors ) p . add ( s ) ;
      p . set ( j , 1 ) ;
      final int c = canResolve ( custLikes , numFlavors , i - 1 , j , p ) ;
      if ( c != 0 ) return c ;
    }
    return 0 ;
  }
  /* main case */
  {
    final int [ ] [ ] flavors = new int [ numFlavors ] ;
    Arrays . fill ( flavors , "?" ) ;
    boolean changed = true ;
    int mCount = 0 ;
    while ( changed ) {
      changed = false ;
      for ( ArrayList < String > c : Arrays . asList ( custLikes ) ) {
        if ( c . size ( ) == 1 ) {
          final int f = c . get ( 0 ) ;
          final int m = c . get ( 1 ) ;
          flavors [ f - 1 ] = m