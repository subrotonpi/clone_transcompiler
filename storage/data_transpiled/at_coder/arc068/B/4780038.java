public static void print ( String input ) {
  int N = Integer . parseInt ( input ) ;
  List < Integer > A = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( Integer . parseInt ( input ) ) ;
  }
  Set < Integer > st = new HashSet < > ( A ) ;
  st . addAll ( A ) ;
  int res = st . size ( ) ;
  if ( ( N - res ) % 2 == 0 ) {
    System . out . println ( res ) ;
  }
  else {
    System . out . println ( res - 1 ) ;
  }
}
