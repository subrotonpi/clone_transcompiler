public static String input ( ) {
  String s = input ( ) ;
  StringBuilder ans = new StringBuilder ( ) ;
  for ( int key = 0 ;
  key < s . length ( ) ;
  key ++ ) {
    if ( s . charAt ( key ) == '0' || s . charAt ( key ) == '1' ) {
      ans . append ( s . charAt ( key ) ) ;
    }
    if ( s . charAt ( key ) == 'B' ) {
    }
  }
  return ans . toString ( ) ;
}
