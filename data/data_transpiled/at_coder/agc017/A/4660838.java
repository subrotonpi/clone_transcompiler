public static int N ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) , P = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > lst_A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    lst_A . add ( i ) ;
  }
  int lst_OddEven = lst_A . size ( ) ;
  int ans ;
  if ( 1 == lst_OddEven ) {
    ans = 2 * ( N - 1 ) ;
  }
  else {
    ans = 0 ;
  }
  return ans ;
}
