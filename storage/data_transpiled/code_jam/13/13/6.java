public static String find ( int [ ] a ) {
  for ( int i : xrange ( 2 , 6 ) ) {
    for ( int j : xrange ( 2 , 6 ) ) {
      for ( int k : xrange ( 2 , 6 ) ) {
        Set < Integer > products = new HashSet < Integer > ( ) ;
        products . add ( 1 ) ;
        products . add ( i ) ;
        products . add ( j ) ;
        products . add ( k ) ;
        products . add ( i * j ) ;
        products . add ( i * k ) ;
        products . add ( j * k ) ;
        products . add ( i * j * k ) ;
        for ( int x : a ) {
          if ( ! products . contains ( x ) ) break ;
          else return i + "" + j + "" + k ;
        }
      }
    }
  }
  return "222" ;
}
