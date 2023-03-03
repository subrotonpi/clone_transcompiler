public static int N = Integer . parseInt ( input ) {
  int MOD = ( int ) ( 1e9 + 7 ) ;
  char [ ] tokens = {
    'A' , 'C' , 'G' , 'T' }
    ;
    ArrayList < String > suffixes = new ArrayList < String > ( ) ;
    for ( char suffix1 : tokens ) {
      for ( char suffix2 : tokens ) {
        for ( char suffix3 : tokens ) {
          suffixes . add ( suffix1 + suffix2 + suffix3 ) ;
        }
      }
    }
    int [ ] [ ] dp = new int [ N + 1 ] [ N + 1 ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      dp [ i ] [ 0 ] = 0 ;
    }
    HashMap < String , Integer > reverseIndex = new HashMap < String , Integer > ( ) ;
    for ( int i = 0 ;
    i < suffixes . size ( ) ;
    i ++ ) {
      reverseIndex . put ( suffixes . get ( i ) , i ) ;
    }
    /*print dp */
    N = dp . length ;
    M = dp [ 0 ] . length ;
    for ( int i = 0 ;
    i < dp . length ;
    i ++ ) {
      String st = "" ;
      for ( int j = 0 ;
      j < dp [ i ] . length ;
      j ++ ) {
        st += dp [ i ] [ j ] ;
        st += " " ;
      }
      System . out . println ( st ) ;
    }
    for ( int i = 0 ;
    i < suffixes . size ( ) ;
    i ++ ) {
      String s = suffixes . get ( i ) ;
      if ( ! s . equals ( "AGC" ) && ! s . equals ( "ACG" ) && ! s . equals ( "GAC" ) ) {
        dp [ 3 ] [ i ] = 1 ;
      }
    }
    HashSet < String > validStr4 = new HashSet < String > ( ) ;
    /*swap the string */
    StringBuilder sNew = new StringBuilder ( s ) ;
    sNew . append ( s . charAt ( 0 ) ) ;
    sNew . append ( s . charAt ( 1 ) ) ;
    sNew . append ( s . charAt ( 2 ) ) ;
    sNew . append ( s . charAt ( 3 ) ) ;
    return sNew . toString ( ) ;
  }
  