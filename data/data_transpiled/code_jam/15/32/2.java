public static int maximunBananas ( String key , String target , int length ) {
  if ( length < target . length ( ) ) {
    return 0 ;
  }
  HashMap < String , Integer > map = new HashMap < String , Integer > ( ) ;
  for ( int i = 0 ;
  i < key . length ( ) ;
  i ++ ) {
    if ( map . containsKey ( key . charAt ( i ) ) ) {
      map . put ( key . charAt ( i ) , ++ i ) ;
    }
    else {
      map . put ( key . charAt ( i ) , 1 ) ;
    }
  }
  for ( int i = 0 ;
  i < target . length ( ) ;
  i ++ ) {
    if ( ! map . containsKey ( target . charAt ( i ) ) ) {
      return 0 ;
    }
  }
  int advanced = target . length ( ) ;
  for ( int i = 0 ;
  i < target . length ( ) - 1 ;
  i ++ ) {
    if ( target . substring ( 0 , i + 1 ) . equals ( target . substring ( target . length ( ) - i - 1 ) ) ) advanced = target . length ( ) - i - 1 ;
  }
  return 1 + ( int ) ( ( length - target . length ( ) ) / advanced ) ;
}
private static int expectedBananas ( String key , String target , int length ) {
  HashMap < String , Integer > map = new HashMap < String , Integer > ( ) ;
  for ( int i = 0 ;
  i < key . length ( ) ;
  i ++ ) {
    if ( map . containsKey ( key . charAt ( i ) ) ) {
      map . put ( key . charAt ( i ) , ++ i ) ;
    }
    else {
      map . put ( key . charAt ( i ) , 1 ) ;
    }
  }
  int prob = 1 ;
  for ( int i = 0 ;
  i < target . length ( ) ;
  i ++ ) {
    if ( map . containsKey ( target . charAt ( i ) ) ) {
      prob *= map . get ( target . charAt ( i ) ) / key . length ( ) ;
    }
    else {
      return 0 ;
    }
  }
  return prob * ( length - target . length ( ) + 1 ) ;
}
