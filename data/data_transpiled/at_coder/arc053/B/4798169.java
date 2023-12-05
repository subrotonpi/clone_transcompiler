public static void input ( Scanner in ) {
  int [ ] s = in . nextInt ( ) ;
  HashMap < Integer , Integer > memo = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( ! s [ i ] ) {
      memo . put ( s [ i ] , 1 ) ;
    }
    else {
      memo . put ( s [ i ] , 1 ) ;
    }
  }
  int cnOdd = 0 ;
  int cnEven = 0 ;
  for ( int i = 0 ;
  i < memo . size ( ) ;
  i ++ ) {
    if ( memo . get ( i ) % 2 == 1 ) {
      cnOdd ++ ;
    }
    cnEven += memo . get ( i ) / 2 ;
  }
  if ( cnOdd == 0 ) {
    System . out . println ( cnEven * 2 ) ;
  }
  else {
    System . out . println ( 2 * ( cnEven / cnOdd ) + 1 ) ;
  }
}
