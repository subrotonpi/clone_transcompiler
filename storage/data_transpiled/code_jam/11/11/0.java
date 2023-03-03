static final Scanner getScanner ( ) {
  final Scanner rl = new Scanner ( System . in ) ;
  final int t = Integer . parseInt ( rl . nextLine ( ) ) ;
  for ( int cc = 0 ;
  cc < t ;
  cc ++ ) {
    System . out . printf ( "Case #%d:%n" , cc + 1 ) ;
    final int n = Integer . parseInt ( rl . nextLine ( ) ) ;
    final int pDay = Integer . parseInt ( rl . nextLine ( ) ) ;
    final int pAll = Integer . parseInt ( rl . nextLine ( ) ) ;
    final int g = 100 / MathUtils . gcd ( pDay , 100 ) ;
    if ( ( n >= g ) && ! ( pDay < 100 && pAll == 100 ) && ! ( pDay > 0 && pAll == 0 ) ) {
      System . out . println ( "Possible" ) ;
    }
    else {
      System . out . println ( "Broken" ) ;
    }
  }
  return rl ;
}
