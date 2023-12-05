public static int [ ] editorial ( @ Nonnegative int N , int Q , @ Nonnegative int [ ] queries ) {
  int [ ] a = new int [ N ] ;
  for ( int l = 0 ;
  l < queries . length ;
  l ++ ) {
    int r = queries [ l ] ;
    int t = queries [ r ] ;
    for ( int i = l - 1 ;
    i < r ;
    i ++ ) {
      a [ i ] = t ;
    }
  }
  if ( getClass ( ) . isClassPresent ( "java.util.Scanner" ) ) {
    Q = 0 ;
    N = Integer . parseInt ( input . nextLine ( ) ) ;
    queries = Arrays . asList ( new int [ Q ] ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      queries [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    }
  }
  int [ ] ans = editorial ( N , Q , queries ) ;
  for ( int a : ans ) {
    System . out . println ( a ) ;
  }
  return a ;
}
