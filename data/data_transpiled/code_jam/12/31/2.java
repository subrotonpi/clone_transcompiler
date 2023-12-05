static boolean visit ( int l , List < Integer > [ ] G ) {
  final Set < Integer > visited = new HashSet < Integer > ( ) ;
  final LinkedList < Integer > stack = new LinkedList < Integer > ( ) ;
  stack . add ( l ) ;
  while ( stack . size ( ) > 0 ) {
    int n = stack . pop ( ) ;
    if ( visited . contains ( n ) ) {
      return true ;
    }
    visited . add ( n ) ;
    for ( int c : G [ n ] ) {
      stack . add ( c ) ;
    }
  }
  return false ;
}
int C = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
for ( int c = 0 ;
c < C ;
c ++ ) {
  int N = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  List < Integer > G = new ArrayList < Integer > ( ) ;
  final Set < Integer > leaves = new HashSet < Integer > ( N ) ;
  for ( int n = 0 ;
  n < N ;
  n ++ ) {
    int [ ] parents = ArrayUtil . newIntArray ( Integer . parseInt ( System . console ( ) . readLine ( ) ) ) ;
    G . add ( parents ) ;
    for ( int p : parents ) {
      if ( leaves . contains ( p ) ) {
        leaves . remove ( p ) ;
      }
    }
  }
  boolean diamondFound = false ;
  for ( int l : leaves ) {
    if ( visit ( l , G ) ) {
      diamondFound = true ;
      break ;
    }
  }
  System . out . println ( "Case #" + ( c + 1 ) + ": " + ( diamondFound ? "Yes" : "No" ) ) ;
}
