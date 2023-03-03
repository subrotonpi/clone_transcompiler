public static void print ( String a , String b ) {
  int ab = Integer . parseInt ( input ( ) . split ( " " ) [ 0 ] ) ;
  List < Integer > hei = new ArrayList < > ( ) ;
  for ( int i = 1 ;
  i <= 1000 ;
  i ++ ) hei . add ( i * i ) ;
  System . out . println ( ab == hei . contains ( ab ) ? "Yes" : "No" ) ;
}
