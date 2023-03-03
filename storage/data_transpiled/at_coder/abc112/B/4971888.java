public static int N ( int T ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int T = Integer . parseInt ( input . nextLine ( ) ) ;
  ArrayList < Integer > clist = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int c = Integer . parseInt ( input . nextLine ( ) ) ;
    int t = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( t <= T ) {
      clist . add ( c ) ;
    }
  }
  if ( clist . size ( ) == 0 ) {
    System . out . println ( "TLE" ) ;
  }
  else {
    System . out . println ( Collections . min ( clist ) ) ;
  }
  return N ;
}
