static final double sqrt ( double input ) {
  int N = Integer . parseInt ( input ) ;
  List < List < Integer >> c = new ArrayList < > ( N ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) c . add ( Collections . singletonList ( i ) ) ;
  double maxLengh = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = i ;
    j < N ;
    j ++ ) maxLengh = Math . max ( maxLengh , 1 ) ;
  }
  return maxLengh ;
}
