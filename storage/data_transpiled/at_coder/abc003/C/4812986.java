public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int K = Integer . parseInt ( input ) ;
  List < Integer > R = new ArrayList < > ( Arrays . asList ( input . split ( " " ) ) ) . subList ( N - K , N ) ;
  int ans = 0 ;
  for ( Integer i : R ) {
    ans = ( ans + i ) / 2 ;
  }
  System . out . println ( ans ) ;
}
