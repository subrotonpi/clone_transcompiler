static final void main ( String [ ] args ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  String input = args [ 0 ] ;
  int N = Integer . parseInt ( input ) ;
  List < Integer > A = new LinkedList < Integer > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) A . add ( Integer . parseInt ( input ) ) ;
  Set < Integer > s = new HashSet < Integer > ( ) ;
  int le = 0 ;
  int ans = 0 ;
  int r = 0 ;
  int l = 0 ;
  while ( l < N && r < N ) {
    if ( ! A . contains ( A . get ( r ) ) ) {
      s . add ( A . get ( r ) ) ;
      r ++ ;
    }
    else {
      s . remove ( A . get ( l ) ) ;
      ans = Math . max ( ans , r - l ) ;
      l ++ ;
    }
  }
  ans = Math . max ( r - l , ans ) ;
  System . out . println ( ans ) ;
}
