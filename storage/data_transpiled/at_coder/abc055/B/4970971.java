public static void main ( String [ ] args ) {
  final Scanner input = new Scanner ( System . in ) ;
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int MOD = 10 * 9 + 7 ;
  int ans = 1 ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    ans *= i ;
    ans = ans % MOD ;
  }
  if ( getClass ( ) . equals ( Main . class ) ) {
    System . out . println ( Main . class . getName ( ) ) ;
  }
}
