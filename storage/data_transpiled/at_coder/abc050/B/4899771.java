public static int N = Integer . parseInt ( input ) {
  List < Integer > T = Lists . newArrayList ( ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    List < Integer > T1 = T . stream ( ) . map ( Integer :: parseInt ) . collect ( Collectors . toList ( ) ) ;
    int P = Integer . parseInt ( input . nextLine ( ) ) ;
    int X = Integer . parseInt ( input . nextLine ( ) ) ;
    T1 . set ( P - 1 , X ) ;
    System . out . println ( Arrays . toString ( T1 ) ) ;
  }
  return N ;
}
