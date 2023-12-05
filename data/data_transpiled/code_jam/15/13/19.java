@ CJLib . Parallel ( ) public static String [ ] [ ] run ( String currFileName ) {
  final String currFileName = "C-small-attempt0" ;
  final Scanner inputDividingScanner = new Scanner ( System . in ) ;
  final String currFileName = currFileName + "-" ;
  final int subr = Integer . parseInt ( inputDividingScanner . nextLine ( ) ) ;
  final String [ ] [ ] caseInputs = new String [ subr ] [ ] ;
  for ( int i = 0 ;
  i < subr ;
  i ++ ) {
    final int N = Integer . parseInt ( inputDividingScanner . nextLine ( ) ) ;
    final String [ ] t = new String [ N ] ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      t [ j ] = map ( Integer . parseInt ( inputDividingScanner . nextLine ( ) ) , Integer . parseInt ( inputDividingScanner . nextLine ( ) ) ) ;
    }
    caseInputs [ i ] = t ;
  }
  return caseInputs ;
}
