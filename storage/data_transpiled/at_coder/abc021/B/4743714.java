public static void print ( int N ) {
  int x = Integer . parseInt ( input . nextLine ( ) ) ;
  int y = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > P = new LinkedList < Integer > ( ) ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    P . add ( i ) ;
  }
  P . add ( x ) ;
  P . add ( y ) ;
  Set < Integer > Pa = new HashSet < Integer > ( P ) ;
  if ( Pa . size ( ) != P . size ( ) ) {
    System . out . println ( "NO" ) ;
  }
  else {
    System . out . println ( "YES" ) ;
  }
}
