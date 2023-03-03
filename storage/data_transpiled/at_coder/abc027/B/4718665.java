public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int [ ] A = Lists . newArrayList ( ) . stream ( ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  long now = 0 ;
  int cnt = 0 ;
  int one = Arrays . stream ( A ) . mapToInt ( Integer :: parseInt ) . sum ( ) / N ;
  if ( Arrays . stream ( A ) . mapToInt ( Integer :: parseInt ) . sum ( ) % N != 0 ) System . out . println ( - 1 ) ;
  else {
    for ( int a : A ) {
      now += a - one ;
      if ( now != 0 ) cnt ++ ;
    }
  }
  System . out . println ( cnt ) ;
}
