public static int S ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  if ( N <= 5 ) {
    System . out . println ( S [ 0 ] + S [ N - 1 ] ) ;
  }
  else if ( N <= 10 ) {
    System . out . println ( S [ 1 ] + S [ N - 6 ] ) ;
  }
  else if ( N <= 15 ) {
    System . out . println ( S [ 2 ] + S [ N - 11 ] ) ;
  }
  else if ( N <= 20 ) {
    System . out . println ( S [ 3 ] + S [ N - 16 ] ) ;
  }
  else {
    System . out . println ( S [ 4 ] + S [ N - 21 ] ) ;
  }
  return N ;
}
