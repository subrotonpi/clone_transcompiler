static final int cases ( int cases ) {
  int N , K , B , T ;
  int X , V ;
  for ( int ii = 0 ;
  ii <= Integer . MAX_VALUE ;
  ++ ii ) {
    N = Integer . parseInt ( input . nextLine ( ) ) ;
    K = Integer . parseInt ( input . nextLine ( ) ) ;
    B = Integer . parseInt ( input . nextLine ( ) ) ;
    T = Integer . parseInt ( input . nextLine ( ) ) ;
    X = new int [ N ] ;
    V = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    ++ i ) X [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    V [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    Collections . reverse ( X ) ;
    Collections . reverse ( V ) ;
    int pocOK = 0 ;
    int pocF = 0 ;
    int res = 0 ;
    for ( int i = 0 ;
    i < N ;
    ++ i ) {
      int xi = X [ i ] , vi = V [ i ] ;
      if ( xi + vi * T >= B ) {
        ++ pocOK ;
        res += pocF ;
      }
      else ++ pocF ;
      if ( pocOK >= K ) break ;
    }
    if ( pocOK >= K ) System . out . println ( "Case #" + ( ii + 1 ) + ": " + res ) ;
    else System . out . println ( "Case #" + ( ii + 1 ) + ": IMPOSSIBLE" ) ;
  }
  return N ;
}
