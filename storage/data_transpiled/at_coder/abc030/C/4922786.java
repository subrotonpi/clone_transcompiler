public static int pilot ( @ Nonnegative int N , @ Nonnegative int M , @ Nonnegative int X , @ Nonnegative int Y , @ Nonnegative int [ ] A , @ Nonnegative int [ ] B ) {
  int ai = 0 , bi = 0 ;
  int t = 0 ;
  int repeat = 0 ;
  while ( ai < N && bi < M ) {
    while ( ai < N && A [ ai ] < t ) ai ++ ;
    if ( N <= ai ) break ;
    t = A [ ai ] + X ++ ;
    while ( bi < M && B [ bi ] < t ) bi ++ ;
    if ( M <= bi ) break ;
    t = B [ bi ] + Y ++ ;
    bi ++ ;
    repeat ++ ;
  }
  if ( getClass ( ) . equals ( String . class ) ) {
    N = Integer . parseInt ( input . readLine ( ) ) ;
    M = Integer . parseInt ( input . readLine ( ) ) ;
    X = Integer . parseInt ( input . readLine ( ) ) ;
    Y = Integer . parseInt ( input . readLine ( ) ) ;
    A = Arrays . copyOf ( A , A . length ) ;
    B = Arrays . copyOf ( B , B . length ) ;
    int ans = pilot ( N , M , X , Y , A , B ) ;
    System . out . println ( ans ) ;
  }
  return repeat ;
}
