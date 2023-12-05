@ Sys public static int from ( ) {
  String input = System . getProperty ( "input" ) ;
  List < Integer > E = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < input . length ( ) ;
  i ++ ) {
    E . add ( Integer . valueOf ( input . charAt ( i ) ) ) ;
  }
  int b = Integer . valueOf ( input . charAt ( 0 ) ) ;
  List < Integer > L = Lists . newArrayList ( ) ;
  return b ;
}
