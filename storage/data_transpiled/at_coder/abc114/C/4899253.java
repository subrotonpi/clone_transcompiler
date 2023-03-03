static final int [ ] getMatchingHako ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int keta = String . valueOf ( n ) . length ( ) ;
  ArrayList < Integer > hako = new ArrayList < > ( ) ;
  for ( int i = 3 ;
  i <= keta ;
  i ++ ) {
    for ( String c : Collections . list ( new String [ ] {
      "7" , "5" , "3" }
      , i ) ) {
        if ( new HashSet < > ( Arrays . asList ( c ) ) . size ( ) == 3 ) {
          int a = Integer . parseInt ( new String ( c ) ) ;
          hako . add ( a ) ;
        }
      }
    }
    if ( hako . contains ( n ) ) {
      Collections . sort ( hako ) ;
      int k = hako . indexOf ( n ) ;
      String [ ] b = hako . toArray ( new String [ hako . size ( ) ] ) ;
      System . out . println ( b . length + 1 ) ;
    }
    else {
      hako . add ( n ) ;
      Collections . sort ( hako ) ;
      int k = hako . indexOf ( n ) ;
      String [ ] b = hako . toArray ( new String [ hako . size ( ) ] ) ;
      System . out . println ( ( int ) b . length ) ;
    }
    return b ;
  }
  