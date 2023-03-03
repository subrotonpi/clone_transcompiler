public static void input ( ) {
  int A = Integer . parseInt ( input . readLine ( ) ) ;
  int B = Integer . parseInt ( input . readLine ( ) ) ;
  int C = Integer . parseInt ( input . readLine ( ) ) ;
  int D = Integer . parseInt ( input . readLine ( ) ) ;
  StringBuffer ans = new StringBuffer ( ) ;
  for ( int i = 0 ;
  i < S . length ;
  i ++ ) {
    if ( i == A || i == B || i == C || i == D ) {
      ans . append ( '"' ) ;
    }
    else {
      ans . append ( S [ i ] ) ;
    }
  }
  if ( S . length == D ) {
    ans . append ( '"' ) ;
  }
  System . out . println ( ans ) ;
}
