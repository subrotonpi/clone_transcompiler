public static int N ( ) {
  N = Integer . parseInt ( input ( ) ) ;
  List < Integer > nums = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) nums . add ( Integer . parseInt ( input ( ) ) ) ;
  return ( max ( nums ) - min ( nums ) ) ;
}
