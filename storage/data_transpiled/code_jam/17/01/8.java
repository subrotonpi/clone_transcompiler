@ String infilecode = "ALI" ;
final String [ ] infilecode = "ALI" . split ( infilecode ) ;
final String [ ] mapping = {
  "A" , "B" , "C" , "D" , "E" , "X" , "example" , "S" , "-small" , "L" , "-large" , "P" , "-practice" , "0" , "-attempt0" , "1" , "-attempt1" , "2" , "-attempt2" , "I" , ".in" , "T" , ".txt" }
  ;
  final String infile = new String ( mapping [ infilecode . length ] ) ;
  final String outfile = infile . replace ( ".in" , "" ) + ".out.txt" ;
  System . setIn ( new FileInputStream ( infile ) ) ;
  final PrintStream output = new PrintStream ( new FileOutputStream ( outfile ) ) ;
  final int T = Integer . parseInt ( input ) ;
  for ( int testCase = 1 ;
  testCase <= T ;
  testCase ++ ) {
    String S = input . split ( " " ) ;
    String K = input . split ( " " ) ;
    System . out . println ( S + " " + K ) ;
    K = Integer . parseInt ( K ) ;
    int len = S . length ( ) ;
    int L = len ;
    int flips = 0 ;
    for ( int i = 0 ;
    i < L - K + 1 ;
    i ++ ) {
      if ( S . charAt ( i ) == '-' ) {
        flips ++ ;
        for ( int j = i ;
        j < i + K ;
        j ++ ) {
          S [ j ] = new Integer ( S . charAt ( j ) ) ;
        }
      }
    }
    String answer ;
    if ( len == L ) {
      answer = flips ;
    }
    else {
      answer = "IMPOSSIBLE" ;
    }
    System . out . println ( "Case #" + testCase + ":" + answer ) ;
    System . out . println ( "Case #" + testCase + ":" + answer ) ;
  }
  