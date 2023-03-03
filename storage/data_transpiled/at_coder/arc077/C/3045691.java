@ VisibleForTesting static LinkedHashMap < Integer , Integer > map ( ) {
  final int INF = Integer . MAX_VALUE ;
  final int mod = 10 * 9 + 7 ;
  final int eps = 10 * - 7 ;
  {
    final int inpl = Integer . parseInt ( input . nextLine ( ) ) ;
    final int inpl_s = Integer . parseInt ( input . nextLine ( ) ) ;
    final int N = inpl ;
    final int M = inpl_s ;
    final int [ ] aa = inpl . split ( " " ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      aa [ i ] -- ;
    }
    final int [ ] yama_height = new int [ 2 * M ] ;
    final int [ ] yama_num = new int [ 2 * M ] ;
    int SUM = 0 ;
    for ( int i = 1 ;
    i < N ;
    i ++ ) {
      int na = aa [ i ] ;
      int ba = aa [ i - 1 ] ;
      if ( na < ba ) {
        na += M ;
      }
      SUM += ( na - ba ) ;
      yama_height [ na ] += na - ( ba + 1 ) ;
      yama_num [ na ] -- ;
      yama_num [ ba + 1 ] ++ ;
    }
    int tmp = 0 ;
    for ( int i = 0 ;
    i < 2 * M ;
    i ++ ) {
      tmp += yama_num [ i ] ;
      yama_num [ i ] = tmp ;
    }
    int ans_list [ ] = 0 ;
    tmp = 0 ;
    for ( int i = 0 ;
    i < 2 * M ;
    i ++ ) {
      tmp += yama_height [ i ] ;
      tmp -= yama_num [ i ] ;
      ans_list [ i % M ] += tmp ;
    }
    System . out . println ( SUM - max ( ans_list ) ) ;
  }
  return new LinkedHashMap < > ( ) {
    @ Override public int size ( ) {
      return N ;
    }
  }
  ;
}
