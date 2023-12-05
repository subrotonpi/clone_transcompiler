static final String getSolutionName ( ) {
  final String problemName = "coin_jam" ;
  final boolean runOnRealData = true ;
  {
    for ( int i : xrange ( 2 , N ) ) {
      if ( N % i == 0 ) {
        return N / i ;
      }
    }
    return 1 ;
  }
  {
    final BinaryTree binary = BinaryTree . getBinaryTree ( ) ;
    {
      final int N = Integer . parseInt ( binary . getBinaryTree ( ) . toString ( ) ) ;
      {
        final int N = Integer . parseInt ( binary . getBinaryTree ( ) . toString ( ) ) ;
        {
          final int N = N / 2 ;
          for ( int j = 0 ;
          j < N ;
          j ++ ) {
            int value = 0 ;
            for ( int d : string . length ( ) ) {
              value = base * value + Integer . parseInt ( string . substring ( j , j + 1 ) ) ;
            }
            return value ;
          }
        }
      }
    }
    ;
  }
  {
    final int F = biggestFactor ( N ) ;
    final List < List < Integer >> result = new ArrayList < > ( ) ;
    for ( int x : xrange ( 2 * F - 2 , 2 * F - 1 ) ) {
      final BinaryTree B = binary . getBinaryTree ( x * 2 + 1 ) ;
      final List < Integer > row = new ArrayList < > ( ) ;
      row . add ( B . mult ( N / F ) ) ;
      for ( int base : xrange ( 2 , 11 ) ) {
        row . add ( convertToBaseTen ( B , base ) ) ;
      }
      result . add ( row ) ;
      if ( result . size ( ) >= J ) {
        return result . toString ( ) ;
      }
    }
    final File currentDir = new File ( System . getProperty ( "user.dir" ) ) ;
    final String inputString = "C-large.in" ;
    final String outputString = problemName + ( ! runOnRealData ? "_example_output" : "_output" ) ;
    final File inFile = new File ( currentDir , "inputfiles" + inputString ) ;
    final File outFile = new File ( currentDir , "outputfiles" + outputString + ".txt" ) ;
    if ( outFile . exists ( ) ) {
      outFile . delete ( ) ;
    }
    try {
      final BufferedReader inputReader = new BufferedReader ( new FileReader ( inFile ) ) ;
      final int numberOfCases = Integer . parseInt ( inputReader . readLine ( ) ) ;
      for ( int testCase : xrange ( 1 , numberOfCases