public static int N ( ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) , B = Integer . parseInt ( input . nextLine ( ) ) ;
  int total = 0 ;
  for ( int num = 1 ;
  num <= N ;
  num ++ ) {
    int sum = 0 ;
    for ( String kurai : String . valueOf ( num ) ) {
      sum += Integer . parseInt ( kurai ) ;
    }
    if ( A <= sum && sum <= B ) {
      total += num ;
    }
  }
  System . out . println ( total ) ;
  return total ;
}
