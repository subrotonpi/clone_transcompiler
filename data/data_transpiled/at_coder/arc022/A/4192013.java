public static String toString ( ) {
  String s = input . toString ( ) ;
  int key1 = 0 ;
  int key2 = 0 ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( s . charAt ( i ) == 'I' || s . charAt ( i ) == 'i' || key1 == 1 ) {
      key1 = 1 ;
      if ( s . charAt ( i ) == 'C' || s . charAt ( i ) == 'c' || key2 == 1 ) {
        key2 = 1 ;
        if ( s . charAt ( i ) == 'T' || s . charAt ( i ) == 't' ) {
          System . out . println ( "YES" ) ;
          exit ( ) ;
        }
      }
    }
  }
  return s ;
}
