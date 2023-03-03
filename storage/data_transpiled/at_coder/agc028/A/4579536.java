public static int N = Integer . parseInt ( input ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int S = input . nextInt ( ) ;
  int T = input . nextInt ( ) ;
  /* Compute the gcd of the two integers */
  int x = Math . max ( M , N ) ;
  int y = Math . min ( M , N ) ;
  if ( y == 0 ) {
    return x ;
  }
  else {
    return gcd ( y , x % y ) ;
  }
  /* Compute the lcm of the two integers */
  int L = ( int ) ( M / N ) ;
  HashMap < Integer , Integer > X = new HashMap < Integer , Integer > ( ) ;
  for ( int i = 0 ;
  i <= N ;
  i ++ ) {
    X . put ( i * L / N , S . get ( i ) ) ;
  }
  for ( int i = 0 ;
  i <= M ;
  i ++ ) {
    if ( X . get ( i * L / M ) != null ) {
      if ( X . get ( i * L / M ) != T . get ( i ) ) {
        System . out . println ( - 1 ) ;
        exit ( ) ;
      }
    }
    else {
    }
  }
  System . out . println ( L ) ;
  return L ;
}
