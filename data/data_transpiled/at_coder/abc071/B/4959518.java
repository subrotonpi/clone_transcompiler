public static String print ( String s ) {
  s = list ( input ( ) ) ;
  s . sort ( ) ;
  String abc = "abcdefghijklmnopqrstuvwxyz" ;
  String ans = "None" ;
  for ( int i = 0 ;
  i < 26 ;
  i ++ ) {
    if ( s . contains ( abc + i ) ) {
      continue ;
    }
    else {
      ans = abc + i ;
      break ;
    }
  }
  return ans ;
}
