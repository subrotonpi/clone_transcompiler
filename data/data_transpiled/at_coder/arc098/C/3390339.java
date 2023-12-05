public static int N = Integer . parseInt ( input ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int inf = 10 * 10 ;
  int ans = inf ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int small = a . get ( i ) ;
    List < List < Integer >> list = new ArrayList < > ( ) ;
    List < Integer > seqq = new ArrayList < > ( ) ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      if ( a . get ( j ) < small ) {
        list . add ( seqq ) ;
        seqq = new ArrayList < > ( ) ;
      }
      else {
        seqq . add ( a . get ( j ) ) ;
      }
    }
    list . add ( seqq ) ;
    List < Integer > aaa = new ArrayList < > ( ) ;
    for ( List < Integer > s : list ) {
      if ( s . size ( ) >= K ) {
        s . forEach ( i -> aaa . addAll ( s . subList ( 0 , s . size ( ) - K + 1 ) ) ) ;
      }
    }
    if ( aaa . size ( ) >= Q ) {
      aaa . forEach ( i -> ans = Math . min ( ans , aaa . get ( Q - 1 ) - aaa . get ( 0 ) ) ) ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
