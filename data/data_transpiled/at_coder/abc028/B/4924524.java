public static List < String > countUp ( @ NonNull String S ) {
  Map < Character , Integer > freq = new HashMap < > ( ) ;
  for ( char c : "ABCDEF" . toCharArray ( ) ) {
    freq . computeIfAbsent ( c , k -> 0 ) ;
    freq . computeIfAbsent ( c , k -> 1 ) ;
  }
  return Arrays . asList ( freq . entrySet ( ) . stream ( ) . sorted ( ) . collect ( Collectors . toList ( ) ) ) ;
}
