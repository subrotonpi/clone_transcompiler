public static LinkedList < Integer > inpl ( ) {
  return new LinkedList < Integer > ( ) ;
  int A = inpl ( ) ;
  int B = inpl ( ) ;
  int C = inpl ( ) ;
  if ( A % 2 != 0 || B % 2 != 0 || C % 2 != 0 ) {
    System . out . println ( 0 ) ;
  }
  else if ( A == B == C ) {
    System . out . println ( - 1 ) ;
  }
  else {
    int ans = 1 ;
    while ( true ) {
      A = ( C + B ) / 2 ;
      B = ( A + C ) / 2 ;
      C = ( A + B ) / 2 ;
      if ( A % 2 != 0 || B % 2 != 0 || C % 2 != 0 ) {
        System . out . println ( ans ) ;
        break ;
      }
      ans ++ ;
    }
  }
  return new LinkedList < Integer > ( ) ;
}
