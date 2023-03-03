@ VisibleForTesting static Iterable < String > combinations ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] b = new int [ N ] [ M ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) b [ i ] [ 0 ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] d = {
    0 , 1 , 0 , - 1 , 0 }
    ;
    String [ ] [ ] a = new String [ N ] [ M ] ;
    for ( int i = 0 , j = 0 ;
    i < N ;
    i ++ , j ++ ) {
      int m = 10 ;
      for ( int dx = d . length - 1 , dy = d . length - 1 ;
      dx >= 0 ;
      dx -- , dy -- ) {
        int x = i + dx ;
        int y = j + dy ;
        m = Math . min ( m , b [ x ] [ y ] ) ;
      }
      for ( int dx = d . length - 1 , dy = d . length - 1 ;
      dx >= 0 ;
      dx -- , dy -- ) {
        int x = i + dx ;
        int y = j + dy ;
        b [ x ] [ y ] -= m ;
      }
      a [ i ] [ j ] = String . valueOf ( m ) ;
    }
    for ( String [ ] array : a ) {
      System . out . println ( Arrays . toString ( array ) ) ;
    }
    return Arrays . asList ( a ) ;
  }
  