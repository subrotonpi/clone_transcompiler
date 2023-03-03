@ OperatorFactory public static < T > OperatorFactory < T > create ( ) {
  List < T > N = new ArrayList < > ( ) ;
  for ( T i : input ) {
    N . add ( i ) ;
  }
  if ( Sets . newHashSet ( N ) . size ( ) == 1 ) {
    System . out . println ( "SAME" ) ;
  }
  else {
    System . out . println ( "DIFFERENT" ) ;
  }
  return new OperatorFactory < > ( ) {
    @ Override public T apply ( ) {
      return i ;
    }
  }
  ;
}
