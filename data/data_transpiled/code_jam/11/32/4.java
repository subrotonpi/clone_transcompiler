@ org . junit . runners . Parameterized . Parameters public static int [ ] getDoubleArray ( ) {
  final int [ ] result = new int [ 3 ] ;
  final Scanner scanner = new Scanner ( System . in ) ;
  int boosters = scanner . nextInt ( ) ;
  final int ready = scanner . nextInt ( ) ;
  final int stars = scanner . nextInt ( ) ;
  final int [ ] dist = new int [ 4 ] ;
  for ( int i = 0 ;
  i < 4 ;
  i ++ ) {
    dist [ i ] = Integer . parseInt ( scanner . nextLine ( ) . substring ( i , i + 1 ) ) ;
  }
  Arrays . sort ( dist ) ;
  Arrays . sort ( dist ) ;
  result = 0 ;
  int timer = 0 ;
  int i = 0 ;
  while ( timer < ready ) {
    if ( ready - timer < dist [ i ] * 2 ) {
      dist [ i ] -= ( ready - timer ) / 2 ;
      timer = ready ;
    }
    else {
      timer += dist [ i ] * 2 ;
      i ++ ;
      if ( i == stars ) return timer ;
    }
  }
  final int [ ] sorted = new int [ boosters ] ;
  for ( i = 0 ;
  i < boosters ;
  i ++ ) {
    sorted [ i ] = sorted [ i ] ;
  }
  for ( i = boosters ;
  i < dist . length ;
  i ++ ) {
    sorted [ i ] *= 2 ;
  }
  timer += Arrays . copyOf ( sorted , dist . length ) ;
  return result ;
}
