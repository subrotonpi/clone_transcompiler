@ VisibleForTesting static Iterable < Integer > combinations ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  List < Integer > COLOR = new ArrayList < > ( N ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    COLOR . add ( Integer . parseInt ( input ( ) ) ) ;
  }
  List < Integer > colors = new ArrayList < > ( ) ;
  for ( int k = 0 ;
  k < COLOR . size ( ) ;
  k ++ ) {
    colors . add ( k ) ;
  }
  if ( colors . size ( ) == 1 ) {
    System . out . println ( colors . get ( 0 ) ) ;
  }
  return colors ;
}
