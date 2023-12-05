public static String input ( ) {
  s = input ( ) ;
  s = list ( s ) ;
  List < Integer > l = new ArrayList < Integer > ( ) ;
  int ls = s . length ( ) ;
  for ( int i = 0 ;
  i < ls ;
  i ++ ) {
    switch ( s . charAt ( i ) ) {
      case '1' : l . add ( 1 ) ;
      break ;
      case '0' : l . add ( 0 ) ;
      break ;
      default : l . remove ( l . size ( ) - 1 ) ;
    }
  }
  String ans = "" ;
  for ( int i = 0 ;
  i < l . size ( ) ;
  i ++ ) {
    ans = ans + l . get ( i ) ;
  }
  return ans ;
}
