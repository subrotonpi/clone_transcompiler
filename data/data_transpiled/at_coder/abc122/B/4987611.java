public static void print ( String l ) {
  l = input . nextLine ( ) ;
  int counter = 0 ;
  ArrayList < Integer > atcorder = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < l . length ( ) ;
  i ++ ) {
    if ( ( l . charAt ( i ) == 'A' ) || ( l . charAt ( i ) == 'T' ) || ( l . charAt ( i ) == 'G' ) || ( l . charAt ( i ) == 'C' ) ) {
      counter ++ ;
      atcorder . add ( counter ) ;
      continue ;
    }
    counter = 0 ;
  }
  if ( ( atcorder . size ( ) != 0 ) && ( atcorder . size ( ) != 0 ) ) {
    System . out . println ( Collections . max ( atcorder ) ) ;
  }
  else {
    System . out . println ( "0" ) ;
  }
}
