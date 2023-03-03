static final Set < String > getSet ( ) {
  final Set < String > s = new HashSet < String > ( ) ;
  for ( String w : input . keySet ( ) ) {
    if ( ! s . contains ( w ) ) {
      System . out . println ( w ) ;
      break ;
    }
  }
  else {
    System . out . println ( "None" ) ;
  }
  return s ;
}
