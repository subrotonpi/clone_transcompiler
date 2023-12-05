static final int input ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int n = ( int ) Math . sqrt ( N ) ;
  int p = 1 ;
  while ( true ) {
    p = N / p ;
  }
  return n ;
}
