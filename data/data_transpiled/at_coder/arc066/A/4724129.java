public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int [ ] mp = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    mp [ i ] = 0 ;
  }
  for ( String a : input . split ( " " ) ) {
    mp [ Integer . parseInt ( a ) ] ++ ;
  }
  boolean res = true ;
  if ( N % 2 == 1 ) {
    for ( int i = 2 ;
    i < N ;
    i += 2 ) {
      if ( mp [ i ] != 2 ) {
        res = false ;
      }
    }
    if ( mp [ 0 ] != 1 ) {
      res = false ;
    }
  }
  else {
    for ( int i = 1 ;
    i < N ;
    i += 2 ) {
      if ( mp [ i ] != 2 ) {
        res = false ;
      }
    }
  }
  if ( res ) {
    System . out . println ( Math . pow ( 2 , N / 2 , 10 * 9 + 7 ) ) ;
  }
  else {
    System . out . println ( 0 ) ;
  }
}
