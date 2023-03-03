public static int getDigit ( int N ) {
  int cnt = 0 ;
  while ( ( N > 0 ) && ( cnt < 10 ) ) {
    cnt ++ ;
    N /= 10 ;
  }
  return cnt ;
}
int i = Integer . parseInt ( input . nextLine ( ) ) ;
for ( int i = 1 ;
i <= ( int ) Math . pow ( N , 1 / 2 ) ;
i ++ ) {
  if ( ( N % i ) == 0 ) {
    System . out . println ( Math . max ( getDigit ( i ) , getDigit ( N / i ) ) ) ;
    exit ( ) ;
  }
}
