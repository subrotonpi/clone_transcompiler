public static int [ ] value ( ) {
  String B = input . nextLine ( ) . split ( " " ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  return A ;
  /* value(N) */
  String s = String . valueOf ( N ) ;
  String [ ] a = new String [ s . length ( ) ] ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    int k = B . indexOf ( s . charAt ( i ) ) ;
    a [ i ] = String . valueOf ( k ) ;
  }
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    System . out . println ( a [ i ] ) ;
  }
}
