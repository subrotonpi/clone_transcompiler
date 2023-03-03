public static void print ( String input ) {
  int N = Integer . parseInt ( input ) ;
  String [ ] L = input . split ( " " ) ;
  int [ ] L_num = new int [ L . length ] ;
  for ( int i = 0 ;
  i < L_num . length ;
  i ++ ) {
    L_num [ i ] = Integer . parseInt ( L [ i ] ) ;
  }
  Arrays . sort ( L_num ) ;
  int total = 0 ;
  for ( int j = 0 ;
  j < L . length - 1 ;
  j ++ ) {
    total += L_num [ j ] ;
  }
  if ( total <= L_num [ N - 1 ] ) {
    System . out . println ( "No" ) ;
  }
  else {
    System . out . println ( "Yes" ) ;
  }
}
