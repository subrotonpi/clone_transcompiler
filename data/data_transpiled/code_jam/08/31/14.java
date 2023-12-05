static final Scanner getScanner ( ) throws FileNotFoundException {
  final Scanner input = new Scanner ( System . in ) ;
  final PrintWriter output = new PrintWriter ( "codejam.out" ) ;
  int caseN = 0 ;
  int testCase = 0 ;
  int P = 0 ;
  int K = 0 ;
  int L = 0 ;
  while ( input . hasNextLine ( ) ) {
    String line = input . nextLine ( ) ;
    if ( caseN == 0 ) {
      caseN = Integer . parseInt ( line ) ;
      continue ;
    }
    if ( P == 0 ) {
      final int [ ] intLine = Integer . parseInt ( line ) ;
      P = intLine [ 0 ] ;
      K = intLine [ 1 ] ;
      L = intLine [ 2 ] ;
    }
    else {
      return null ;
    }
  }
  return input ;
}
