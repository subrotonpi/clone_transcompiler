public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int a = Integer . parseInt ( input ) ;
  int b = Integer . parseInt ( input ) ;
  int [ ] S = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    S [ i ] = Integer . parseInt ( input ) ;
  }
  Arrays . sort ( S ) ;
  int ave = Arrays . stream ( S ) . mapToInt ( i -> i ) . sum ( ) / n ;
  int d = S [ S . length - 1 ] - S [ 0 ] ;
  if ( d == 0 ) {
    if ( b != d ) {
      System . out . println ( - 1 ) ;
    }
    else {
      System . out . println ( 1 + " " + ( a - ave ) ) ;
    }
  }
  else {
    int p = b / d ;
    System . out . println ( p + " " + ( a - p * ave ) ) ;
  }
}
