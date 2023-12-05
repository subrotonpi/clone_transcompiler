static final Scanner input = new Scanner ( System . in ) {
  @ Override public void close ( ) {
  }
}
;
final String input = System . getProperty ( "line.separator" ) ;
final double INF = Double . MAX_VALUE ;
final double MOD = 10 * 9 + 7 ;
{
  return new Scanner ( input ) {
    @ Override public int nextInt ( ) {
      return Integer . parseInt ( input ) ;
    }
  }
  ;
}
