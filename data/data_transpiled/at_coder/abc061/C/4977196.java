@ MoreRequires public static void main ( String [ ] args ) {
  final int N = ( Integer ) input . nextInt ( ) ;
  final int K = ( Integer ) input . nextInt ( ) ;
  final Map < String , Integer > map = new HashMap < > ( ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    final String s1 = ( String ) input . next ( ) ;
    final int s2 = ( Integer ) input . next ( ) ;
    if ( ! map . containsKey ( s1 ) ) {
      map . put ( s1 , s2 ) ;
    }
    else {
      map . get ( s1 ) + = s2 ;
    }
  }
  int index = 0 ;
  for ( Map . Entry < String , Integer > e : map . entrySet ( ) ) {
    index += e . getValue ( ) ;
    if ( ( index >= K ) && ( ans == e . getValue ( ) ) ) {
      ans = e . getKey ( ) ;
      break ;
    }
  }
  System . out . println ( ans ) ;
}
