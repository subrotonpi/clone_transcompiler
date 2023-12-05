public static double input ( ) {
  int n = S . length ( ) ;
  String [ ] d = new String [ 26 ] ;
  for ( int i = 0 ;
  i < 26 ;
  i ++ ) d [ i ] = String . valueOf ( ( char ) ( i + 97 ) ) ;
  double ans = Double . MIN_VALUE ;
  for ( String dd : d ) {
    String s = S ;
    String t = "" ;
    int m = 0 ;
    do {
      if ( s . indexOf ( dd ) == s . length ( ) ) break ;
      for ( int i = 0 ;
      i < s . length ( ) - 1 ;
      i ++ ) {
        if ( s . charAt ( i ) == dd || s . charAt ( i + 1 ) == dd ) t = t + dd ;
        else t = t + s . charAt ( i ) ;
      }
      s = t ;
      t = "" ;
      m ++ ;
    }
    while ( true ) ;
    ans = Math . min ( ans , m ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
