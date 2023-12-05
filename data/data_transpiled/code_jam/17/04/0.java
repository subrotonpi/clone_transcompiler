@ VisibleForTesting static void runTest ( int testIteration ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] startGrid = new int [ N ] [ N ] ;
  for ( int x = 0 ;
  x < N ;
  x ++ ) startGrid [ x ] [ x ] = '.' ;
  Set < Integer > freeRows = new HashSet < > ( ) ;
  Set < Integer > freeCols = new HashSet < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    newGrid [ r ] [ c ] = 'x' ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int r = input . nextInt ( ) ;
    int c = input . nextInt ( ) ;
    int r = Integer . parseInt ( input . nextLine ( ) ) ;
    int c = Integer . parseInt ( input . nextLine ( ) ) ;
    startGrid [ r ] [ c ] = m ;
    if ( newGrid [ r ] [ c ] == 'x' || newGrid [ r ] [ c ] == 'o' ) {
      score ++ ;
    }
    else if ( newGrid [ r ] [ c ] == '+' ) {
      score ++ ;
    }
    else {
      assert false ;
    }
    freeRows . remove ( r + c ) ;
    freeCols . remove ( c - c ) ;
  }
  int [ ] [ ] newGrid = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) newGrid [ i ] = startGrid [ i ] [ 0 ] ;
  assert freeRows . size ( ) == freeCols . size ( ) ;
  for ( int r = 0 ;
  r < N ;
  r ++ ) {
    int c = freeRows . get ( r ) ;
    if ( newGrid [ r ] [ c ] == '+' ) newGrid [ r ] [ c ] = 'o' ;
    else if ( newGrid [ r ] [ c ] == '.' ) newGrid [ r ] [ c ] = 'x' ;
    else assert false ;
  }
  List < Integer > squaresBySum = new ArrayList < > ( ) ;
  List < Integer > squaresByDiff = new ArrayList < > ( ) ;
  for ( int s = 0 ;
  s < N ;
  s ++ ) squaresBySum . add ( squaresBySum . get ( s ) ) ;
  