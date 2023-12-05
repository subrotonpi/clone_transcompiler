public static int n ( ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > v = new LinkedList < Integer > ( ) ;
  v . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  Collections . sort ( v ) ;
  {
    int c = 1 ;
    int d = 1 ;
    for ( int i = 0 ;
    i < a ;
    i ++ ) {
      c *= ( i + 1 ) ;
      d *= ( b - i ) ;
    }
    return d / c ;
  }
  List < Integer > p = v . subList ( n - a ) ;
  int g = sum ( p ) / a ;
  System . out . println ( sum ( p ) / a ) ;
  int w = 0 ;
  for ( int i = a ;
  i <= b ;
  i ++ ) {
    p = v . subList ( n - i ) ;
    int h = sum ( p ) / i ;
    if ( h < g ) {
      break ;
    }
    else {
      int q = p . get ( 0 ) ;
      int d = v . stream ( ) . mapToInt ( q ) . sum ( ) ;
      int e = p . stream ( ) . mapToInt ( q ) . sum ( ) ;
      w += e * d ;
    }
  }
  System . out . println ( w ) ;
}
