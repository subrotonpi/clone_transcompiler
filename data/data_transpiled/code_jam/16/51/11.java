public static int run ( ) {
  String s = input . nextLine ( ) . trim ( ) ;
  Stack < Character > stack = new Stack < > ( ) ;
  int res = 0 ;
  for ( char c : s . toCharArray ( ) ) {
    if ( stack . size ( ) > 0 && stack . peek ( ) == c ) {
      stack . pop ( ) ;
      res += 10 ;
    }
    else {
      stack . push ( c ) ;
    }
  }
  res += stack . size ( ) / 2 * 5 ;
  return res ;
}
