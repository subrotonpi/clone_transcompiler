public static int N = Integer . parseInt ( input ) {
  int [ ] [ ] L = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = Integer . parseInt ( input . readLine ( ) ) ;
    int b = Integer . parseInt ( input . readLine ( ) ) ;
    L [ i ] [ 0 ] = a ;
    L [ i ] [ 1 ] = b ;
  }
  int cnt = 0 ;
  for ( int i = 0 ;
  i < N - 2 ;
  i ++ ) {
    for ( int j = i + 1 ;
    j < N - 1 ;
    j ++ ) {
      for ( int k = j + 1 ;
      k < N ;
      k ++ ) {
        int x = L [ i ] [ 0 ] ;
        int y = L [ i ] [ 1 ] ;
        if ( ( L [ j ] [ 0 ] - x ) * ( L [ k ] [ 1 ] - y ) - ( L [ j ] [ 1 ] - y ) * ( L [ k ] [ 0 ] - x ) == 0 ) {
        }
        else if ( Math . abs ( ( L [ j ] [ 0 ] - x ) * ( L [ k ] [ 1 ] - y ) - ( L [ j ] [ 1 ] - y ) * ( L [ k ] [ 0 ] - x ) ) % 2 == 0 ) {
          cnt ++ ;
        }
      }
    }
  }
  System . out . println ( cnt ) ;
  return cnt ;
}
