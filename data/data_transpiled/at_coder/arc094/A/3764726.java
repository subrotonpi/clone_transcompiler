public static void main ( String [ ] args ) {
  int A = Integer . parseInt ( input [ 0 ] ) ;
  int B = Integer . parseInt ( input [ 1 ] ) ;
  int C = Integer . parseInt ( input [ 2 ] ) ;
  int ret = 0 ;
  int m = A % 2 + B % 2 + C % 2 ;
  if ( m == 3 || m == 0 ) {
  }
  else {
    ret ++ ;
    if ( m == 2 ) {
      if ( A % 2 == 0 ) {
        B ++ ;
        C ++ ;
      }
      else if ( B % 2 == 0 ) {
        A ++ ;
        C ++ ;
      }
      else {
        A ++ ;
        B ++ ;
      }
    }
  }
  System . out . println ( ret + ( C - B ) / 2 + ( C - A ) / 2 ) ;
}
