public static void print ( int N ) {
  int [ ] d = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) d [ i ] = Integer . parseInt ( input ( ) ) ;
  String ans = String . valueOf ( sum ( d ) ) + "\n" + String . valueOf ( max ( 2 * max ( d ) - sum ( d ) , 0 ) ) ;
  System . out . println ( ans ) ;
}
