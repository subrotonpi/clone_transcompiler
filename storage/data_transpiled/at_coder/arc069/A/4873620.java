public static int N ( ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int S_num = N ;
  int cc_num = M / 2 ;
  int ans ;
  if ( ( S_num <= cc_num ) ) {
    ans = ( S_num + cc_num ) / 2 ;
  }
  else {
    ans = cc_num ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
