public static void readFileAsBruteForce ( String rString ) throws IOException {
  BufferedReader br = new BufferedReader ( new FileReader ( rString ) ) ;
  int numcases = Integer . parseInt ( br . readLine ( ) ) ;
  for ( int testCase = 0 ;
  testCase < numcases ;
  testCase ++ ) {
    String line = br . readLine ( ) ;
    int numflavors = Integer . parseInt ( line ) ;
    line = br . readLine ( ) ;
    int numcust = Integer . parseInt ( line ) ;
    Cust [ ] [ ] cust = new Cust [ numcust ] [ ] ;
    for ( int i = 0 ;
    i < numcust ;
    i ++ ) {
      line = br . readLine ( ) ;
      int [ ] numbers = ArrayUtil . toIntArray ( line . split ( "\\s+" ) ) ;
      int numlikes = numbers [ 0 ] ;
      int [ ] likesnormal = new int [ numlikes ] ;
      int [ ] likesmalted = new int [ numlikes ] ;
      for ( int j = 0 ;
      j < numlikes ;
      j ++ ) {
        if ( numbers [ j * 2 + 2 ] == 0 ) likesnormal [ j ] = numbers [ j * 2 + 1 ] ;
        else likesmalted [ j ] = numbers [ j * 2 + 1 ] ;
      }
      if ( likesmalted . length > 1 ) throw new RuntimeException ( ) ;
      cust [ i ] = new Cust [ ] {
        likesnormal , likesmalted }
        ;
      }
      int [ ] flavors = new int [ numflavors ] ;
      boolean [ ] custdone = new boolean [ numcust ] ;
      boolean impossible = false ;
      do {
        boolean nothingChanged = true ;
        for ( int i = 0 ;
        i < numcust ;
        i ++ ) {
          if ( custdone [ i ] ) continue ;
          if ( cust [ i ] [ 0 ] . length ( ) == 0 ) {
            if ( cust [ i ] [ 1 ] . length == 0 ) {
              impossible = true ;
              break ;
            }
            else {
              int malted = cust [ i ] [ 1 ] [ 0 ] ;
              custdone [ i ] = true ;
              if ( flavors [ malted - 1 ] != 1 ) {
                flavors [ malted - 1 ] = 1 ;
                nothingChanged = false ;
                for ( int j = 0 ;
                j < numcust ;
                j ++ ) {
                  if ( cust [ j ] [ 0 ] . contains ( malted ) ) {
                    cust [