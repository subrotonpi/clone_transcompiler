public static int [ ] [ ] readInput ( ) {
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int M = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] [ ] table = new int [ N ] [ M ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int a = Integer . parseInt ( input . readLine ( ) ) ;
    int b = Integer . parseInt ( input . readLine ( ) ) ;
    table [ a - 1 ] [ b - 1 ] = 1 ;
    table [ b - 1 ] [ a - 1 ] = 1 ;
  }
  int [ ] ls = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    Set a = new HashSet ( ) ;
    for ( int j = 0 ;
    j < table [ i ] . length ;
    j ++ ) {
      if ( table [ i ] [ j ] == 1 ) {
        for ( int k = 0 ;
        k < table [ j ] . length ;
        k ++ ) {
          if ( table [ i ] [ k ] == 1 ) {
            a . add ( k ) ;
          }
        }
      }
    }
    ls [ i ] = a . size ( ) ;
  }
  System . out . println ( ls [ 0 ] ) ;
  return ls ;
}
