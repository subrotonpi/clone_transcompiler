static final String theKillerWord ( String [ ] words , String [ ] [ ] letterLists ) throws IOException {
  StringBuilder result = new StringBuilder ( ) ;
  for ( String [ ] letters : letterLists ) {
    int [ ] scores = new int [ words . length ] ;
    for ( int a = 0 ;
    a < words . length ;
    a ++ ) {
      String word = words [ a ] ;
      int [ ] possibs = new int [ words . length ] ;
      for ( int i = 0 ;
      i < possibs . length ;
      i ++ ) {
        String l = letters [ i ] ;
        if ( possibs . length == 1 ) break ;
        if ( StringUtils . isNotBlank ( l ) ) {
          if ( ! word . contains ( l ) ) {
            scores [ a ] ++ ;
            possibs = Arrays . copyOf ( possibs , possibs . length ) ;
            continue ;
          }
          int c = word . indexOf ( l ) ;
          for ( int n = 0 ;
          n < possibs . length ;
          n ++ ) {
            if ( l . equals ( possibs [ n ] ) ) possibs = Arrays . copyOf ( possibs , possibs . length ) ;
          }
        }
      }
    }
    result . append ( words [ scores . indexOf ( max ( scores ) ) ] ) ;
  }
  return result . toString ( ) ;
}
