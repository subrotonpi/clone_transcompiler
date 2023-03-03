static final < T > Collection < T > getCountries ( ) {
  List < T > s = new LinkedList < T > ( ) ;
  List < T > t = new LinkedList < T > ( ) ;
  Collections . sort ( s ) ;
  Collections . sort ( t ) ;
  Collection < T > s_1 = col . getCountries ( s ) ;
  Collection < T > t_1 = col . getCountries ( t ) ;
  List < T > s_2 = new ArrayList < T > ( s_1 . values ( ) ) ;
  List < T > t_2 = new ArrayList < T > ( t_1 . values ( ) ) ;
  if ( s_2 . equals ( t_2 ) ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
  return s_1 ;
}
