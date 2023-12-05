public static String [ ] [ ] getATCOS ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  String [ ] [ ] s = new String [ n ] [ ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    s [ i ] = new String [ ] {
      input . nextLine ( ) }
      ;
    }
    int m = 0 ;
    String name = "atcoder" ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      m += Integer . parseInt ( s [ j ] [ 1 ] ) ;
    }
    for ( int k = 0 ;
    k < n ;
    k ++ ) {
      if ( Integer . parseInt ( s [ k ] [ 1 ] ) > m / 2 ) {
        name = s [ k ] [ 0 ] ;
      }
    }
    System . out . println ( name ) ;
    return s ;
  }
  