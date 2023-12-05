public static int N ( ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = 0 ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    int N10000 = i / 10000 ;
    int N1000 = i / 1000 - N10000 * 10 ;
    int N100 = i / 100 - N10000 * 100 - N1000 * 10 ;
    int N10 = i / 10 - N10000 * 1000 - N1000 * 100 - N100 * 10 ;
    int N1 = i - N10000 * 10000 - N1000 * 1000 - N100 * 100 - N10 * 10 ;
    if ( A <= N1 + N10 + N100 + N1000 + N10000 <= B ) {
      ans += i ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
