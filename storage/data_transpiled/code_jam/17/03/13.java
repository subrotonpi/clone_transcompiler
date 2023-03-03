static final String getLargeString ( ) throws IOException {
  final String fileName = "C-large" ;
  System . setProperty ( "input" , fileName ) ;
  final PrintStream output = new PrintStream ( new FileOutputStream ( fileName + ".in" ) ) ;
  final int T = Integer . parseInt ( input ) ;
  for ( int testCase = 1 ;
  testCase <= T ;
  testCase ++ ) {
    final String S = input . nextLine ( ) ;
    System . out . println ( "S = " + S ) ;
    String N , K ;
    N = S . split ( "\\s+" ) [ 0 ] ;
    K = Integer . parseInt ( N ) ;
    System . out . println ( "N = " + N ) ;
    System . out . println ( "K = " + K ) ;
    int moves = 0 ;
    final List < Integer > gapSize = new ArrayList < Integer > ( ) ;
    gapSize . add ( N ) ;
    final Map < Integer , Integer > gapNumber = new HashMap < Integer , Integer > ( ) ;
    gapNumber . put ( N , 1 ) ;
    int size = 0 ;
    boolean done = false ;
    while ( ! done ) {
      final int m = gapSize . remove ( 0 ) ;
      final int n = gapNumber . get ( m ) ;
      if ( n + moves >= K ) {
        size = m ;
        done = true ;
      }
      else {
        moves += n ;
        for ( int a = m / 2 ;
        a <= ( m - 1 ) / 2 ;
        a ++ ) {
          if ( gapNumber . containsKey ( a ) ) {
            gapNumber . get ( a ) + = n ;
          }
          else {
            gapNumber . put ( a , n ) ;
            gapSize . add ( a ) ;
          }
        }
      }
    }
    final String answer = Integer . toString ( size / 2 ) + " " + Integer . toString ( ( size - 1 ) / 2 ) ;
    System . out . println ( "Case #" + testCase + ":" + answer ) ;
    output . println ( "Case #" + testCase + ":" + answer ) ;
  }
  return output . toString ( ) ;
}
