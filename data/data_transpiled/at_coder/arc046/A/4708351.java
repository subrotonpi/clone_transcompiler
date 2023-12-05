public static int N ( ) {
  N = Integer . parseInt ( input ( ) ) ;
  if ( N % 9 == 0 ) System . out . println ( '9' * ( N / 9 ) ) ;
  else System . out . println ( str ( N % 9 ) * ( N / 9 + 1 ) ) ;
  return N ;
}
