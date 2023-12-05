static final Scanner getScanner ( Scanner in , int casenum ) {
  final Scanner scanner = new Scanner ( in ) ;
  int T = Integer . parseInt ( scanner . nextLine ( ) ) ;
  for ( int k : xrange ( T ) ) {
    doCase ( scanner , k + 1 ) ;
  }
  return scanner ;
}
