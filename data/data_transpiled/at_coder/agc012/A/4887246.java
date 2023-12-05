public static void main ( String input ) {
  N = Integer . parseInt ( input ) ;
  a = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a . add ( Integer . parseInt ( input ) ) ;
  }
  a . sort ( reverse ( ) ) ;
  a = a . subList ( 1 , N * 2 ) ;
  System . out . println ( Arrays . toString ( a ) ) ;
}
