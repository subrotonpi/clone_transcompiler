static final int [ ] [ ] getEdges ( ) {
  System . setProperty ( "line.separator" , " " ) ;
  final int Mod = 10 * 9 + 7 ;
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int [ ] [ ] edge = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    edge [ i ] = new int [ N ] ;
  }
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    edge [ a - 1 ] [ b ] = b - 1 ;
    edge [ b - 1 ] [ b ] = a - 1 ;
  }
  final boolean [ ] visited = new boolean [ N ] ;
  visited [ 0 ] = true ;
  {
    int b = 1 ;
    int w = 1 ;
    visited [ v ] = true ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      int child = edge [ i ] [ i ] ;
      if ( ! visited [ child ] ) {
        int b_ = paint ( child ) ;
        int w_ = b ;
        b *= w_ ;
        b %= Mod ;
        w *= b_ + w_ ;
        w %= Mod ;
      }
    }
  }
}
