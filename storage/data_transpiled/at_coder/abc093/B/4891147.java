public static int A = Integer . parseInt ( input ) {
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > L = new ArrayList < > ( ) ;
  for ( int i = A ;
  i <= Math . min ( A + K , B + 1 ) ;
  i ++ ) {
    L . add ( i ) ;
  }
  for ( int i = Math . max ( B - K + 1 , A + K ) ;
  i <= B ;
  i ++ ) {
    L . add ( i ) ;
  }
  for ( int i : L ) {
    System . out . println ( i ) ;
  }
  return L . size ( ) ;
}
