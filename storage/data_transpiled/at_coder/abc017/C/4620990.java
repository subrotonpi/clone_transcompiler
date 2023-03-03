@ VisibleForTesting static int N ( ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int L = Integer . parseInt ( input . nextLine ( ) ) ;
  int R = Integer . parseInt ( input . nextLine ( ) ) ;
  int S = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int l = Integer . parseInt ( input . nextLine ( ) ) ;
    int r = Integer . parseInt ( input . nextLine ( ) ) ;
    int s = Integer . parseInt ( input . nextLine ( ) ) ;
    L += s ;
    R += s ;
    S += s ;
  }
  int now = L ;
  int ans = now ;
  for ( int i = 2 ;
  i <= 1 + M ;
  i ++ ) {
    now = now + L - R - R - 1 ;
    ans = Math . min ( ans , now ) ;
  }
  System . out . println ( S - ans ) ;
  return ans ;
}
