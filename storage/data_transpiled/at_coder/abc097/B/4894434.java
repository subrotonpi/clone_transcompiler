public static List < Integer > nums = new ArrayList < > ( ) {
  private static final long X = Long . parseLong ( input ) ;
  @ Override public void process ( ) {
    for ( int i = 1 ;
    i <= 100 ;
    i ++ ) {
      for ( int j = 2 ;
      j <= 100 ;
      j ++ ) {
        if ( i * j > X ) {
          continue ;
        }
        else {
          nums . add ( i * j ) ;
        }
      }
    }
  }
}
