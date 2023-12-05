@ VisibleForTesting static int solveProblem ( final int L , final int P , final int C ) throws IOException {
  final int intervals = ( int ) ceil ( log ( ( P + L - 1 ) / L , C ) ) ;
  int tests = 0 ;
  while ( intervals > 1 ) {
    tests ++ ;
    intervals = ( intervals + 1 ) / 2 ;
  }
  return tests ;
}
