public static int N ( ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > L = new ArrayList < > ( Collections . nCopies ( K , Integer . MAX_VALUE ) ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    ans = ans + L . get ( i ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
