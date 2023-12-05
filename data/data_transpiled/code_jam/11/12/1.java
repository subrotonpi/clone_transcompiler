static final String solve ( String [ ] words , String seq ) throws IOException {
  BufferedReader input = new BufferedReader ( new FileReader ( "test.in" ) ) ;
  PrintWriter output = new PrintWriter ( new BufferedWriter ( new FileWriter ( "test.out" ) ) ) ;
  int numTests = 0 ;
  int lineI = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    lineI ++ ;
    String word = lines [ lineI ++ ] ;
    String [ ] words = words [ i ] . split ( " " ) ;
    String [ ] ans = new String [ m ] ;
    for ( int j = 0 ;
    j < m ;
    j ++ ) {
      lineI ++ ;
      String [ ] seq = lines [ lineI ++ ] . split ( " " ) ;
      ans [ j ] = solve ( words , seq ) ;
    }
    output . println ( "Case #" + ( t + 1 ) + ": " + Arrays . toString ( ans ) + "\n" ) ;
  }
  {
    String mask = "" ;
    for ( int j = 0 ;
    j < word . length ( ) ;
    j ++ ) mask += "?" ;
  }
  {
    Map < Integer , List < Integer >> sets = new HashMap < Integer , List < Integer >> ( ) ;
    int [ ] cnts = new int [ words . length ] ;
    int [ ] masks = new int [ words . length ] ;
    for ( int i = 0 ;
    i < words . length ;
    i ++ ) {
      int mask = initMask ( words [ i ] ) ;
      masks [ i ] = mask ;
      cnts [ i ] = 0 ;
      if ( sets . containsKey ( mask ) ) sets . get ( mask ) . add ( i ) ;
      else sets . put ( mask , new ArrayList < Integer > ( ) ) ;
    }
    for ( int p = 0 ;
    p < seq . length ( ) ;
    p ++ ) {
      Map < Integer , List < Integer >> nextSets = new HashMap < Integer , List < Integer >> ( ) ;
      Iterator < Integer > iter = sets . keySet ( ) . iterator ( ) ;
      while ( iter . hasNext ( ) ) {
        Integer mask = iter . next ( ) ;
        int [ ] wordIdx = mask . split ( " " ) ;
        if ( wordIdx . length == 1 ) continue ;
        boolean flag = false ;
        for ( int idx : wordIdx ) {
          if ( words [ idx ] . indexOf ( seq . charAt ( p ) ) != -