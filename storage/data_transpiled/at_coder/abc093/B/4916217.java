public static int [ ] getPermitasuSeisu ( ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] mitasuSeisu = new int [ A + K + 1 ] ;
  for ( int i = A ;
  i < Math . min ( A + K , B ) ;
  i ++ ) {
    mitasuSeisu [ i ] = i ;
  }
  for ( int j = Math . max ( A , B - K + 1 ) ;
  j <= B ;
  j ++ ) {
    mitasuSeisu [ j ] = j ;
  }
  for ( int k : new ArrayList < Integer > ( mitasuSeisu ) ) {
    System . out . println ( k ) ;
  }
  return mitasuSeisu ;
}
