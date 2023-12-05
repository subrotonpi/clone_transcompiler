@ sys . stdin . InputMethod public static boolean compatible ( String word , String target , char letter ) {
  for ( int i = 0 ;
  i < word . length ( ) ;
  i ++ ) {
    if ( ( ( word . charAt ( i ) == letter ) ^ ( target . charAt ( i ) == letter ) ) != 0 ) {
      return false ;
    }
  }
  return true ;
}
