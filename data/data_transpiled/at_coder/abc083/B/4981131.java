public static void input ( ) {
  inputs = input . split ( " " ) ;
  N = Integer . parseInt ( inputs [ 0 ] ) ;
  A = Integer . parseInt ( inputs [ 1 ] ) ;
  B = Integer . parseInt ( inputs [ 2 ] ) ;
  List < Integer > nums = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N + 1 ;
  i ++ ) {
    int all = 0 ;
    for ( int j = 0 ;
    j < String . valueOf ( i ) . length ( ) ;
    j ++ ) {
      all += Integer . parseInt ( String . valueOf ( i ) . charAt ( j ) ) ;
    }
    if ( A <= all && all <= B ) {
      nums . add ( i ) ;
    }
  }
  System . out . println ( Arrays . toString ( nums ) ) ;
}
