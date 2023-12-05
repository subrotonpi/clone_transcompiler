public static void N ( int input ) {
  String [ ] S1 = input . split ( " " ) ;
  String [ ] S2 = input . split ( " " ) ;
  List < String > firsts = Arrays . asList ( S1 [ 0 ] , S2 [ 0 ] ) ;
  Map < String , Set < String >> map = Maps . newHashMap ( ) ;
  for ( int i = 0 ;
  i < S1 . length ;
  i ++ ) {
    String a = S1 [ i ] ;
    String b = S2 [ i ] ;
    if ( ! map . containsKey ( a ) ) {
      map . put ( a , Sets . newHashSet ( ) ) ;
    }
    map . get ( a ) . add ( b ) ;
    if ( ! map . containsKey ( b ) ) {
      map . put ( b , Sets . newHashSet ( ) ) ;
    }
    map . get ( b ) . add ( a ) ;
  }
  /*if (map.containsKey(n)) {
  Set<String> l = map.get(n);
  l.remove(n);
  for (String v : l) {
  removeNode(v);
  }
  }*/
  for ( String k : "0123456789" . toCharArray ( ) ) {
    removeNode ( k ) ;
  }
  int m = 1 ;
  while ( map . size ( ) > 0 ) {
    int d_i = Collections . reverseOrder ( map . keySet ( ) ) . iterator ( ) . next ( ) ;
    m *= ( 10 - ( firsts . contains ( d_i ) ) ) ;
    removeNode ( d_i ) ;
  }
  System . out . println ( m ) ;
}
