public static int N = Integer . parseInt ( input ) ;
int N = 2025 - N ;
for ( int i = 1 ;
i <= 10 ;
i ++ ) {
  if ( N % i == 0 && N / i < 10 ) {
    System . out . println ( i + " x " + ( int ) ( N / i ) ) ;
  }
}
