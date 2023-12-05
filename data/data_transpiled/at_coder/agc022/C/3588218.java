public static boolean isPrime ( int n ) {
  int [ ] a = new int [ n ] ;
  int [ ] b = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] x = new int [ n ] , ans = 0 ;
  {
    int [ ] q = new int [ m ] ;
    for ( int i = 0 ;
    i < m ;
    i ++ ) q [ i ] = i + 1 ;
    boolean [ ] [ ] c = new boolean [ 51 ] [ 51 ] ;
    for ( int i = 0 ;
    i < 51 ;
    i ++ ) c [ i ] [ i ] = false ;
    for ( int i = 0 ;
    i < q . length ;
    i ++ ) for ( int j = i ;
    j < 51 ;
    j ++ ) c [ j ] [ j % i ] = false ;
    for ( int k = 0 ;
    k < 51 ;
    k ++ ) for ( int i = 0 ;
    i < q . length ;
    i ++ ) for ( int j = 0 ;
    j < 51 ;
    j ++ ) c [ i ] [ j ] *= ( boolean ) ( c [ i ] [ k ] + c [ k ] [ j ] ) ;
  }
  if ( n == 50 ) System . out . println ( - 1 ) ;
  else {
    for ( int i = 49 ;
    i >= 0 ;
    i -- ) if ( isPrime ( i ) ) x [ i ] = i + 1 ;
    for ( int i = 0 ;
    i < x . length ;
    i ++ ) ans += 2 * x [ i ] ;
    System . out . println ( ans ) ;
  }
  return true ;
}
