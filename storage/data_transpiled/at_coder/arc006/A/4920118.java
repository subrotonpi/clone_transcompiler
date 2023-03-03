public static List < Integer > parse ( String input ) {
  List < Integer > el = new LinkedList < Integer > ( ) ;
  for ( int i = 0 ;
  i < input . length ( ) ;
  i ++ ) {
    el . add ( i ) ;
  }
  int b = Integer . parseInt ( input . substring ( 0 , b ) ) ;
  List < Integer > ll = new LinkedList < Integer > ( ) ;
  for ( int i = 0 ;
  i < input . length ( ) ;
  i ++ ) {
    ll . add ( i ) ;
  }
  int c = 0 ;
  int nom = - 1 ;
  for ( int i = 0 ;
  i < ll . size ( ) ;
  i ++ ) {
    if ( el . indexOf ( ll . get ( i ) ) > 0 ) {
      c ++ ;
    }
    else {
      nom = ll . get ( i ) ;
    }
  }
  switch ( c ) {
    case 5 : if ( nom == b ) {
      System . out . println ( 2 ) ;
      exit ( ) ;
    }
    else {
      System . out . println ( 3 ) ;
      exit ( ) ;
    }
    break ;
    case 6 : System . out . println ( 1 ) ;
    exit ( ) ;
    break ;
    case 4 : System . out . println ( 4 ) ;
    exit ( ) ;
    break ;
    case 3 : System . out . println ( 5 ) ;
    exit ( ) ;
    break ;
    default : System . out . println ( 0 ) ;
    break ;
  }
  return ll ;
}
