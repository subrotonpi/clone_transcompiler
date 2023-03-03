public static int input ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> A = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) A . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  Map < Integer , Integer > S_list = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) S_list . put ( i + 1 , 0 ) ;
  int participants = 10000 ;
  while ( S_list . size ( ) > 0 ) {
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      for ( int j = 0 ;
      j < M ;
      j ++ ) {
        if ( S_list . containsKey ( A . get ( i ) ) ) S_list . remove ( A . get ( i ) ) ++ ;
        break ;
      }
    }
    participants = Math . min ( participants , Math . max ( S_list . values ( ) ) ) ;
  }
  System . out . println ( participants ) ;
  return participants ;
}
