public static String input ( ) {
  String s = input ( ) ;
  String t = input ( ) ;
  String ans = "" ;
  for ( int i = 0 ;
  i < Math . min ( s . length ( ) , t . length ( ) ) ;
  i ++ ) {
    ans += s . charAt ( i ) ;
    ans += t . charAt ( i ) ;
  }
  if ( s . length ( ) != Math . min ( s . length ( ) , t . length ( ) ) ) {
    ans += s . charAt ( i ) ;
  }
  return ans ;
}
