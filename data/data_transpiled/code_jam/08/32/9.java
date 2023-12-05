public static int ugly ( String numbers , int number , boolean subtracting , int current ) {
  if ( ( numbers . length ( ) == 0 ) && ( isLan ( number + current ) ) ) {
    return 1 ;
  }
  else {
    return 0 ;
  }
  if ( subtracting ) {
    return ugly ( numbers . substring ( 1 ) , number + current , false , Integer . MAX_VALUE ) + ugly ( numbers . substring ( 1 ) , number + current , true , - Integer . MAX_VALUE ) + ugly ( numbers . substring ( 1 ) , number , subtracting , current * 10 - Integer . MAX_VALUE ) ;
  }
  else {
    return ugly ( numbers . substring ( 1 ) , number + current , false , Integer . MAX_VALUE ) + ugly ( numbers . substring ( 1 ) , number + current , true , - Integer . MAX_VALUE ) + ugly ( numbers . substring ( 1 ) , number , subtracting , current * 10 + Integer . MAX_VALUE ) ;
  }
  /* start ugly */
  /* if (number % 2 == 0 || number % 3 == 0 || number % 5 == 0 || number % 7 == 0) {
  return true;
  } else {
  return false;
  }*/
  int N = Integer . parseInt ( scanner . nextLine ( ) ) ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    System . out . println ( "Case #" + i + ": " + startLan ( scanner . nextLine ( ) ) ) ;
  }
  return N ;
}
