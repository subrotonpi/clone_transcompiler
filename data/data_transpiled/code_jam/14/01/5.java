private static String solve ( ) {
  int i = input . nextInt ( ) - 1 ;
  int [ ] a = Arrays . stream ( new Scanner ( System . in ) . nextInt ( ) . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  int j = input . nextInt ( ) - 1 ;
  int [ ] b = Arrays . stream ( new Scanner ( System . in ) . nextInt ( ) . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  List < Integer > ans = Lists . newArrayList ( ) ;
  ans . addAll ( Arrays . asList ( a [ i ] , b [ j ] ) ) ;
  if ( ans . size ( ) == 1 ) {
    return ans . get ( 0 ) . toString ( ) ;
  }
  else if ( ans . size ( ) >= 2 ) {
    return "Bad magician!" ;
  }
  else {
    return "Volunteer cheated!" ;
  }
}
