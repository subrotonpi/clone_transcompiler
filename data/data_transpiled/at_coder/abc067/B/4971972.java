public static int N ( ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > L = new LinkedList < Integer > ( ) ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    L . add ( i ) ;
  }
  L . sort ( ) ;
  int Ans = 0 ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    Ans += L . get ( i ) ;
  }
  System . out . println ( Ans ) ;
  return N ;
}
