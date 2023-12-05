static final String getTestName ( ) throws IOException {
  String input = "test.in" ;
  input = "C-small-attempt0.in" ;
  String output = input . replace ( ".in" , ".out" ) ;
  BufferedReader inIn = new BufferedReader ( new FileReader ( input ) ) ;
  Set < String > dict = new HashSet < String > ( ) ;
  for ( String a : new BufferedReader ( new FileReader ( "dict.txt" ) ) . readlines ( ) ) {
    dict . add ( a . substring ( 0 , a . length ( ) - 1 ) ) ;
  }
  {
    dict . add ( a . substring ( 0 , a . length ( ) - 1 ) ) ;
  }
  Set < Integer > sols = new HashSet < Integer > ( ) ;
  {
    int [ ] dict = new int [ dict . size ( ) ] ;
    int i ;
    {
      int curCase = getInt ( ) ;
      String s = getLine ( ) ;
      System . out . println ( curCase ) ;
      int sol = getLine ( ) ;
      out . println ( "Case #" + curCase + ": " + sol ) ;
    }
    int [ ] [ ] dict = {
      Integer . parseInt ( getSolution ( ) ) }
      ;
      int [ ] lets = new int [ 4 ] ;
      for ( i = 0 ;
      i < dict . length ;
      i ++ ) {
        lets [ i ] = ( char ) i ;
      }
      for ( int i = 0 ;
      i < dict . length ;
      i ++ ) {
        sols . add ( new Integer ( dict [ i ] ) ) ;
      }
      int minOps = 1000000 ;
      for ( int wordLen = 1 ;
      wordLen <= Math . min ( 11 , dict . length ( ) + 1 ) ;
      wordLen ++ ) {
        String word = new String ( dict [ wordLen ] ) ;
        if ( dict . contains ( word ) ) {
          minOps = Math . min ( minOps , getMinOps ( s . substring ( wordLen ) , Math . max ( 0 , minPos - wordLen ) ) ) ;
        }
        else {
          for ( int letChg1 = 0 ;
          letChg2 < lets . length ;
          letChg1 ++ ) {
            for ( int j = 0 ;
            j < lets . length ;
            j ++ ) {
              sePWord [ j ] = s . substring ( j , wordLen ) ;
              sePWord [ letChg1 ] = letChg2 ;
              String fixedWord = new String ( sePWord ) ;
              if ( fixedWord .