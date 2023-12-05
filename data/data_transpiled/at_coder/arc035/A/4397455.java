public static String nextLine ( ) {
  String line = input . readLine ( ) ;
  int i = 0 ;
  while ( i <= ( line . length ( ) ) / 2 ) {
    if ( line . charAt ( i ) == '*' || line . charAt ( line . length ( ) - i - 1 ) == '*' || line . charAt ( i ) == line . charAt ( line . length ( ) - i - 1 ) ) {
      i = i + 1 ;
    }
    else {
      System . out . println ( "NO" ) ;
      break ;
    }
  }
  if ( i > ( line . length ( ) ) / 2 ) {
    System . out . println ( "YES" ) ;
  }
  return line ;
}
