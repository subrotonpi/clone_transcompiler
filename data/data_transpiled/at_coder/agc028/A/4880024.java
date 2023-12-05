public static int [ ] getN ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  String S = input . nextLine ( ) ;
  String T = input . nextLine ( ) ;
  boolean flag = true ;
  /* lcm */
  int [ ] gcd = new int [ M ] ;
  while ( b > 0 ) {
    gcd [ N ] = b ;
  }
  int L = gcd [ N ] ;
  /* lcm */
  while ( b > 0 ) {
    gcd [ N ] = b ;
  }
  /* lcm */
  flag = true ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    if ( S . charAt ( i * N / gcd [ N ] ) == T . charAt ( i * M / gcd [ N ] ) && flag ) {
    }
    else {
      flag = false ;
    }
  }
  if ( flag ) {
    System . out . println ( L ) ;
  }
  else {
    System . out . println ( - 1 ) ;
  }
  return gcd ;
}
