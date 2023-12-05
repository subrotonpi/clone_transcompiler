public static int N = Integer . parseInt ( input ) {
  int P = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  int k = Lists . newArrayList ( ) . stream ( ) . filter ( x -> x % 2 == 0 ) . findFirst ( ) . get ( ) . size ( ) ;
  int l = Lists . newArrayList ( ) . stream ( ) . filter ( x -> x % 2 == 1 ) . findFirst ( ) . get ( ) . size ( ) ;
  if ( k == N ) {
    System . out . println ( P == 0 ? 2 * N : 0 ) ;
  }
  else {
    System . out . println ( 2 * ( N - 1 ) ) ;
  }
  return l ;
}
