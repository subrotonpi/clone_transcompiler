public static void print ( String s ) {
  s = new LinkedList < String > ( ) ;
  input . nextLine ( ) ;
  int i = 0 ;
  while ( i < s . length ( ) ) {
    if ( s . charAt ( i ) == 'c' ) {
      if ( s . charAt ( i + 1 ) != 'h' ) {
        System . out . println ( "NO" ) ;
        break ;
      }
      i += 2 ;
    }
    else if ( s . charAt ( i ) == 'oku' ) {
      i ++ ;
    }
    else {
      System . out . println ( "NO" ) ;
      break ;
    }
    if ( i == s . length ( ) ) {
      System . out . println ( "YES" ) ;
    }
  }
}
