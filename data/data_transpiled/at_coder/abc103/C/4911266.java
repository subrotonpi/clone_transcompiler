public static int N ( ) {
  int [ ] a = new int [ N ] ;
  for ( String s : input ( ) . split ( " " ) ) {
    a [ i ] = Integer . parseInt ( s ) ;
  }
  int ans = 0 ;
  for ( int i : a ) {
    ans += i - 1 ;
  }
  return ans ;
}
