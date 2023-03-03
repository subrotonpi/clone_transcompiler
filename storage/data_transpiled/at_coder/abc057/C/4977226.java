@ Function public static void main ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  int upB = ceil ( sqrt ( N ) ) ;
  long minA = 10 * 10 ;
  for ( int b = 0 ;
  b < upB ;
  b ++ ) {
    if ( N % ( b + 1 ) == 0 ) {
      minA = Math . min ( Math . max ( N / ( b + 1 ) , b + 1 ) , minA ) ;
      minA = Integer . MAX_VALUE ;
    }
  }
}
