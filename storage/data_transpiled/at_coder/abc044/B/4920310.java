public static String w ( ) {
  while ( w != "" ) {
    if ( w . indexOf ( w . charAt ( 0 ) ) % 2 == 0 ) {
      w = w . replace ( w . charAt ( 0 ) , "" ) ;
    }
    else {
      System . out . println ( "No" ) ;
      exit ( ) ;
    }
  }
  System . out . println ( "Yes" ) ;
  return w ;
}
