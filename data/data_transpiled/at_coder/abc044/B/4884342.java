public static boolean beautifulStrings ( @ NonNull String w ) {
  HashMap < Character , Integer > freq = new HashMap < Character , Integer > ( ) ;
  for ( char c : w . toCharArray ( ) ) {
    freq . computeIfAbsent ( c , k -> 0 ) ;
    freq . put ( c , ++ f ) ;
  }
  return Arrays . stream ( freq . values ( ) ) . anyMatch ( f -> f % 2 == 0 ) ;
}
