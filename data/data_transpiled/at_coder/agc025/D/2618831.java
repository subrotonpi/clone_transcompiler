@ GwtIncompatible ( "System.out.println" ) private static int [ ] [ ] readInts ( InputStream input ) throws IOException {
  final int N = Integer . parseInt ( input . readLine ( ) ) ;
  final int [ ] [ ] reads = new int [ N ] [ ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) reads [ i ] = Integer . parseInt ( input . readLine ( ) ) ;
  final int N = reads [ 0 ] ;
  final int [ ] [ ] D1 = reads [ 1 ] ;
  final int [ ] [ ] D2 = reads [ 2 ] ;
  final int NN = 2 * N ;
  {
    int [ ] [ ] deg = new int [ NN ] [ ] ;
    for ( int i = 0 ;
    i < NN ;
    i ++ ) {
      deg [ i ] = ( int [ ] [ ] ) ( count [ i ] >>> i & 1 ] ) ;
    }
    int [ ] p1 = deg [ D1 ] ;
    int [ ] p2 = deg [ D2 ] ;
    {
      int [ ] [ ] group = new int [ NN ] [ ] ;
      for ( int i = 0 ;
      i < NN ;
      i ++ ) {
        int [ ] [ ] hp = new int [ ] {
          i }
          ;
          if ( ( p [ i ] & 1 ) == 0 ) {
            group [ i ] = ( x [ i ] >>> hp & 1 ) ^ ( y [ i ] >>> hp & 1 ) ;
          }
          else {
            group [ i ] = x [ i ] >>> hp & 1 ;
          }
        }
      }
    }
    final int [ ] [ ] pts = new int [ NN ] [ NN ] ;
    for ( int i = 0 ;
    i < NN ;
    i ++ ) {
      pts [ i ] = ( pts [ i ] [ 0 ] == 0 ) ? 0 : pts [ i ] [ 1 ] ;
    }
    for ( int i = 0 ;
    i < N * N ;
    i ++ ) {
      System . arraycopy ( reads , 0 , pts , i * N , N ) ;
    }
    return pts ;
  }
  