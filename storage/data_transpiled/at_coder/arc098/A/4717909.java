public static int N = Integer . parseInt ( input ) {
  String S = input . next ( ) ;
  int e = S . indexOf ( 'E' ) ;
  int w = 0 ;
  int ans = e ;
  for ( String s : S . split ( " " ) ) {
    ans = Math . min ( ans , w + e ) ;
    if ( s . equals ( "W" ) ) {
      w ++ ;
    }
    else {
      e -- ;
    }
  }
  ans = Math . min ( ans , w + e ) ;
  return ans ;
}
