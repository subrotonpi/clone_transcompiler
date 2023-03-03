public static int [ ] getN ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( N == 1 && M == 1 ) {
    System . out . println ( 1 ) ;
  }
  else if ( N == 1 || M == 1 ) {
    System . out . println ( Math . max ( N , M ) - 2 ) ;
  }
  else if ( N == 2 || M == 2 ) {
    System . out . println ( 0 ) ;
  }
  else {
    System . out . println ( ( N - 2 ) * ( M - 2 ) ) ;
  }
  return new int [ ] {
    N , M }
    ;
  }
  