public static int N ( ) {
  int T = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > t = Lists . newArrayList ( ) ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    t . add ( i ) ;
  }
  int ans = T ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    ans += Math . min ( t . get ( i ) - t . get ( i - 1 ) , T ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
