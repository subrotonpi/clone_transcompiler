public static boolean isUgly ( int n ) {
  return n % 2 == 0 || n % 3 == 0 || n % 5 == 0 || n % 7 == 0 ;
  /* Add an expression to the map */
  n = exprMap . get ( expr ) ;
  exprMap . put ( expr , n + nE ) ;
  /* solve the digits */
  Map < Pair < Integer , Integer > , Integer > expressions = new HashMap < Pair < Integer , Integer > , Integer > ( ) ;
  expressions . put ( new Pair < Integer , Integer > ( null , digits . get ( 0 ) ) , 1 ) ;
  if ( digits . size ( ) > 1 ) {
    for ( int d : digits . subList ( 1 , digits . size ( ) ) ) {
      Map < Pair < Integer , Integer > , Integer > newExpressions = new HashMap < Pair < Integer , Integer > , Integer > ( ) ;
      for ( Map . Entry < Pair < Integer , Integer > , Integer > e : expressions . entrySet ( ) ) {
        int i = Integer . parseInt ( e . getValue ( ) . left ) ;
        if ( e . getKey ( ) != null ) {
          /* Add an expression to the map */
          newExpressions . put ( new Pair < Integer , Integer > ( e . getKey ( ) . left + i , e . getValue ( ) . right + d ) , nE ) ;
          /* Add an expression to the map */
          newExpressions . put ( new Pair < Integer , Integer > ( e . getKey ( ) . left - i , e . getValue ( ) . right ) , nE ) ;
        }
        else {
          /* Add an expression to the map */
          newExpressions . put ( new Pair < Integer , Integer > ( i , e . getValue ( ) . left ) , nE ) ;
        }
        expressions = newExpressions ;
      }
    }
  }
  int nUgly = 0 ;
  for ( Map . Entry < Pair < Integer , Integer > , Integer > e : expressions . entrySet ( ) ) {
    int i = Integer . parseInt ( e . getValue ( ) . right ) ;
    if ( e . getKey ( ) != null ) {
      if ( isUgly ( e . getKey ( ) . left + i ) ) nUgly += e . getKey ( ) ;
      if ( isUgly ( e . getKey ( ) . right - i