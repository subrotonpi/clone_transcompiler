public static void N ( int N ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > X = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    X . add ( i ) ;
  }
  int ans = 0 ;
  for ( Integer x : X ) {
    ans += 2 * Math . min ( x , Math . abs ( K - x ) ) ;
  }
  System . out . println ( ans ) ;
}
