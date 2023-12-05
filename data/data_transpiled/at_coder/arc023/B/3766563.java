public static int H ( ) {
  int W = Integer . parseInt ( input . nextLine ( ) ) ;
  int T = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > A = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    A . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    for ( int j = 0 ;
    j < W ;
    j ++ ) {
      if ( ( i + j ) % 2 == T % 2 && ( i + j ) <= T ) {
        ans = Math . max ( ans , A . get ( i ) ) ;
      }
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
