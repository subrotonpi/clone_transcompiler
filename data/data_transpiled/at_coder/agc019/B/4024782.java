@ VisibleForTesting static void input ( ) {
  String A = input ( ) ;
  Alphabet = new TreeMap < > ( ) ;
  for ( int i = 0 ;
  i < A . length ( ) ;
  i ++ ) {
    Alphabet . put ( A . charAt ( i ) , 1 ) ;
  }
  long Total = ( A . length ( ) - 1 ) * A . length ( ) / 2 + 1 ;
  for ( String key : Alphabet . keySet ( ) ) {
    if ( Alphabet . get ( key ) > 1 ) {
      long double = ( Alphabet . get ( key ) - 1 ) * Alphabet . get ( key ) / 2 ;
      Total -= double ;
    }
  }
  System . out . println ( Total ) ;
}
