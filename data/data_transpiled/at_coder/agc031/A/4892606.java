public static int n = Integer . parseInt ( input ) {
  List < Integer > l = input . stream ( ) . map ( Integer :: valueOf ) . collect ( Collectors . toList ( ) ) ;
  return n ;
}
