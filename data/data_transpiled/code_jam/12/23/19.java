public static int tc = Integer . parseInt ( scanner . nextLine ( ) ) {
  int t = scanner . nextInt ( ) ;
  int s ;
  int [ ] p = new int [ n ] ;
  for ( t = 1 ;
  t <= tc ;
  t ++ ) {
    p = scanner . nextLine ( ) . split ( " " ) ;
    n = Integer . parseInt ( p [ 0 ] ) ;
    p = ArrayUtil . parseInt ( p [ 1 ] ) ;
    Map < String , Integer > map = Maps . newHashMap ( ) ;
    System . out . println ( "Case #" + t + ":" ) ;
    for ( int i = 0 ;
    i < 2 * n ;
    i ++ ) {
      s = fil_sum ( i , p ) ;
      if ( map . containsKey ( s ) ) {
        System . out . println ( Arrays . toString ( p ) ) ;
        System . out . println ( Arrays . toString ( p ) ) ;
        break ;
      }
      map . put ( s , i ) ;
    }
    else {
      System . out . println ( "Impossible" ) ;
    }
  }
  return t ;
}
