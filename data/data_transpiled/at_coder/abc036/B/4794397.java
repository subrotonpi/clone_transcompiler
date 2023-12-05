public static String [ ] [ ] getStrings ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  String [ ] [ ] s = new String [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) s [ i ] = new String [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) s [ i ] [ i ] = new String ( input . nextLine ( ) ) ;
  String [ ] [ ] t = new String [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) t [ i ] [ 0 ] = "-" ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) for ( int j = 0 ;
  j < n ;
  j ++ ) t [ i ] [ j ] = s [ n - j - 1 ] [ i ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) System . out . println ( Arrays . toString ( t [ i ] ) ) ;
  return t ;
}
