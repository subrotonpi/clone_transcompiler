@ VisibleForTesting static void main ( String [ ] args ) throws IOException {
  final String [ ] TEST_CASES = {
    "2\n2 4\n3 5\n" , "Case #1: 1\n" , "Case #2: 2\n" }
    ;
    final String [ ] [ ] testCase = {
      {
        "-f" , "--file" , "FILE" }
        , {
          "--file" , "FILE" }
          , {
            "--file" , "FILE" }
            , {
              "--rows" , Integer . parseInt ( testCase [ 0 ] ) }
              , {
                "--cols" , Integer . parseInt ( testCase [ 1 ] ) }
              }
              ;
              final CommandLine cli = new CommandLine ( args ) ;
              cli . addBooleanOption ( "--file" , "--file" ) ;
              cli . addBooleanOption ( "--file" , "--file" ) ;
              final BufferedReader inputReader = new BufferedReader ( new FileReader ( new File ( args [ 0 ] ) ) ) ;
              final BufferedWriter outputWriter = new BufferedWriter ( new FileWriter ( new File ( args [ 1 ] ) ) ) ;
              solveInputs ( inputReader , outputWriter ) ;
              final String problemInput = "" ;
              final int rows = 1 ;
              final int cols = 1 ;
              int answer ;
              if ( rows == 2 ) {
                answer = 1 ;
                if ( cols % 3 == 0 ) {
                  answer ++ ;
                }
                if ( cols % 6 == 0 ) {
                  answer ++ ;
                }
              }
              else if ( rows == 3 ) {
                answer = 2 ;
                if ( cols % 4 == 0 ) {
                  answer ++ ;
                }
              }
              else if ( rows == 4 ) {
                answer = 1 ;
                if ( cols % 3 == 0 ) {
                  answer += 2 ;
                }
                if ( cols % 6 == 0 ) {
                  answer += 2 ;
                }
              }
              else if ( rows == 5 ) {
                answer = 1 ;
                if ( cols % 3 == 0 ) {
                  answer += 2 ;
                }
                if ( cols % 6 == 0 ) {
                  answer += 2 ;
                }
              }
              else if ( rows == 6 ) {
                answer = 2 ;
                if ( cols % 3 == 0 ) {
                  answer += 4 ;
                }
                if ( cols % 4 == 0 ) {
                  answer += 2 ;
                }
                if ( cols % 6 == 0 ) {
                  answer += 13 ;
                }
              }
              System . out . println ( outputWriter . toString ( ) ) ;
            }
            