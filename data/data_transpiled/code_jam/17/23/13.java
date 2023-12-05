@ VisibleForTesting static String print ( Scanner in ) {
  String nextLine = in . nextLine ( ) ;
  int T = in . nextInt ( ) ;
  for ( int t = 0 ;
  t <= T ;
  t ++ ) {
    int N = in . nextInt ( ) ;
    int Q = in . nextInt ( ) ;
    int [ ] [ ] curDist = new int [ N ] [ Q ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      int E = in . nextInt ( ) ;
      int S = in . nextInt ( ) ;
      curDist [ i ] [ j ] = in . nextInt ( ) ;
    }
    Arrays . sort ( curDist ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      for ( int j = 0 ;
      j < N ;
      j ++ ) {
        if ( curDist [ i ] [ j ] == - 1 ) {
          curDist [ i ] [ j ] = Double . MAX_VALUE ;
        }
      }
    }
  }
  List < int [ ] > Queries = new ArrayList < > ( ) ;
  for ( int q = 0 ;
  q < Q ;
  q ++ ) {
    queries . add ( in . nextInt ( ) ) ;
  }
  double [ ] [ ] Times = new double [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    double [ ] curDist = new double [ N ] ;
    curDist [ i ] = 0 ;
    Set < Integer > Unvisited = new HashSet < > ( ) ;
    Set < Integer > Visited = new HashSet < > ( ) ;
    while ( Unvisited . size ( ) > 0 ) {
      int exploring = Math . min ( Unvisited . size ( ) , curDist [ i ] ) ;
      if ( curDist [ exploring ] == Double . MAX_VALUE ) break ;
      for ( int j = 0 ;
      j < N ;
      j ++ ) {
        curDist [ j ] = Math . min ( curDist [ j ] , curDist [ exploring ] + Dist [ exploring ] [ j ] ) ;
      }
      Unvisited . remove ( exploring ) ;
      Visited . add ( exploring ) ;
    }
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      if ( curDist [ j ] <= Horses [ i ] [ 0 ] ) {
        Times [ i ] [ j ] = Math . min ( Times [ i ] [ j ] , ( double ) curDist [ j ] / Horses [ i ] [ 1 ] )