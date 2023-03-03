public static int N ( ) {
  String s = input . nextLine ( ) ;
  String t = input . nextLine ( ) ;
  int common = 0 ;
  for ( int i = 0 ;
  i < Math . min ( s . length ( ) + 1 , t . length ( ) + 1 ) ;
  i ++ ) {
    if ( s . regionMatches ( i - common , t , 0 , i ) ) {
      common = i ;
    }
  }
  int ans = s . length ( ) + t . length ( ) ;
  return ans ;
}
