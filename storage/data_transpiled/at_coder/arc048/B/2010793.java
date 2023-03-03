@ Function public static Iterable < Integer > inpl ( ) {
  return FluentIterable . from ( input -> Integer . parseInt ( input . nextLine ( ) ) ) . filter ( Integer :: nonNull ) . toList ( ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] S = new int [ 10 * 5 + 1 ] ;
  int [ ] [ ] P = new int [ 10 * 5 + 1 ] [ 3 ] ;
  List < Integer > A = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int R = inpl . get ( ) ;
    int H = inpl . get ( ) ;
    P [ R ] [ H - 1 ] ++ ;
    S [ R ] ++ ;
    A . add ( new Integer ( R ) ) ;
    A . add ( new Integer ( H ) ) ;
  }
  S = list ( accumulate ( S ) ) ;
  for ( int R = 0 ;
  R < N ;
  R ++ ) {
    int H = inpl . get ( ) ;
    int w = S [ R - 1 ] + P [ R ] [ H % 3 ] ;
    int d = P [ R ] [ H - 1 ] - 1 ;
    int l = N - w - d - 1 ;
    System . out . println ( w + " " + l + " " + d ) ;
  }
  return A ;
}
