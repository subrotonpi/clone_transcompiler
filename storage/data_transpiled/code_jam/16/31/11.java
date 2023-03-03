public static String alphabet ( int i ) {
  String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" ;
  return alphabet . charAt ( i ) ;
}
int T = Integer . parseInt ( scanner . nextLine ( ) ) ;
for ( int test_case = 0 ;
test_case < T ;
test_case ++ ) {
  int N = Integer . parseInt ( scanner . nextLine ( ) ) ;
  int [ ] [ ] P = new int [ N ] [ 2 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    P [ i ] [ 0 ] = alphabet . charAt ( i ) ;
    P [ i ] [ 1 ] = Integer . parseInt ( scanner . nextLine ( ) ) ;
  }
  String answer = "" ;
  while ( Integer . parseInt ( P [ 1 ] [ 0 ] ) > 3 ) {
    Arrays . sort ( P [ 0 ] [ 1 ] , Integer . reverseOrder ( P [ 1 ] [ 0 ] ) ) ;
    answer += P [ 0 ] [ 0 ] + "" + P [ 1 ] [ 0 ] + " " ;
    P [ 0 ] [ 1 ] = P [ 0 ] [ 1 ] - 1 ;
    P [ 1 ] [ 1 ] = P [ 1 ] [ 1 ] - 1 ;
  }
  if ( Integer . parseInt ( P [ 1 ] [ 1 ] ) == 3 ) {
    Arrays . sort ( P [ 0 ] [ 1 ] , Integer . reverseOrder ( P [ 1 ] [ 1 ] ) ) ;
    answer += P [ 0 ] [ 0 ] + "" + P [ 0 ] [ 0 ] + " " ;
    P [ 0 ] [ 1 ] = P [ 0 ] [ 1 ] - 1 ;
  }
  if ( Integer . parseInt ( P [ 1 ] [ 1 ] ) == 2 ) {
    int [ ] letter = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      letter [ i ] = P [ i ] [ 1 ] ;
    }
    answer += letter [ 0 ] + "" + letter [ 1 ] + " " ;
    P [ 0 ] [ 1 ] = P [ 0 ] [ 1 ] - 1 ;
    P [ 1 ] [ 1 ] = P [ 1 ] [ 1 ] - 1 ;
  }
  System . out . println ( "Case #" + ( test_case + 1 ) + ": " + answer ) ;
}
