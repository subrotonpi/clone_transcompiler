static final Scanner scanner = new Scanner ( System . in ) {
  public String next ( ) {
    final Scanner in = new Scanner ( System . in ) ;
    final int num = in . nextInt ( ) ;
    for ( int z = 0 ;
    z < num ;
    z ++ ) {
      String d = in . next ( ) ;
      String n = in . next ( ) ;
      String m = in . next ( ) ;
      d = Double . parseDouble ( d ) ;
      n = Integer . parseInt ( n ) ;
      m = Integer . parseInt ( m ) ;
      final double [ ] [ ] tx = new double [ n ] [ m ] ;
      for ( int i = 0 ;
      i < n ;
      i ++ ) tx [ i ] = Double . parseDouble ( in . next ( ) ) ;
      Arrays . sort ( tx ) ;
      final double [ ] a = Arrays . stream ( tx ) . mapToDouble ( x -> Double . parseDouble ( x ) ) . collect ( ) ;
      final double tf ;
      if ( tx . length > 1 ) {
        tf = tx [ 0 ] [ 0 ] + ( d - tx [ 0 ] [ 1 ] ) * ( tx [ 1 ] [ 0 ] - tx [ 0 ] [ 0 ] ) / ( tx [ 1 ] [ 1 ] - tx [ 0 ] [ 1 ] ) ;
      }
      else {
        tf = 0 ;
      }
      System . out . println ( "Case #" + ( z + 1 ) + ":" ) ;
      for ( final double x : a ) {
        System . out . println ( Math . max ( Math . sqrt ( 2 * d / x ) , tf ) ) ;
      }
      in . close ( ) ;
    }
    return in . next ( ) ;
  }
}
