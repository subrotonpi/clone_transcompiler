public static String input ( ) {
  String temp = "" ;
  String ans = "" ;
  int c = 0 ;
  s += "_" ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    String s_ = s . substring ( i , i + 1 ) ;
    if ( temp != s_ ) {
      ans += temp ;
      ans += String . valueOf ( c ) ;
      temp = s_ ;
      c = 0 ;
      c ++ ;
    }
    else {
      c ++ ;
    }
  }
  System . out . println ( ans . substring ( 1 ) ) ;
  return ans ;
}
