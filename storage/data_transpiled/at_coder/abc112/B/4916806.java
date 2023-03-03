static final String print ( String [ ] args ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int T = Integer . parseInt ( input . nextLine ( ) ) ;
  final List < Pair < Integer , Integer >> CT = new ArrayList < > ( ) ;
  boolean isOK = false ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    final int c = Integer . parseInt ( input . nextLine ( ) ) ;
    final int t = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( t <= T ) {
      isOK = true ;
      CT . add ( new Pair < > ( c , t ) ) ;
    }
  }
  if ( isOK == false ) {
    System . out . println ( "TLE" ) ;
    System . exit ( 0 ) ;
  }
  CT . forEach ( c -> {
    final int t = CT . get ( 0 ) . compareTo ( c ) ;
    System . out . println ( c ) ;
  }
  ) ;
  if ( className . equals ( "java.util.concurrent.ForkJoinPool" ) ) {
    System . out . println ( "All tests passed" ) ;
  }
  return "" ;
}
