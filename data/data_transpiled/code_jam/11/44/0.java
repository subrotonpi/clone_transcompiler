static final int calc ( final Map < Integer , Set < List < Integer >>> b , final List < String > route ) {
  final Set < List < Integer >> res = new HashSet < List < Integer >> ( ) ;
  for ( int x = route . size ( ) - 1 ;
  x >= 0 ;
  x -- ) {
    res = res . addAll ( b . get ( x ) ) ;
  }
  return res . size ( ) - new HashSet < List < Integer >> ( route . subList ( 0 , route . size ( ) ) ) ;
}
