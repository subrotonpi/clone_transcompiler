public static int n ( ) {
  String s = input . nextLine ( ) ;
  String [ ] l = s . split ( "\\s+" ) ;
  int c = 0 ;
  c += l [ l . length - 1 ] . indexOf ( "TAKAHASHIKUN" ) ;
  c += l [ l . length - 1 ] . indexOf ( "Takahashikun" ) ;
  c += l [ l . length - 1 ] . indexOf ( "takahashikun" ) ;
  if ( l [ l . length - 1 ] . equals ( "TAKAHASHIKUN." ) || l [ l . length - 1 ] . equals ( "Takahashikun." ) ) {
    c ++ ;
  }
  System . out . println ( c ) ;
  return c ;
}
