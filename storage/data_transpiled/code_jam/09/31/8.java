public static void main ( Scanner in ) {
  int n = in . nextInt ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    String s = in . next ( ) ;
    HashMap < Integer , Integer > symbols = new HashMap < Integer , Integer > ( ) ;
    if ( s . length ( ) == 1 ) {
      System . out . println ( "Case #" + ( i + 1 ) + ": " + 1 ) ;
      continue ;
    }
    for ( int j = 0 ;
    j < s . length ( ) ;
    j ++ ) {
      symbols . put ( s . charAt ( j ) , null ) ;
    }
    int base = symbols . size ( ) ;
    if ( base == 1 ) {
      System . out . println ( "Case #" + ( i + 1 ) + ": " + 2 * s . length ( ) - 1 ) ;
      continue ;
    }
    int curnum = 1 ;
    int val = 0 ;
    for ( int j = 0 ;
    j < s . length ( ) ;
    j ++ ) {
      if ( symbols . get ( j ) == null ) {
        symbols . put ( s . charAt ( j ) , curnum ) ;
        if ( curnum == 1 ) {
          curnum = 0 ;
        }
        else if ( curnum == 0 ) {
          curnum = 2 ;
        }
        else {
          curnum = curnum + 1 ;
        }
      }
      val = val * base + symbols . get ( j ) ;
    }
    System . out . println ( "Case #" + ( i + 1 ) + ": " + val ) ;
  }
}
