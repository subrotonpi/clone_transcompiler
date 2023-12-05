public static int A = Integer . parseInt ( input ) {
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int min = Math . min ( A + K - 1 , B ) ;
  int max = Math . max ( A + K , B - K + 1 ) ;
  for ( int i = A ;
  i <= min ;
  i ++ ) {
    System . out . println ( i ) ;
  }
  for ( int i = max ;
  i <= B ;
  i ++ ) {
    System . out . println ( i ) ;
  }
  return A ;
}
