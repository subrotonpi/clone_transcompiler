public static long solve ( long A , long loop ) {
  long result = 1 ;
  long temp = A ;
  String [ ] binloop = new String [ Integer . toBinaryString ( Integer . toBinaryString ( loop ) ) . length ( ) ] ;
  for ( int i = 0 ;
  i < binloop . length ;
  i ++ ) {
    if ( binloop [ i ] . equals ( "1" ) ) {
      result = ( result * temp ) % 1000000007 ;
    }
    temp = temp * temp % 1000000007 ;
  }
  return result ;
}
