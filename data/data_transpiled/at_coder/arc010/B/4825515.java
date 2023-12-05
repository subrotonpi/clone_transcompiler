public static int N = Integer . parseInt ( input ) {
  int [ ] [ ] md = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) md [ i ] [ 0 ] = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] day_of_month = {
    0 , 31 , 29 , 31 , 30 , 31 , 30 , 31 , 31 , 30 , 31 , 30 , 31 }
    ;
    @ SuppressWarnings ( "unchecked" ) List < Integer > index_of_month = Collections . unmodifiableList ( Arrays . asList ( day_of_month ) ) ;
    int [ ] ds = new int [ 367 ] ;
    for ( int i = 1 ;
    i < ds . length ;
    i += 7 ) {
      ds [ i ] = 1 ;
    }
    for ( int i = 7 ;
    i < ds . length ;
    i += 7 ) {
      ds [ i ] = 1 ;
    }
    for ( int m = 0 ;
    m < md . length ;
    m ++ ) {
      int d = md [ m ] [ i ] ;
      int i = index_of_month . get ( m - 1 ) + d ;
      while ( ds [ i ] == 1 && i + 1 < ds . length ) {
        i ++ ;
      }
      ds [ i ] = 1 ;
    }
    int result = Math . max ( Integer . bitCount ( r ) , ( r [ 0 ] << 32 ) + r [ 1 ] ) ;
    System . out . println ( result ) ;
    return result ;
  }
  