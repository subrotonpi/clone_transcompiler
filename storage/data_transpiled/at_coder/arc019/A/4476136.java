public static String input ( ) {
  String s = input ( ) ;
  String ans = "" ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    switch ( s . charAt ( i ) ) {
      case 'O' : case 'D' : ans += "0" ;
      break ;
      case 'I' : ans += "1" ;
      break ;
      case 'Z' : ans += "2" ;
      break ;
      case 'S' : ans += "5" ;
      break ;
      case 'B' : ans += "8" ;
      break ;
      default : ans += s . charAt ( i ) ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
