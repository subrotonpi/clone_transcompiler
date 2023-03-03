public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  List < Integer > kushi = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    kushi . add ( Math . min ( kushi . get ( 2 * i ) , kushi . get ( 2 * i + 1 ) ) ) ;
  }
  System . out . println ( Arrays . toString ( setkushi ) ) ;
}
