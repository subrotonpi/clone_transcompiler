public static final void main ( String input ) {
  if ( input . equals ( "" ) ) {
    int Q = Integer . parseInt ( input ) ;
    for ( int i = 0 ;
    i < Q ;
    i ++ ) {
      int a = Integer . parseInt ( input ) ;
      int b = Integer . parseInt ( input ) ;
      int big = Math . max ( a , b ) ;
      int small = Math . min ( a , b ) ;
      int c = Math . floor ( Math . sqrt ( a * b ) ) ;
      if ( c * c == a * b ) c -- ;
      if ( big == small ) System . out . println ( 2 * big - 2 ) ;
      else if ( big == small + 1 ) System . out . println ( 2 * small - 2 ) ;
      else if ( c * ( c + 1 ) >= a * b ) System . out . println ( 2 * c - 2 ) ;
      else System . out . println ( 2 * c - 1 ) ;
    }
  }
}
