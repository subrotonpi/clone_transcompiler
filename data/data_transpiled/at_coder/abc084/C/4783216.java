static final int [ ] getStdIn ( ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( N == 1 ) {
    System . out . println ( 0 ) ;
    System . exit ( 0 ) ;
  }
  int [ ] c = new int [ N - 1 ] , s = new int [ N - 1 ] , f = new int [ N - 1 ] ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    c [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    s [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    f [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int cur = 0 ;
    for ( int j = i ;
    j < N - 1 ;
    j ++ ) {
      if ( cur <= s [ j ] ) {
        cur = s [ j ] + c [ j ] ;
      }
      else {
        cur += ( s [ j ] + f [ j ] * Math . ceil ( ( cur - s [ j ] ) / f [ j ] ) - cur ) + c [ j ] ;
      }
    }
    System . out . println ( cur ) ;
  }
  return c ;
}
