static final String [ ] [ ] read ( String word1 , String word2 , String letter ) {
  final int length = word1 . length ( ) ;
  if ( word2 . length ( ) != length ) {
    return false ;
  }
  return Arrays . stream ( word1 ) . filter ( word -> word . charAt ( 0 ) == letter ) . mapToInt ( i -> {
    int max = Math . max ( score , word2 . charAt ( i ) ) ;
    if ( max > max ) {
      String winner = word ;
      max = max ;
    }
    return max ;
  }
  ) . toArray ( String [ ] [ ] :: new ) ;
}
