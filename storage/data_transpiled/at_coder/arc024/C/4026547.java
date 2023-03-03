@ Function public static LinkedHashMap < Integer , Integer > inpl ( ) {
  return map ( input -> Integer . parseInt ( input . nextLine ( ) ) , N , K ) ;
  String S = input . nextLine ( ) ;
  int [ ] vec = new int [ 26 ] ;
  LinkedHashMap < Integer , Integer > D = new LinkedHashMap < > ( ) ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    vec [ ( int ) S . charAt ( i ) - 97 ] ++ ;
  }
  D . put ( new Integer ( vec [ 0 ] ) , 0 ) ;
  for ( int i = 0 ;
  i < N - K ;
  i ++ ) {
    vec [ ( int ) S . charAt ( i ) - 97 ] -- ;
    vec [ ( int ) S . charAt ( i + K ) - 97 ] ++ ;
    D . put ( new Integer ( vec [ i ] ) , i + 1 ) ;
  }
  for ( Map . Entry < Integer , Integer > e : D . entrySet ( ) ) {
    if ( e . getValue ( ) - e . getValue ( ) >= K ) {
      System . out . println ( "YES" ) ;
      break ;
    }
  }
  else {
    System . out . println ( "NO" ) ;
  }
  return D ;
}
