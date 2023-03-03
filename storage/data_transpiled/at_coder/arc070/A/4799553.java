public static int X = Integer . parseInt ( input ) {
  int sumTime = 0 ;
  for ( int i = 0 ;
  i < X ;
  i ++ ) {
    sumTime += ( i + 1 ) ;
    if ( sumTime >= X ) {
      System . out . println ( i + 1 ) ;
      break ;
    }
  }
  return sumTime ;
}
