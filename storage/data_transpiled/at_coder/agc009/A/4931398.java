public static int N = Integer . parseInt ( input ) {
  int [ ] pairs = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = Integer . parseInt ( input . readLine ( ) ) ;
    int b = Integer . parseInt ( input . readLine ( ) ) ;
    pairs [ i ] = new int [ ] {
      a , b }
      ;
    }
    pairs = pairs . clone ( ) ;
    int total = 0 ;
    for ( int i = 0 ;
    i < pairs . length ;
    i ++ ) {
      int a = pairs [ i ] ;
      int b = pairs [ i ] ;
      int aDash = a + total ;
      int mod = aDash % b ;
      if ( mod > 0 ) {
        total += b - mod ;
      }
    }
    System . out . println ( total ) ;
    return total ;
  }
  