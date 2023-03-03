public static void print ( ) {
  try {
    final Scanner in = new Scanner ( System . in ) ;
    final int C = in . nextInt ( ) ;
    final int D = in . nextInt ( ) ;
    final double [ ] [ ] tab = new double [ C ] [ C ] ;
    in . nextLine ( ) ;
    final int [ ] [ ] readIntArray = new int [ C ] [ C ] ;
    in . nextLine ( ) ;
    final int [ ] [ ] readIntArray = new int [ C ] [ C ] ;
    in . nextLine ( ) ;
    final double time = D ;
    for ( int i = 0 ;
    i < C ;
    i ++ ) {
      tot = Arrays . stream ( readIntArray ) . mapToDouble ( x -> x [ 1 ] ) . sum ( ) ;
    }
    final double dis = s [ C ] [ C ] - s [ 0 ] [ 0 ] ;
    for ( int i = 0 ;
    i < D ;
    i ++ ) {
      dis = ( D * ( tot - 1 ) - dis ) / 2.0 ;
    }
    for ( int test = 0 ;
    test < C ;
    test ++ ) {
      C = in . nextInt ( ) ;
      D = in . nextInt ( ) ;
      tab [ i ] = readIntArray [ C ] ;
    }
    Arrays . sort ( tab ) ;
    double t = max ( Arrays . stream ( tab ) . mapToDouble ( a -> time ( D , tab , a , b ) ) . sum ( ) , t ) ;
    System . out . println ( "Case #" + ( test + 1 ) + ":" + t ) ;
  }
  catch ( Exception e ) {
    e . printStackTrace ( ) ;
  }
}
