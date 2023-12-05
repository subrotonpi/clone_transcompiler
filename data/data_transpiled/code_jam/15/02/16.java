public static int T = Integer . parseInt ( input ) {
  for ( int t = 1 ;
  t <= T ;
  t ++ ) {
    int D = Integer . parseInt ( input . nextLine ( ) ) ;
    int [ ] P = new int [ D ] ;
    for ( String s : input . nextLine ( ) . split ( " " ) ) {
      P [ 0 ] = Integer . parseInt ( s ) ;
    }
    int best = Math . min ( zeru + Arrays . stream ( P ) . mapToInt ( zeru -> zeru ) . sum ( ) , zeru ) ;
    System . out . println ( "Case #" + t + ": " + best ) ;
  }
  return T ;
}
