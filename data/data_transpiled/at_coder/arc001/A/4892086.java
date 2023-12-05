@ Sys public static int from ( ) {
  N = in . nextInt ( ) ;
  c = in . nextInt ( ) ;
  count = new int [ N ] ;
  count [ 0 ] = c . count ( "1" ) ;
  count [ 1 ] = c . count ( "2" ) ;
  count [ 2 ] = c . count ( "3" ) ;
  return count [ 3 ] ;
}
