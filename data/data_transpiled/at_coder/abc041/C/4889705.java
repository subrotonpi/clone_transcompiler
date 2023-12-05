public static void orderOfHeight ( int N , @ Nonnull int [ ] A ) {
  orderOfHeight ( N , A , 0 , A . length ) ;
  if ( getClass ( ) . equals ( "java.util.Scanner" ) ) {
    N = Integer . parseInt ( input ( ) ) ;
    A = Arrays . stream ( input ( ) . split ( " " ) ) . map ( s -> Integer . parseInt ( s ) ) . collect ( Collectors . toList ( ) ) ;
  }
  List < Integer > ans = orderOfHeight ( N , A ) ;
  for ( Integer a : ans ) {
    System . out . println ( a ) ;
  }
}
