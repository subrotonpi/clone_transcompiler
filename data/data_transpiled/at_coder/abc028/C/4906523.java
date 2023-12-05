public static List < Integer > convert ( String input ) {
  List < Integer > a = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < 2 * 5 ;
  i ++ ) {
    if ( Integer . toBinaryString ( i ) . indexOf ( '1' ) != 3 ) {
      continue ;
    }
    int tmp = 0 ;
    for ( int j = 0 ;
    j < 5 ;
    j ++ ) {
      if ( ( ( i > j ) & 1 ) == 1 ) {
        tmp += a . get ( j ) ;
      }
    }
    l . add ( tmp ) ;
  }
  return l ;
}
