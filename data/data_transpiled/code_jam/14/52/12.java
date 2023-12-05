static int solve ( int p , int q , List < Integer > monsters , int diana ) {
  final int t = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  {
    if ( monsters . size ( ) == 0 ) {
      return 0 ;
    }
    int hp = monsters . get ( 0 ) ;
    int gold = monsters . get ( 1 ) ;
    int shoots = hp / q + ( hp % q != 0 ? 1 : 0 ) ;
    int best = solve ( p , q , monsters . subList ( 1 , 0 ) , diana + shoots ) ;
    while ( hp - q > 0 ) {
      diana ++ ;
      hp -= q ;
    }
    int shoots = hp / p + ( hp % p != 0 ? 1 : 0 ) ;
    if ( shoots <= diana ) {
      int value = gold + solve ( p , q , monsters . subList ( 1 , 0 ) , diana - shoots ) ;
      best = Math . max ( best , value ) ;
    }
    return best ;
  }
  for ( int test_case = 1 ;
  test_case <= t ;
  test_case ++ ) {
    int p = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    int q = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    int n = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    List < Integer > monsters = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      int h = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
      int g = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
      monsters . add ( new Integer ( h ) ) ;
    }
    System . out . println ( "Case #" + test_case + ": " + solve ( p , q , monsters , 1 ) ) ;
  }
  return t ;
}
