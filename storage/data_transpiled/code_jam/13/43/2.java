@ SafeVarargs public static List < Edge > inferEdges ( int [ ] A ) {
  List < Edge > edges = new ArrayList < > ( ) ;
  for ( int j : xrange ( 0 , n ) ) {
    boolean seenPrev = false ;
    for ( int i : xrange ( j - 1 , - 1 , - 1 ) ) {
      if ( A [ i ] >= A [ j ] ) {
        edges . add ( new Edge ( j , i ) ) ;
      }
      else if ( A [ i ] + 1 == A [ j ] ) {
        if ( ! seenPrev ) {
          seenPrev = true ;
          edges . add ( new Edge ( i , j ) ) ;
        }
      }
    }
  }
  final Function < Integer , List < Edge >> rl = new Function < Integer , List < Edge >> ( ) {
    @ Override public List < Edge > apply ( Integer input ) {
      return new ArrayList < > ( ) ;
    }
  }
  ;
  final int cases = Integer . parseInt ( rl . apply ( new Integer ( 0 ) ) ) ;
  for ( int cc = 0 ;
  cc < cases ;
  cc ++ ) {
    int n = Integer . parseInt ( rl . apply ( new Integer ( 0 ) ) ) ;
    int [ ] A = ArrayUtil . toIntArray ( rl . apply ( new Integer ( 0 ) ) ) ;
    int [ ] B = ArrayUtil . toIntArray ( rl . apply ( new Integer ( 0 ) ) ) ;
    List < Edge > edges1 = inferEdges ( A ) ;
    List < Edge > edges2 = inferEdges ( Collections . reverseOrder ( B ) ) ;
    int [ ] edges2 = new int [ n ] ;
    for ( int i = 0 ;
    i < edges2 . length ;
    i ++ ) {
      edges2 [ i ] = edges2 . get ( i ) . end ( ) ;
    }
    List < Edge > out = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      out . add ( new ArrayList < > ( ) ) ;
    }
    int [ ] ind = new int [ n ] ;
    for ( int a = 0 ;
    a < edges1 . length ;
    a ++ ) {
      int b = edges1 [ a ] ;
      out . get ( a ) . add ( b ) ;
      ind [ b ] ++ ;
    }
    boolean [ ] taken = new boolean [ n ] ;
    int [ ] X = new int [ n ] ;
    for ( int num : xrange ( 1 , n + 1 ) ) {
      for ( int i =