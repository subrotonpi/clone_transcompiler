public static int n ( ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] s = new int [ n ] ;
  for ( int i = 0 ;
  i < s . length ;
  i ++ ) {
    s [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int ave = Arrays . stream ( s ) . mapToInt ( i -> i ) . sum ( ) / n ;
  int maxS = max ( s ) ;
  int minS = min ( s ) ;
  if ( maxS - minS != 0 ) {
    int p1 = b / ( maxS - minS ) , p2 = - b / ( maxS - minS ) ;
    int q1 = a - p1 * ave , q2 = a - p2 * ave ;
    System . out . println ( p1 + " " + q1 ) ;
  }
  else {
    if ( b != 0 ) {
      System . out . println ( - 1 ) ;
    }
    else {
      System . out . println ( 0 + " " + a ) ;
    }
  }
  return a ;
}
