public static int T = Integer . parseInt ( Scanner in ) {
  for ( int X = 1 ;
  X <= T ;
  X ++ ) {
    int n = in . nextInt ( ) ;
    List < Integer > v1 = new ArrayList < Integer > ( ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) v1 . add ( in . nextInt ( ) ) ;
    List < Integer > v2 = new ArrayList < Integer > ( ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) v2 . add ( in . nextInt ( ) ) ;
    int Y = 0 ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) Y += v1 . get ( i ) * v2 . get ( i ) ;
    System . out . println ( "Case #" + X + ":" + Y ) ;
  }
  return X ;
}
