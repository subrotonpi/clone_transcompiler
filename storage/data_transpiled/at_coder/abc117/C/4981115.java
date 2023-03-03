public static int [ ] getDistance ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) , m = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] x = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    x [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int score = Math . max ( x [ 0 ] , x [ 1 ] ) ;
  Arrays . sort ( x ) ;
  int [ ] dist = new int [ m ] ;
  for ( int i = 1 ;
  i < m ;
  i ++ ) {
    int dif = x [ i ] - x [ i - 1 ] ;
    dist [ i ] = dif ;
  }
  Arrays . sort ( dist ) ;
  if ( n >= m ) {
    score = 0 ;
  }
  else {
    for ( int i = 1 ;
    i < n ;
    i ++ ) {
      int reduce = dist [ n - i ] ;
      score -= reduce ;
    }
  }
  return dist ;
}
