static final String getTempFile ( ) throws IOException {
  File argv = new File ( argv . getName ( ) ) ;
  FileInputStream testFile = new FileInputStream ( argv . getName ( ) + ".in" ) ;
  FileOutputStream outFile = new FileOutputStream ( argv . getName ( ) + ".out" ) ;
  int nCases = Integer . parseInt ( testFile . readLine ( ) ) ;
  for ( int i = xrange ( 1 , nCases + 1 ) ;
  i < nCases ;
  i ++ ) {
    int nFlavors = Integer . parseInt ( testFile . readLine ( ) ) ;
    int nCustomers = Integer . parseInt ( testFile . readLine ( ) ) ;
    ArrayList < Integer > customersUnmalted = new ArrayList < > ( ) ;
    ArrayList < Integer > customersMalted = new ArrayList < > ( ) ;
    customersMalted . add ( - 1 ) ;
    for ( int j = xrange ( nCustomers ) ;
    j < nFlavors ;
    j ++ ) {
      Arrays . sort ( testFile . read ( ) . split ( "\\s+" , - 1 ) ) ;
      String customer = testFile . readLine ( ) ;
      nLiked = Integer . parseInt ( customer ) ;
      ArrayList < Integer > unmalted = new ArrayList < > ( ) ;
      for ( int k = xrange ( nLiked ) ;
      k < nLiked ;
      k ++ ) {
        Arrays . sort ( customer . split ( "\\s+" , - 1 ) ) ;
        int flavor = Integer . parseInt ( customer . split ( "\\s+" , - 1 ) [ 0 ] ) ;
        int malted = Integer . parseInt ( customer . split ( "\\s+" , - 1 ) [ 0 ] ) ;
        if ( malted > 0 ) customersMalted . set ( j , flavor ) ;
        else unmalted . add ( flavor ) ;
      }
      customersUnmalted . add ( unmalted ) ;
    }
    Arrays . fill ( malted , 0 ) ;
    int [ ] satisfied = new int [ nFlavors ] ;
    while ( ! Arrays . equals ( satisfied , satisfied ) ) {
      int unsatisfied = satisfied . indexOf ( 0 ) ;
      int malt = customersMalted . get ( unsatisfied ) ;
      if ( malt == - 1 ) break ;
      else {
        int idx = unsatisfied ;
        do {
          customersMalted . remove ( idx ) ;
          customersUnmalted . remove ( idx ) ;
          try {
            idx = customersMalted . indexOf ( malt ) ;
          }
          catch ( IndexOutOfBoundsException e