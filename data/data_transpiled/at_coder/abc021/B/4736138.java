public static void main ( String [ ] args ) {
  N = Integer . parseInt ( input . nextLine ( ) ) ;
  a = Integer . parseInt ( input . nextLine ( ) ) ;
  b = Integer . parseInt ( input . nextLine ( ) ) ;
  K = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > P = new LinkedList < Integer > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    P . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  if ( P . contains ( a ) || P . contains ( b ) ) {
    System . out . println ( "NO" ) ;
    exit ( ) ;
  }
  if ( new HashSet < Integer > ( P ) . size ( ) == P . size ( ) ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
}
