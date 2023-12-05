public static int N = Integer . parseInt ( input ) {
  final List < Interval > intervals = ImmutableList . copyOf ( Splitter . on ( ',' ) . split ( input ) ) ;
  final List < Integer > L = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    L . add ( i ) ;
  }
  final List < Integer > R = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    R . add ( i ) ;
  }
  return R . size ( ) ;
}
