public static int N = Integer . parseInt ( input ) {
  int D = N ;
  int K = N ;
  int [ ] days = new int [ D ] ;
  for ( int i = 0 ;
  i < D ;
  i ++ ) {
    int l = Integer . parseInt ( input . readLine ( ) ) ;
    int r = Integer . parseInt ( input . readLine ( ) ) ;
    days [ i ] = new int [ l ] ;
  }
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    int s = Integer . parseInt ( input . readLine ( ) ) ;
    int t = Integer . parseInt ( input . readLine ( ) ) ;
    int pos = s ;
    for ( int j = 0 ;
    j < days . length ;
    j ++ ) {
      int l = days [ j ] ;
      int r = days [ j ] ;
      if ( pos < l || pos > r ) {
        continue ;
      }
      if ( s < t ) {
        if ( r < t ) {
          pos = r ;
        }
        else if ( r >= t ) {
          System . out . println ( j + 1 ) ;
          break ;
        }
      }
      else if ( s > t ) {
        if ( l > t ) {
          pos = l ;
        }
        else if ( l <= t ) {
          System . out . println ( j + 1 ) ;
          break ;
        }
      }
    }
  }
  return 0 ;
}
