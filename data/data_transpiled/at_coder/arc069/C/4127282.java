@ Function public static List < Integer > inpl ( ) {
  return Lists . newArrayList ( ) . stream ( ) . map ( input -> Integer . parseInt ( input . nextLine ( ) ) ) . collect ( Collectors . toList ( ) ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > A = inpl ( ) ;
  List < Integer > X = new ArrayList < > ( ) ;
  X . add ( ( a , i ) -> - a ) ;
  int [ ] answer = new int [ N + 1 ] ;
  answer [ 0 ] = 0 ;
  answer [ 0 ] += N ;
  answer [ 1 ] += N ;
  return answer ;
}
