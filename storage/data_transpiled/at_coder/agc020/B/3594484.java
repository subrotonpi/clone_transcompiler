public static int [ ] inpl ( ) {
  return Arrays . stream ( input . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ K ] ;
  for ( int i = 0 ;
  i < A . length ;
  i ++ ) A [ i ] = inpl ( ) ;
  int X = 2 , Z = 2 ;
  for ( int Ai = 0 ;
  Ai < A . length ;
  Ai ++ ) {
    X = - ( - X / Ai ) * Ai ;
    if ( X > Z ) {
      System . out . println ( - 1 ) ;
      break ;
    }
    Z = ( Z / Ai ) * Ai + Ai - 1 ;
  }
  else {
    System . out . println ( X + " " + Z ) ;
  }
  return A ;
}
