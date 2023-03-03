static private int [ ] [ ] tester ( int N ) {
  int maxno1 = 1e5 ;
  int maxno2 = 1e9 ;
  String s = input . nextLine ( ) ;
  if ( s . length ( ) != 0 ) return ( s ) ;
  if ( N == 0 ) {
    return ( new Random ( ) . nextInt ( 2 ) ) ;
  }
  else {
    System . out . println ( "Testing..." ) ;
    System . out . println ( "N=" + N ) ;
    A = new int [ N ] [ ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      A [ i ] = new int [ maxno2 ] ;
    }
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      A [ i ] [ 0 ] = new int [ maxno2 ] ;
    }
    return ( Arrays . copyOf ( A , i ) ) ;
  }
  final int [ ] A = new int [ N ] ;
  /* Compute the gcd of the array */
  while ( b != 0 ) {
    a = b ;
    b = a % b ;
  }
  /* Compute the gcd of the array */
  int g = A [ 0 ] ;
  for ( int i = 1 ;
  i < A . length ;
  i ++ ) {
    if ( g == 1 ) return ( A [ i ] ) ;
    g = gcd ( g , A [ i ] ) ;
  }
  /* Play move */
  A [ A . length - 1 ] -- ;
  int g = gcdm ( A ) ;
  /* Play move */
  A [ A . length - 1 ] ++ ;
  /* Play move */
  A [ A . length - 1 ] -- ;
  /* Play move */
  A [ A . length - 1 ] ++ ;
  /* Play move */
  A [ A . length - 1 ] ++ ;
  /* Play move */
  A [ A . length - 1 ] ++ ;
  /* Play move */
  A [ A . length - 1 ] ++ ;
  /* Play move */
  A [ A . length - 1 ] ++ ;
  /* Play move */
  A [ A . length - 1 ] ++ ;
  /* Play move */
  A [ A . length - 1 ] ++ ;
  /* Play move */
  A [ A . length - 1 ] ++ ;
  /* Play move */
  return ( A ) ;
}
