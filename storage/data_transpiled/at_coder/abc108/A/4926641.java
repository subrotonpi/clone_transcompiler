static final int input ( ) {
  int K = Integer . parseInt ( input ( ) ) ;
  List < Integer > kumi = Collections . nCopies ( K + 1 ) ;
  List < Integer > l_even = kumi . stream ( ) . filter ( i -> i % 2 == 0 && i != 0 ) . collect ( Collectors . toList ( ) ) ;
  List < Integer > l_kisu = kumi . stream ( ) . filter ( i -> i % 2 != 0 ) . collect ( Collectors . toList ( ) ) ;
  int answer = l_even . size ( ) * l_kisu . size ( ) ;
  System . out . println ( answer ) ;
}
