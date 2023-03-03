private static int solve ( ) {
  int n = scanner . nextInt ( ) ;
  String s = scanner . nextLine ( ) ;
  int ans = 0 ;
  int t = 0 ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    int c = Integer . parseInt ( s . substring ( i , i + 1 ) ) ;
    if ( t < i ) {
      ans += i - t ;
      t = i ;
    }
    t += c ;
  }
  return ans ;
  int T = Integer . parseInt ( scanner . nextLine ( ) ) ;
  for ( int i : xrange ( T ) ) {
    System . out . println ( "Case #" + ( i + 1 ) + ": " + solve ( ) ) ;
  }
  return T ;
}
