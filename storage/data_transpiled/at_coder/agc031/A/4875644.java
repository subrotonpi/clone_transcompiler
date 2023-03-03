public static int N = Integer . parseInt ( input ) {
  String S = input . nextLine ( ) ;
  final int MOD = 1000000007 ;
  int ans = 1 ;
  for ( String e : new HashSet < String > ( S ) ) {
    int cnt = 0 ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      if ( S . charAt ( i ) == e ) {
        cnt ++ ;
      }
    }
    ans *= cnt + 1 ;
  }
  System . out . println ( ( ans - 1 ) % MOD ) ;
  return ans ;
}
