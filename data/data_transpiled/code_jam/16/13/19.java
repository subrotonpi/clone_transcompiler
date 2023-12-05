public static int longestdfs ( List < List < Integer >> inedges , int start , Set < Integer > set ) {
  set . add ( start ) ;
  if ( inedges . get ( start ) . isEmpty ( ) ) return 1 ;
  List < Integer > candidates = new ArrayList < > ( ) ;
  for ( List < Integer > inedge : inedges . get ( start ) ) {
    candidates . add ( longestdfs ( inedges , inedge , set ) ) ;
  }
  return Collections . max ( candidates ) + 1 ;
}
int cases = Integer . parseInt ( input . nextLine ( ) ) ;
for ( int testCase = 0 ;
testCase < cases ;
testCase ++ ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > toEdges = new ArrayList < > ( ) ;
  for ( String s : input . nextLine ( ) . split ( " " ) ) {
    toEdges . add ( Integer . parseInt ( s ) - 1 ) ;
  }
  List < List < Integer >> inEdges = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < toEdges . size ( ) ;
  i ++ ) {
    List < Integer > toEdges = new ArrayList < > ( ) ;
    for ( String s : input . nextLine ( ) . split ( " " ) ) {
      toEdges . add ( s ) ;
    }
    List < Integer > mutuals = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < toEdges . size ( ) ;
    i ++ ) {
      int to = toEdges . get ( i ) ;
      if ( toEdges . get ( to ) . equals ( i ) && to > i ) {
        mutuals . add ( new Integer ( to ) ) ;
        inEdges . get ( to ) . remove ( i ) ;
        inEdges . get ( i ) . remove ( to ) ;
      }
    }
    List < Integer > mdepths = new ArrayList < > ( ) ;
    Set < Integer > set = new HashSet < > ( ) ;
    for ( int a : mutuals ) {
      int b = mutuals . get ( a ) ;
      mdepths . add ( longestdfs ( inedges , a , set ) + longestdfs ( inedges , b , set ) ) ;
    }
    int cyclemax = 0 ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      if ( set . contains ( i ) ) continue ;
      set . add ( i )