public static int N ( ) {
  N = Integer . parseInt ( input ( ) ) ;
  System . out . println ( min ( ( N / 10 ) + 1 ) * 100 , ( N / 10 ) * 100 + ( N % 10 ) * 15 ) ;
  return N ;
}
