public static int calculateNumOfDivisor ( int N ) {
  List < Integer > yakusuu = new ArrayList < Integer > ( ) ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    if ( N % i == 0 ) {
      yakusuu . add ( i ) ;
    }
  }
  return yakusuu . size ( ) ;
}
