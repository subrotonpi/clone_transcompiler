public static String [ ] [ ] getStrings ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  String [ ] [ ] s = new String [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    s [ i ] = new String [ n ] ;
  }
  String [ ] [ ] ns = new String [ n ] [ n ] ;
  for ( int k = 0 ;
  k < n ;
  k ++ ) {
    for ( int j = 0 ;
    j <= n ;
    j ++ ) {
      ns [ j ] [ k ] = s [ j ] [ k ] ;
    }
  }
  for ( int m = 0 ;
  m < n ;
  m ++ ) {
    System . out . println ( Arrays . toString ( ns , n * m ) ) ;
  }
  return ns ;
}
