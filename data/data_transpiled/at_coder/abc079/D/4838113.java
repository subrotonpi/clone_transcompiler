static void N ( int N ) {
  int h = Integer . parseInt ( input . nextLine ( ) ) ;
  int w = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] c = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    c [ i ] [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] [ ] a = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a [ i ] [ 0 ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  for ( int k = 0 ;
  k < N ;
  k ++ ) {
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      for ( int j = 0 ;
      j < N ;
      j ++ ) {
        c [ i ] [ j ] = Math . min ( c [ i ] [ j ] , c [ i ] [ k ] + c [ k ] [ j ] ) ;
      }
    }
  }
  int s = 0 ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    for ( int j = 0 ;
    j < w ;
    j ++ ) {
      if ( a [ i ] [ j ] >= 0 ) {
        s += c [ a [ i ] [ j ] ] [ 1 ] ;
      }
    }
  }
  System . out . println ( s ) ;
}
