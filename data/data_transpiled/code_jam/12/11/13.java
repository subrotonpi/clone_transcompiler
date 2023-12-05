private static Scanner scanner = new Scanner ( System . in ) {
  @ Override public void close ( ) throws IOException {
  }
}
;
int testCases = Integer . parseInt ( scanner . nextLine ( ) . trim ( ) ) ;
for ( int test_case = 0 ;
test_case < testCases ;
test_case ++ ) {
  int a = ( Integer ) scanner . nextLine ( ) . trim ( ) ;
  int b = ( Integer ) scanner . nextLine ( ) . trim ( ) ;
  double [ ] probabilities = new double [ a ] ;
  for ( int i = 0 ;
  i < probabilities . length ;
  i ++ ) {
    probabilities [ i ] = Double . parseDouble ( scanner . nextLine ( ) . trim ( ) ) ;
  }
  assert ( probabilities . length == a ) ;
  int keystrokesEnter = 2 + b ;
  Map < Integer , Integer > keystrokesBackspace = new HashMap < Integer , Integer > ( ) ;
}
