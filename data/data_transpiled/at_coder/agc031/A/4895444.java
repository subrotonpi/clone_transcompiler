public static int N = Integer . parseInt ( input ) {
  int mod = 10 * 9 + 7 ;
  String s = input . nextLine ( ) ;
  @ SuppressWarnings ( "unchecked" ) Counter < String > c = s . split ( " " ) ;
  int ans = 1 ;
  for ( int i = 0 ;
  i < c . size ( ) ;
  i ++ ) {
    ans *= ( c . getCount ( i ) + 1 ) % mod ;
  }
  System . out . println ( ( ans - 1 ) % mod ) ;
  return ans ;
}
