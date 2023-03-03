public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int Y = Integer . parseInt ( input ) ;
  boolean flg = false ;
  for ( int f = 0 ;
  f < N + 1 ;
  f ++ ) {
    for ( int h = 0 ;
    h < N + 1 - f ;
    h ++ ) {
      if ( f * 10000 + h * 5000 + ( N - f - h ) * 1000 == Y && N - f - h >= 0 ) {
        System . out . println ( f + " " + h + " " + ( N - f - h ) ) ;
        flg = true ;
        break ;
      }
    }
    if ( flg == true ) {
      break ;
    }
  }
  if ( flg == false ) {
    System . out . println ( "-1 -1 -1" ) ;
  }
}
