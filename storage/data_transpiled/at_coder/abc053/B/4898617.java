public static void input ( ) {
  int pos = 0 ;
  while ( s . charAt ( pos ) != 'A' ) {
    pos ++ ;
  }
  int end = s . length ( ) - 1 ;
  while ( s . charAt ( end ) != 'Z' ) {
    end -- ;
  }
  System . out . println ( end - pos + 1 ) ;
}
