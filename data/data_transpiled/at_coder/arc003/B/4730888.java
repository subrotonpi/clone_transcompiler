public static String [ ] [ ] S ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  String [ ] [ ] S = new String [ n ] [ ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    String s = input . nextLine ( ) ;
    String rev = s . substring ( 0 , s . length ( ) - 1 ) ;
    S [ i ] = new String [ ] {
      rev , s }
      ;
    }
    Arrays . sort ( S ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      System . out . println ( S [ i ] [ 1 ] ) ;
    }
    return S ;
  }
  