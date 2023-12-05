public static void print ( ) {
  list_o = list ( input ( ) ) ;
  list_e = list ( input ( ) ) + [ "" ] ;
  for ( int a = 0 ;
  a < list_o . length ;
  a ++ ) {
    list_o . append ( a + "" ) ;
  }
  list_e . append ( "" ) ;
}
