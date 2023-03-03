public static int N = Integer . parseInt ( input ) {
  int c = ( N / 10 ) * 100 + ( N % 10 ) * 15 ;
  int c2 = ( N / 10 + 1 ) * 100 ;
  System . out . println ( min ( c , c2 ) ) ;
  return c ;
}
