@ VisibleForTesting static Iterable < Integer > combinations ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int P = Integer . parseInt ( input . nextLine ( ) ) ;
  int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  int R = Integer . parseInt ( input . nextLine ( ) ) ;
  HashMap < Integer , List < Integer >> dic = new HashMap < > ( ) ;
  for ( int i = 1 ;
  i <= ( N + 1 ) ;
  i ++ ) for ( int j = 1 ;
  j <= ( M + 1 ) ;
  j ++ ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int y = Integer . parseInt ( input . nextLine ( ) ) ;
    int z = Integer . parseInt ( input . nextLine ( ) ) ;
    dic . get ( x ) . add ( new Integer ( y ) ) ;
  }
  int ans = - Integer . MAX_VALUE ;
  for ( Integer com : combinations ( 1 , N + 1 , P ) ) {
    int [ ] boys = new int [ M ] ;
    for ( Integer n : com ) {
      for ( List < Integer > b : dic . get ( n ) ) {
        boys [ b . get ( 0 ) - 1 ] += b . get ( 1 ) ;
      }
    }
    Arrays . sort ( boys , Collections . reverseOrder ( boys ) ) ;
    ans = Math . max ( ans , Arrays . asList ( boys ) . subList ( 0 , Q ) ) ;
  }
  System . out . println ( ans ) ;
  return dic ;
}
