static final int X ( ) {
  int X = Integer . parseInt ( input . nextLine ( ) ) ;
  int answer = 0 ;
  for ( int i = 1 ;
  i <= Math . ceil ( X * 0.5 ) ;
  i ++ ) {
    for ( int j = 2 ;
    j <= 11 ;
    j ++ ) {
      if ( i * j <= X ) {
        answer = Math . max ( i * j , answer ) ;
      }
    }
  }
  System . out . println ( answer ) ;
  return answer ;
}
