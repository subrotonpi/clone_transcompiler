public static int [ ] [ ] readInput ( ) {
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int M = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] [ ] mat = new int [ N ] [ M ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int a = Integer . parseInt ( input . readLine ( ) ) ;
    int b = Integer . parseInt ( input . readLine ( ) ) ;
    mat [ a - 1 ] [ b - 1 ] = 1 ;
    mat [ b - 1 ] [ a - 1 ] = 1 ;
  }
  final int [ ] [ ] mat = new int [ N ] [ M ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( 1 == mat [ i ] [ 0 ] ) {
      int [ ] [ ] matArray = new int [ N ] [ N ] ;
      for ( int j = 0 ;
      j < N ;
      j ++ ) {
        matArray [ j ] = mat [ i ] [ j ] ;
      }
      Arrays . sort ( matArray ) ;
      int [ ] matTemp = new int [ N ] ;
      for ( int j = 0 ;
      j < N ;
      j ++ ) {
        matTemp [ j ] = matArray [ j ] ;
      }
      for ( int k = 0 ;
      k < N ;
      k ++ ) {
        matTemp [ k ] = mat [ k ] [ k ] ;
      }
      int B = 0 ;
      for ( int k = 0 ;
      k < N ;
      k ++ ) {
        B += new int [ N ] ;
        for ( int l = 0 ;
        l < N ;
        l ++ ) {
          if ( mat [ k ] [ B ] != 0 ) {
            mat [ k ] [ B ] = 0 ;
          }
        }
      }
      System . out . println ( Arrays . toString ( matTemp ) ) ;
    }
    else {
      System . out . println ( 0 ) ;
    }
  }
  return mat ;
}
