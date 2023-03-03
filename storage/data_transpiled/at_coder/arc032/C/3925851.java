public static int [ ] [ ] P ( Scanner input ) {
  int N = input . nextInt ( ) ;
  int [ ] [ ] P = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    P [ i ] = new int [ a ] [ b ] ;
    P [ i ] [ 0 ] = a ;
    P [ i ] [ 1 ] = b ;
    P [ i ] [ 2 ] = i ;
  }
  int L = 10 * 6 ;
  int [ ] T = new int [ L + 1 ] ;
  int [ ] R = new int [ N ] ;
  Arrays . fill ( R , - 1 ) ;
  P [ 0 ] [ 0 ] = - 1 ;
  P [ 0 ] [ 1 ] = 1 ;
  P [ 0 ] [ 2 ] = 1 ;
  P [ 0 ] [ 3 ] = 1 ;
  P [ 0 ] [ 4 ] = 1 ;
  P [ 0 ] [ 5 ] = 1 ;
  P [ 0 ] [ 6 ] = 1 ;
  int [ ] que = new int [ N ] ;
  int prv = L ;
  for ( int a = 0 ;
  a < P . length ;
  a ++ ) {
    int b = P [ a ] [ b ] ;
    for ( int i = prv - 1 ;
    i >= b ;
    i -- ) {
      T [ i ] = Math . max ( T [ i ] , T [ i + 1 ] ) ;
    }
    int c = T [ b ] [ a ] ;
    R [ j ] = - 1 ;
    que [ j ] = c ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    T [ i ] = que [ i ] ;
  }
  return P ;
}
