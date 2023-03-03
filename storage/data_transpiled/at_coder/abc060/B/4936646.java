public static int A = Integer . parseInt ( input ) {
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  int sumA = 0 ;
  int i = 1 ;
  boolean ans = false ;
  while ( sumA <= A * B + C ) {
    sumA += i * A ;
    if ( sumA % B == C ) {
      ans = true ;
      break ;
    }
  }
  if ( ans == true ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
  return i ;
}
