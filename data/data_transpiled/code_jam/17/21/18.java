static final int [ ] [ ] solve ( ) {
  final int [ ] [ ] testCases = new int [ 10 ] [ 10 ] ;
  boolean verbose = false ;
  {
    int d = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    int n = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    for ( int i = 0 ;
    i < d ;
    i ++ ) {
      int res = testCases [ i ] [ 0 ] ;
      System . out . println ( "Case #" + ( i + 1 ) + ":" ) ;
      write ( res ) ;
    }
  }
  {
    int d = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    int n = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    int [ ] [ ] horses = new int [ n ] [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) horses [ i ] = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) horses [ i ] [ 0 ] = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) horses [ i ] [ 1 ] = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    printDot ( ) ;
  }
  {
    int res = 0 ;
    System . out . println ( res ) ;
  }
  {
    int d = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    int n = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    int [ ] [ ] horses = new int [ n ] [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) horses [ i ] = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) horses [ i ] [ 0 ] = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      res = horses [ i ] [ 0 ] ;
    }
    printDot ( ) ;
  }
  {
    if ( verbose ) {
      System . err . print ( "." ) ;
      System . err . flush ( ) ;
    }
  }
  if ( verbose ) {
    System . err . print ( "." ) ;
    System . err . flush ( ) ;
  }
  return