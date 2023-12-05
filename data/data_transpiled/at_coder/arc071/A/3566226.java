public static String [ ] l ( ) {
  for ( int i = 97 ;
  i < 97 + 26 ;
  i ++ ) {
    l [ i ] = ( char ) i ;
  }
  String [ ] s = new String [ Integer . parseInt ( input ( ) ) ] ;
  for ( int i = 0 ;
  i < s . length ;
  i ++ ) {
    s [ i ] = input ( ) ;
  }
  String w = "" ;
  for ( String s : l ) {
    int [ ] a = new int [ s . length ] ;
    for ( int j = 0 ;
    j < a . length ;
    j ++ ) {
      a [ j ] = s [ j ] ;
    }
    w += s . length * Math . min ( a ) ;
  }
  System . out . println ( w ) ;
  return s ;
}
