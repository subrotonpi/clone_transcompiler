@ VisibleForTesting static void sort ( ) {
  final int MOD = 1000000007 ;
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final String S1 = input . nextLine ( ) ;
  final String S2 = input . nextLine ( ) ;
  int i = 0 ;
  String prev = null ;
  int ans = 1 ;
  while ( i < N ) {
    if ( S1 . charAt ( i ) == S2 . charAt ( i ) ) {
      if ( prev == null ) {
        ans *= 3 ;
      }
      if ( prev . equals ( "ver" ) ) {
        ans *= 2 ;
      }
      if ( prev . equals ( "hor" ) ) {
      }
      prev = "ver" ;
      i ++ ;
    }
    else {
      if ( prev == null ) {
        ans *= 6 ;
      }
      if ( prev . equals ( "ver" ) ) {
        ans *= 2 ;
      }
      if ( prev . equals ( "hor" ) ) {
        ans *= 3 ;
      }
      prev = "hor" ;
      i += 2 ;
    }
    ans %= MOD ;
  }
  System . out . println ( ans ) ;
}
