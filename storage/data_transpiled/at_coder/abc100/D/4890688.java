public static int n ( ) {
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  String [ ] k = {
    "+" , "-" }
    ;
    Integer [ ] [ ] d = new Integer [ 8 ] [ 8 ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      String a = Integer . parseInt ( input . nextLine ( ) ) ;
      String b = Integer . parseInt ( input . nextLine ( ) ) ;
      String c = Integer . parseInt ( input . nextLine ( ) ) ;
      for ( int j = 0 ;
      j < 2 ;
      j ++ ) {
        for ( int h = 0 ;
        h < 2 ;
        h ++ ) {
          for ( int p = 0 ;
          p < 2 ;
          p ++ ) {
            int s = 4 * j + 2 * h + p ;
            d [ s ] [ p ] = new Integer ( k [ j ] + a + k [ h ] + b + k [ p ] + c ) ;
          }
        }
      }
    }
    int h = 0 ;
    for ( int i = 0 ;
    i < 8 ;
    i ++ ) {
      h = Math . max ( h , Arrays . stream ( d [ i ] ) . skip ( n - m ) . sum ( ) ) ;
    }
    System . out . println ( h ) ;
    return h ;
  }
  