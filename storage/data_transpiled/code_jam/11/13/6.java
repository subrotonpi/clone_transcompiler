static final int [ ] getStrengthMakers ( ) {
  final int [ ] answer = new int [ 1 + 1 ] ;
  System . err . println ( "Exception caught:" ) ;
  System . err . println ( '-' * 60 ) ;
  System . err . println ( "Press Enter to close" ) ;
  long totalTime = System . currentTimeMillis ( ) - startTime ;
  System . err . println ( "Completed in " + totalTime + " seconds" ) ;
  Thread . sleep ( 3 ) ;
  long startTime = System . currentTimeMillis ( ) ;
  try {
    String inName ;
    if ( args . length > 0 ) inName = args [ 0 ] ;
    else inName = input ( "Enter input filename: " ) ;
    assert inName . endsWith ( ".in" ) ;
    String outName = inName . replace ( ".in" , ".out" ) ;
    Scanner fin = new Scanner ( new File ( inName ) ) ;
    PrintWriter fout = new PrintWriter ( new BufferedWriter ( new FileWriter ( outName ) ) ) ;
    int numCases = Integer . parseInt ( fin . nextLine ( ) ) ;
    for ( int caseIdx = 1 ;
    caseIdx <= 1 + numCases ;
    caseIdx ++ ) {
      if ( System . currentTimeMillis ( ) >= startTime + 5 ) System . err . println ( "[== Case " + caseIdx + " of " + numCases + " ==]" ) ;
      int N = Integer . parseInt ( fin . nextLine ( ) ) ;
      hand = new Card [ N ] ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) hand [ i ] = new Card ( fin . nextLine ( ) ) ;
      int M = Integer . parseInt ( fin . nextLine ( ) ) ;
      deck = new Card [ M ] ;
      for ( int i = 0 ;
      i < M ;
      i ++ ) deck [ i ] = new Card ( fin . nextLine ( ) ) ;
      int k ;
      {
      }
      public int attemptSmall ( int k ) {
        ArrayList < Card > H = new ArrayList < Card > ( hand ) ;
        for ( int i = 0 ;
        i < M ;
        i ++ ) {
          Card card = H . remove ( i ) ;
          if ( card . c != null && card . t == null ) {
            if ( k -- > 0 ) continue ;
          }
          score += card . s ;
          H . addAll ( Arrays . asList ( card . c ) ) ;
        }
        