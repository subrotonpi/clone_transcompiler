@ SafeVarargs public static void main ( String ... args ) {
  int n , a ;
  a = Integer . parseInt ( open ( 0 ) . split ( " " ) [ 0 ] ) ;
  System . out . println ( min ( abs ( cumsum ( a , 0 , n ) ) - cumsum ( [ 0 ] + a , n ) ) ) ;
}
