public static String input ( ) {
  String s = input ( ) ;
  String pre = "" ;
  int cnt = 0 ;
  String res = "" ;
  for ( String s : s . split ( " " ) ) {
    if ( s . length ( ) != 0 ) {
      if ( pre . length ( ) != 0 ) {
        res += pre + cnt ;
      }
      pre = s ;
      cnt = 1 ;
    }
    else {
      cnt ++ ;
    }
  }
  res += pre + cnt ;
  return res ;
}
