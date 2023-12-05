public static void print ( String s ) {
  s = input . nextLine ( ) ;
  int count = 1 ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( s . charAt ( i ) == 'A' ) {
      A_index = count ;
      break ;
    }
    count ++ ;
  }
  count = 1 ;
  for ( int i = 0 ;
  i < list . length ( ) ;
  i ++ ) {
    if ( s . charAt ( i ) == 'Z' ) {
      Z_index = count ;
      break ;
    }
    count ++ ;
  }
  System . out . println ( s . length ( ) - A_index - Z_index + 2 ) ;
}
