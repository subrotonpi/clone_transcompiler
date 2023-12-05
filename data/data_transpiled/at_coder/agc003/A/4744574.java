public static String s ( ) {
  String s = input ;
  int ans = 0 ;
  if ( s . contains ( "N" ) ) ans ++ ;
  if ( s . contains ( "S" ) ) ans -- ;
  if ( s . contains ( "E" ) ) ans += 2 ;
  if ( s . contains ( "W" ) ) ans -= 2 ;
  return "Yes" ;
}
