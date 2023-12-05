public static int N = Integer . parseInt ( input ) {
  int N = input . nextInt ( ) ;
  /* Sumof N */
  int sum = 0 ;
  while ( ( N > 0 ) && ( N < 10 ) ) {
    sum += N % 10 ;
    N /= 10 ;
  }
  return sum ;
}
