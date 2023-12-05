@ VisibleForTesting static int solve ( int testCase , int [ ] P , int [ ] Q , int [ ] R ) {
  Arrays . sort ( R ) ;
  final Map < Integer , Integer > S = new HashMap < > ( ) ;
  {
    int b ;
    int e ;
    int result ;
    int b ;
    int b ;
    int e ;
    if ( S . containsKey ( new Integer ( b ) ) ) {
      return S . get ( new Integer ( b ) ) ;
    }
    List < Integer > cells = Arrays . asList ( R ) ;
    if ( cells . size ( ) == 0 ) {
      return 0 ;
    }
    else {
      poss = new ArrayList < > ( cells . size ( ) ) ;
      for ( int i = 0 ;
      i < cells . size ( ) ;
      i ++ ) {
        cells . get ( i ) . add ( i ) ;
      }
      result = Math . min ( poss , b ) ;
      S . put ( new Integer ( b ) , result ) ;
      return result ;
    }
  }
  System . out . println ( "Case #" + testCase + ": " + findSolution ( 1 , P ) ) ;
  if ( __name__ . equals ( "java" ) ) {
    int N = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    for ( int n : xrange ( N ) ) {
      P [ ] = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
      Q [ n ] = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
      R [ n ] = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
      solve ( n + 1 , P , Q , R ) ;
    }
  }
  return 0 ;
}
