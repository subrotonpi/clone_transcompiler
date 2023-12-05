public static final int [ ] getEdges ( ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  final List parents = new ArrayList ( ) ;
  final List edgecopy = new ArrayList ( ) ;
  /* DP */
  List childsizes = new ArrayList ( ) ;
  List aScores = new ArrayList ( ) ;
  for ( int i = 0 ;
  i < edges [ i ] . size ( ) ;
  i ++ ) {
    int child = edges [ i ] . get ( i ) ;
    if ( child == parents . get ( i ) ) continue ;
    parents . set ( i , i ) ;
    int size = DP ( child ) ;
    int score = DP ( child ) ;
    childsizes . add ( size ) ;
    aScores . add ( size - score ) ;
  }
  int totalsize = Integer . valueOf ( childsizes . size ( ) + 1 ) ;
  if ( childsizes . size ( ) < 2 ) {
    return new int [ ] {
      totalsize , totalsize - 1 }
      ;
    }
    else {
      Collections . sort ( aScores ) ;
      return new int [ ] {
        totalsize , totalsize - 1 - aScores . get ( aScores . size ( ) - 1 ) - aScores . get ( aScores . size ( ) - 2 ) }
        ;
      }
      int T = Integer . valueOf ( input . nextLine ( ) ) ;
      for ( int case = 1 ;
      case <= T ;
      case ++ ) {
        int N = Integer . valueOf ( input . nextLine ( ) ) ;
        edges = new ArrayList ( N ) ;
        for ( int i = 0 ;
        i < N ;
        i ++ ) {
          edges . add ( new int [ N ] ) ;
        }
        for ( int e = 0 ;
        e < N - 1 ;
        e ++ ) {
          int x = ( Integer . valueOf ( input . nextLine ( ) ) ) . intValue ( ) ;
          int y = ( Integer . valueOf ( input . nextLine ( ) ) ) . intValue ( ) ;
          edges . get ( x - 1 ) [ 0 ] = y - 1 ;
          edges . get ( y - 1 ) [ 0 ] = x - 1 ;
        }
        int ans = N ;
        for ( int root = 0 ;
        root < N ;
        root ++ ) {
          edgecopy . clear ( ) ;
          for ( int i = 0 ;
          i < N ;
          i ++ ) {
            edges . add ( edges . get ( i ) . clone ( ) ) ;
          }
          parents . clear ( ) ;
          parents . set ( root ) ;
          ( size , score ) = DP ( root ) ;
          ans