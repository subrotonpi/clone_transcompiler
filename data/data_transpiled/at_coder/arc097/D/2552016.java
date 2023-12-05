@ VisibleForTesting static LinkedHashMap < Integer , Set < Integer >> firstCut ( LinkedHashMap < Integer , Set < Integer >> links , boolean [ ] colors ) {
  LinkedHashMap < Integer , Set < Integer >> tmpLinks = links . clone ( ) ;
  for ( Map . Entry < Integer , Set < Integer >> entry : tmpLinks . entrySet ( ) ) {
    Integer v = entry . getKey ( ) ;
    Set < Integer > neighbors = entry . getValue ( ) ;
    while ( neighbors . size ( ) == 1 && colors [ v ] ) {
      links . remove ( v ) ;
      Integer par = neighbors . iterator ( ) . next ( ) ;
      links . get ( par ) . remove ( v ) ;
      v = par ;
      neighbors = links . get ( par ) ;
    }
  }
  return links ;
}
