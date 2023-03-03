public static String input ( ) {
  String s = input + "_" ;
  String ans = "" ;
  char finding = s . charAt ( 0 ) ;
  int counter = 0 ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( finding != s . charAt ( i ) ) {
      ans += s . charAt ( i - 1 ) ;
      ans += counter ;
      finding = s . charAt ( i ) ;
      counter = 1 ;
    }
    else counter ++ ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
