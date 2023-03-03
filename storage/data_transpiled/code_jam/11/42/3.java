static final String solve ( ) throws IOException {
  final String [ ] args = new String [ ] {
    "" }
    ;
    final int R = Integer . parseInt ( args [ 0 ] ) ;
    final int C = Integer . parseInt ( args [ 1 ] ) ;
    final int W = Integer . parseInt ( args [ 2 ] ) ;
    final int [ ] [ ] result = new int [ R ] [ C ] ;
    for ( int i = 0 ;
    i < R ;
    i += 2 ) {
      for ( int j = 0 ;
      j < C - k + 1 ;
      j ++ ) {
        result [ i ] [ j ] += result [ i ] [ j ] ;
      }
    }
    System . out . println ( "IMPOSSIBLE" ) ;
    if ( args . length != 2 ) {
      System . err . println ( "specify input file" ) ;
      exit ( ) ;
    }
    final long startTime = System . nanoTime ( ) ;
    final File fin = new File ( args [ 0 ] ) ;
    final File fout = new File ( args [ 1 ] + ".out" ) ;
    final int numCases = Integer . parseInt ( next ( fin ) ) ;
    for ( int j = 0 ;
    j < numCases ;
    j ++ ) {
      System . err . println ( "\b" + 100 * caseNo / numCases + ":" + j ) ;
      System . err . println ( "Case #" + ( j + 1 ) + ":" + j ) ;
      solve ( ) ;
    }
    try {
      next ( ) ;
      assert false : "not all lines are processed" ;
    }
    catch ( final NoSuchElementException e ) {
    }
    fin . delete ( ) ;
    System . err . println ( "Pass in file" ) ;
    final long endTime = System . nanoTime ( ) ;
    final long endTime = System . nanoTime ( ) ;
    final long [ ] [ ] result = new int [ M ] [ M ] ;
    for ( int i = 0 ;
    i < h ;
    i ++ ) {
      for ( int j = 0 ;
      j < w ;
      j ++ ) {
        result [ i ] [ j ] *= vx * j + vy * i ;
      }
    }
    final long endTime = System . nanoTime ( ) ;
    final long endTime = System . nanoTime ( ) ;
    final long [ ] [ ] weights = new long [ M ] [ M ] ;
    for ( int i = 0 ;
    i < M ;
    i ++ ) {
      weights [ i ] = map . get ( j , j ) ;
    }
    for