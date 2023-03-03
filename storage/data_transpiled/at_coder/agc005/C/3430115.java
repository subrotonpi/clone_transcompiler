@ VisibleForTesting static void from ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  Counter < Integer > ctr = new Counter < Integer > ( A ) ;
  int maxa = max ( A ) ;
  int mina = min ( A ) ;
  {
    if ( mina != ( maxa + 1 ) ) return false ;
    if ( maxa % 2 == 0 ) return false ;
  }
}
