static final int [ ] [ ] S ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  ArrayList < Integer > S = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    S . add ( new Integer [ a ] ) ;
  }
  Collections . sort ( S ) ;
  int [ ] T = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i += 2 ) {
    T [ i ] [ 1 ] = i ;
  }
  if ( N == 1 ) {
    System . out . println ( 0 ) ;
    System . exit ( 0 ) ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i += 2 ) {
    if ( T [ i ] % 2 != 0 ) ans ++ ;
  }
  return T ;
}
