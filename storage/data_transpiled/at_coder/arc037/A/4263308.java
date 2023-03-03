public static int N = Integer . parseInt ( input ) {
  String [ ] m = input . split ( "\\s+" ) ;
  int len = m . length ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( m [ i ] < 80 ) {
      ans += Math . abs ( 80 - m [ i ] ) ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
