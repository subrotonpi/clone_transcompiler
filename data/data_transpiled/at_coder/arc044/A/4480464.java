static final int N = Integer . parseInt ( input . nextLine ( ) ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  /*if (N < 2) return false;*/
  if ( N == 2 || N == 3 || N == 5 ) return true ;
  if ( N % 2 == 0 || N % 3 == 0 || N % 5 == 0 ) return false ;
  int prime = 7 ;
  int step = 4 ;
  while ( prime <= Math . sqrt ( N ) ) {
    if ( N % prime == 0 ) return false ;
    prime += step ;
    step = 6 - step ;
  }
  return true ;
}
