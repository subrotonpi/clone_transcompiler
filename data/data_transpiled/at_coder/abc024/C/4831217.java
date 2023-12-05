public static void main ( String input , int d , int k ) {
  List < Integer > rst = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < d ;
  i ++ ) rst . add ( Integer . parseInt ( input ) ) ;
  List < Integer > dd = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < k ;
  i ++ ) dd . add ( Integer . parseInt ( input ) ) ;
  for ( int i = 0 ;
  i < dd . size ( ) ;
  i ++ ) {
    int dpt = dd . get ( i ) ;
    int dst = dd . get ( i ) ;
    int minCur = dpt , maxCur = dpt ;
    for ( int j = 0 ;
    j < rst . size ( ) ;
    j ++ ) {
      int s = rst . get ( j ) ;
      int e = rst . get ( j ) ;
      if ( ! ( minCur <= s && s <= maxCur || minCur <= e && e <= maxCur || s <= minCur && e <= maxCur ) ) continue ;
      else {
        if ( minCur > s ) minCur = s ;
        if ( maxCur < e ) maxCur = e ;
        if ( minCur <= dst && dst <= maxCur ) {
          System . out . println ( i + 1 ) ;
          break ;
        }
      }
    }
  }
}
