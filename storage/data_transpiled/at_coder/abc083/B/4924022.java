public static int N ( ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) , B = Integer . parseInt ( input . nextLine ( ) ) ;
  int total = 0 ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    int sum = 0 ;
    for ( String j : String . valueOf ( i ) . split ( " " ) ) {
      sum += Integer . parseInt ( j ) ;
    }
    if ( A <= sum && sum <= B ) {
      total += i ;
    }
  }
  System . out . println ( total ) ;
  return total ;
}
