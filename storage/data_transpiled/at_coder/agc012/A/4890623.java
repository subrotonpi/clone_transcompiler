public static void main ( String input ) {
  N = Integer . parseInt ( input ) ;
  List < Integer > A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( Integer . parseInt ( input ) ) ;
  }
  A . sort ( Collections . reverseOrder ( ) ) ;
  System . out . println ( Arrays . toString ( A . subList ( 1 , 2 ) . subList ( 0 , N ) ) ) ;
}
