public static void input ( ) {
  List < Integer > numbers = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < input . length ( ) ;
  i ++ ) {
    numbers . add ( Integer . valueOf ( i % 2 ) ) ;
  }
  numbers . add ( Integer . valueOf ( i ) ) ;
}
