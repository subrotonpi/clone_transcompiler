@ Test public static void infilecode ( ) throws IOException {
  final String [ ] mapping = {
    "A" , "B" , "C" , "D" , "E" , "X" , "example" , "S" , "-small" , "L" , "-large" , "P" , "-practice" , "0" , "-attempt0" , "1" , "-attempt1" , "2" , "-attempt2" , "z" , "Z" , "-2" , "I" , ".in" , "T" , ".txt" }
    ;
    final String infile = Arrays . toString ( mapping [ infilecode ] ) ;
    final String outfile = infile . replace ( ".in" , "" ) + ".out.txt" ;
    System . setIn ( new FileInputStream ( infile ) ) ;
    final PrintStream output = new PrintStream ( new FileOutputStream ( outfile ) ) ;
    final int T = Integer . parseInt ( input ( ) ) ;
    for ( int testCase = 1 ;
    testCase <= T ;
    testCase ++ ) {
      final int N = Integer . parseInt ( input ( ) ) ;
      final int K = Integer . parseInt ( input ( ) ) ;
      System . out . println ( N + " " + K ) ;
      int [ ] sizes = {
        N , N + 1 }
        ;
        int [ ] num = {
          1 , 0 }
          ;
          while ( K > Integer . MAX_VALUE ) {
            final int a = sizes [ 0 ] ;
            final int b = sizes [ 1 ] ;
            K -= Integer . MAX_VALUE ;
            num [ 0 ] = ( a - 1 ) / 2 ;
            num [ 1 ] = b / 2 ;
            if ( a % 2 == 0 ) {
              num = new int [ 2 ] ;
              num [ 0 ] = num [ 0 ] ;
              num [ 1 ] = num [ 0 ] + num [ 1 ] * 2 ;
            }
            else {
              num = new int [ 2 ] ;
              num [ 0 ] = num [ 0 ] * 2 + num [ 1 ] ;
              num [ 1 ] = num [ 1 ] ;
            }
            System . out . println ( sizes + " " + num + " " + K ) ;
          }
          if ( K <= num [ 1 ] ) {
            final int size = sizes [ 1 ] ;
            if ( size > 0 ) {
              final int R = size / 2 ;
              final int L = ( size - 1 ) / 2 ;
              final String answer = Integer . toString ( R ) + " " + Integer . toString