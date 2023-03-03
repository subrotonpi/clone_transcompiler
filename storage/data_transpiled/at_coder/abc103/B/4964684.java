public static String input ( ) {
  String s = input ( ) ;
  String t = input ( ) ;
  int count = 0 ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( s . charAt ( i ) != t ) {
      count ++ ;
      s = s . substring ( i - 1 , i ) + s . substring ( 0 , i ) ;
    }
    else break ;
  }
  return s ;
}
