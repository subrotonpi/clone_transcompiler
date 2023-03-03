public static void initializeSolver ( ) {
}
{
  int n = read ( ) ;
  int c = read ( ) ;
  int m = read ( ) ;
  Tuple [ ] a = Arrays . copyOf ( read ( ) , m ) ;
  Arrays . sort ( a , new Comparator < Tuple > ( ) {
    public int compare ( Tuple o1 , Tuple o2 ) {
      int r = 0 ;
      int ct = 0 ;
      int lastpass = 0 ;
      for ( int p = 0 ;
      p < a . length ;
      p ++ ) {
        int b = a [ p ] . get ( ) ;
        if ( b != lastpass ) {
          r = Math . max ( r , ct ) ;
          ct = 1 ;
          lastpass = b ;
        }
        else ct ++ ;
      }
      return ( r < 0 ? - 1 : 1 ) ;
    }
  }
  ) ;
  Arrays . sort ( a , new Comparator < Tuple > ( ) {
    int ct = 0 ;
    for ( int p = 0 ;
    p < a . length ;
    p ++ ) {
      int b = a [ p ] . get ( ) ;
      ct ++ ;
      while ( r * p < ct ) r ++ ;
    }
    int s = 0 ;
    ct = 0 ;
    int lastp = 0 ;
    for ( int p = 0 ;
    p < a . length ;
    p ++ ) {
      int b = a [ p ] . get ( ) ;
      if ( b != lastp ) {
        s += Math . max ( 0 , ct - r ) ;
        ct = 1 ;
        lastp = b ;
      }
      else ct ++ ;
    }
    return ( r < 0 ? - 1 : 1 ) ;
  }
  private List < String > read ( Callback callback , boolean split ) {
    String inputLine ;
    if ( sfile != null ) {
      inputLine = sfile . readLine ( ) . trim ( ) ;
    }
    else {
      inputLine = input . readLine ( ) . trim ( ) ;
    }
    if ( split ) {
      return Collections . singletonList ( callback . apply ( inputLine ) ) ;
    }
    else {
      return callback . apply ( inputLine ) ;
    }
  }
  private void write ( Object value ) {
    if ( value == null ) return ;
    try {
      if ( ! ( value instanceof String ) ) value = Arrays . toString ( ( String [ ] ) value ) ;
    }
    catch ( Exception e ) {
    }
    if ( tfile != null ) tfile . write ( value . toString ( ) ) ;
    else System . out . print ( value ) ;
  }
}
