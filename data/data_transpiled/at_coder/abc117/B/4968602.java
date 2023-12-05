public static int N ( ) {
  N = Integer . parseInt ( input ( ) ) ;
  List < Integer > L = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    L . add ( Integer . parseInt ( input ( ) ) ) ;
  }
  int maxL = Collections . max ( L ) ;
  L . remove ( maxL ) ;
  return maxL < sum ( L ) ? 'Yes' : 'No' ;
}
