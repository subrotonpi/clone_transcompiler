public static int N = Integer . parseInt ( input ) {
  String S = input . nextLine ( ) ;
  int ans = 0 ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    Set < Integer > x = new HashSet < Integer > ( S . substring ( 0 , i + 1 ) ) ;
    Set < Integer > y = new HashSet < Integer > ( S . substring ( i + 1 ) ) ;
    int cnt = 0 ;
    for ( Integer j : x ) {
      if ( y . contains ( j ) ) {
        cnt ++ ;
      }
    }
    ans = Math . max ( ans , cnt ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
