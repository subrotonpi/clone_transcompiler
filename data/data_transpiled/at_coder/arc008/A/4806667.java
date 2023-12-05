public static int N ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  int result = ( N / 10 ) * 100 + Math . min ( ( N % 10 ) * 15 , 100 ) ;
  System . out . println ( result ) ;
  return result ;
}
