public static int [ ] readIntArrayInRange ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int L = Integer . parseInt ( input ) ;
  int T = Integer . parseInt ( input ) ;
  int s = 0 ;
  int [ ] X = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x = Integer . parseInt ( input ) ;
    int w = Integer . parseInt ( input ) ;
    x += ( ( w + 1 ) % 3 - 1 ) * T ;
    s += x / L ;
    X [ i ] = x % L ;
  }
  Arrays . sort ( X ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    System . out . println ( X [ ( i + s ) % N ] ) ;
  }
  return X ;
}
