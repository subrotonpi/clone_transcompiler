@ Test public static void infilecode ( ) throws IOException {
  final String [ ] mapping = {
    "A" , "B" , "C" , "D" , "E" , "X" , "example" , "S" , "-small" , "L" , "-large" , "P" , "-practice" , "0" , "-attempt0" , "1" , "-attempt1" , "2" , "-attempt2" , "I" , ".in" , "T" , ".txt" }
    ;
    final String infile = Arrays . toString ( mapping ) ;
    final String outfile = infile . replace ( ".in" , "" ) + ".out.txt" ;
    System . setIn ( new FileInputStream ( infile ) ) ;
    final PrintStream output = new PrintStream ( new FileOutputStream ( outfile ) ) ;
    final int T = Integer . parseInt ( input ( ) ) ;
    for ( int testCase = 1 ;
    testCase <= T ;
    testCase ++ ) {
      int N = Integer . parseInt ( input ( ) ) ;
      System . out . println ( N ) ;
      String a = Integer . toString ( N ) ;
      final int l = a . length ( ) ;
      for ( int i = l - 1 ;
      i > 0 ;
      i -- ) {
        if ( a . charAt ( i ) >= a . charAt ( i - 1 ) ) continue ;
        a = a . substring ( 0 , i ) + "0" ;
        N = Integer . parseInt ( a ) - 1 ;
        a = Integer . toString ( N ) ;
      }
      final String answer = a ;
      System . out . println ( "Case #" + testCase + ":" + answer ) ;
      System . out . println ( "Case #" + testCase + ":" + answer ) ;
    }
  }
  