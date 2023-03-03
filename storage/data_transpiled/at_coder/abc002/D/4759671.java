public static int [ ] [ ] createGraph ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  int M = Integer . parseInt ( input ( ) ) ;
  int [ ] [ ] R = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int x = Integer . parseInt ( input ( ) ) ;
    int y = Integer . parseInt ( input ( ) ) ;
    R [ x - 1 ] [ y - 1 ] = R [ y - 1 ] [ x - 1 ] = 1 ;
  }
  List < Integer [ ] > G = new ArrayList < > ( ) ;
  for ( int person = 0 ;
  person < N ;
  person ++ ) {
    int [ ] group = new int [ N ] ;
    group [ person ] = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      group [ i ] = i ;
    }
  }
  return G . toArray ( ) ;
}
