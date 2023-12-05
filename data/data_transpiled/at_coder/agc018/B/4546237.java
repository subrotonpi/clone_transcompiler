public static int N ( ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> A = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) A . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  int ans = N ;
  for ( int i = 0 ;
  i < M - 1 ;
  i ++ ) {
    int [ ] p = new int [ M ] ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) p [ A . get ( j ) . get ( 0 ) - 1 ] ++ ;
    int mp = Math . max ( p , mp ) ;
    int MM = p . indexOf ( mp ) + 1 ;
    ans = Math . min ( ans , mp ) ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) A . get ( j ) . remove ( MM ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
