static final long time = System . out , System . err = new java . util . logging . ConsoleHandler ( ) {
  public int getLineNumber ( ) {
    return Thread . currentThread ( ) . getStackTrace ( ) [ 2 ] . getLineNumber ( ) ;
  }
  public String print ( String arg0 , Object arg1 ) {
    return __builtin__ . print ( arg0 . toString ( ) + ":" , arg1 ) ;
  }
  public int moves_Plan ( int hd , int ad , int hk , int ak , int b , int d , int num_b , int num_d ) {
    int ihd = hd ;
    for ( int i = 0 ;
    i < 200 ;
    i ++ ) {
      if ( hk <= ad ) {
        return i + 1 ;
      }
      else if ( hd - ak <= 0 && num_d == 0 ) {
        hd = ihd ;
      }
      else if ( hd - ( ak - d ) <= 0 ) {
        hd = ihd ;
      }
      else if ( num_d > 0 ) {
        num_d -- ;
        ak -= d ;
      }
      else if ( num_b > 0 ) {
        num_b -- ;
        ad += b ;
      }
      else {
        hk -= ad ;
      }
      hd -= ak ;
    }
    return Double . MAX_VALUE ;
  }
  public double run ( String str ) {
    int hd = hd ;
    int ad = ad ;
    int hk = hk ;
    int ak = ak ;
    int b = b ;
    int d = d ;
    System . out . println ( str ) ;
    double r = Math . min ( moves_Plan ( hd , ad , hk , ak , b , d , num_b , num_d ) , Math . max ( 0 , Math . min ( 80 , ad ) , Math . min ( 80 - num_b , Math . min ( 80 , ad ) , Math . min ( 80 - num_b , Math . min ( 80 , ad ) , Math . min ( 80 - num_b , Math . min ( 80 , ad ) ) ) ) ) ) ;
    if ( r == Double . MAX_VALUE ) {
      return "IMPOSSIBLE" ;
    }
    return r ;
  }
  public int [ ] readCase ( ) {
    return Arrays . stream ( list ( input ( str ) . split ( " " ) ) ) . mapToInt ( Integer :: intValue ) . toArray ( ) ;
  }
}
