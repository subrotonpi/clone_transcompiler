@ VisibleForTesting static int [ ] solve ( ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final List < List < Integer >> _input = new ArrayList < > ( N ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    _input . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  int totalT = 1 ;
  int totalA = 1 ;
  for ( int t : _input ) {
    totalT = t ;
    totalA = a ;
  }
  return totalT ;
}
