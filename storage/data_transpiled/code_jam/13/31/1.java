public static String vowels ( String vowels [ ] ) {
  String s = "a" ;
  String n = "e" ;
  int count = 0 ;
  int length = s . length ( ) ;
  int i ;
  int length = s . length ( ) ;
  for ( int TT = 1 ;
  TT <= T ;
  TT ++ ) {
    s = s . substring ( 0 , TT ) ;
    n = s . substring ( TT , TT ) ;
    length = n . length ( ) ;
    int ans = 0 ;
    int current = 0 ;
    int count = 0 ;
    length = s . length ( ) ;
    for ( i = 0 ;
    i <= length ;
    i ++ ) {
      if ( vowels [ i ] . indexOf ( s . charAt ( i ) ) >= 0 ) {
        count = 0 ;
      }
      else {
        count ++ ;
      }
      if ( count == length ) {
        count -- ;
        ans += ( i - n + 2 - current ) * ( length - i ) ;
        current = i - n + 2 ;
      }
    }
    System . out . println ( "Case #" + TT + ": " + ans ) ;
  }
  return s ;
}
