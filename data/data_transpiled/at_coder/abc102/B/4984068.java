public static int N ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  List < Integer > A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( i ) ;
  }
  int ans = 0 ;
  for ( int x : A ) {
    for ( int y : A ) {
      ans = Math . max ( Math . abs ( y - x ) , ans ) ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
