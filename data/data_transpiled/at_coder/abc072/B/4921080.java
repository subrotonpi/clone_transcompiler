public static String input ( ) {
  String s = input ( ) ;
  StringBuffer ans = new StringBuffer ( ) ;
  int i = 1 ;
  for ( char c : s . toCharArray ( ) ) {
    if ( ( i % 2 ) == 1 ) {
      ans . append ( c ) ;
    }
    i ++ ;
  }
  return ans . toString ( ) ;
}
