@ VisibleForTesting static long start ( ) {
  long start = System . currentTimeMillis ( ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > P = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    P . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  @ SuppressWarnings ( "unused" ) Random random = new Random ( ) ;
  return System . currentTimeMillis ( ) ;
}
