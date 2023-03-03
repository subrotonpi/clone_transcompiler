public static int [ ] getN ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int S = input . nextInt ( ) ;
  int T = input . nextInt ( ) ;
  /* if (N == 0) {
  return 0;
  } else {
  return gcd(M, N);
  }*/
  int p = gcd ( M , N ) ;
  int q = M * N / p ;
  boolean flag = true ;
  for ( int j = 0 ;
  j < p ;
  j ++ ) {
    if ( S [ N * j / p ] != T [ M * j / p ] ) {
      flag = false ;
      break ;
    }
  }
  if ( flag ) {
    System . out . println ( q ) ;
  }
  else {
    System . out . println ( - 1 ) ;
  }
  return new int [ ] {
    q }
    ;
  }
  