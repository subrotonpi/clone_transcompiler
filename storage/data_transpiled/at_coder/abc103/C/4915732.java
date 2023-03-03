public static int N ( ) {
  N = Integer . parseInt ( input ( ) ) ;
  List < Integer > aList = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    aList . add ( Integer . parseInt ( input ( ) ) ) ;
  }
  return ( sum ( aList ) - aList . size ( ) ) ;
}
