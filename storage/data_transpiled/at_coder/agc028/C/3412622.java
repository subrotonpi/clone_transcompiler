public static int [ ] [ ] [ ] x ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] [ ] x = new int [ n ] [ 2 ] [ 2 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int ai = Integer . parseInt ( input . nextLine ( ) ) ;
    int bi = Integer . parseInt ( input . nextLine ( ) ) ;
    x [ i ] [ 0 ] = i ;
    x [ i ] [ 1 ] = ai ;
    x [ i ] [ 2 ] = 0 ;
  }
  int s1 = Arrays . stream ( x [ 2 * i ] ) . mapToInt ( x [ 2 * i ] [ 1 ] ) . sum ( ) ;
  int s2 = Arrays . stream ( x [ 2 * i + 1 ] ) . mapToInt ( x [ 2 * i ] [ 1 ] ) . sum ( ) ;
  Arrays . sort ( x , new Comparator < Integer > ( ) {
    @ Override public int compare ( Integer o1 , Integer o2 ) {
      return o2 - o1 ;
    }
  }
  ) ;
  int s3 = Arrays . stream ( x [ 2 * i ] ) . mapToInt ( x [ i ] [ 1 ] ) . sum ( ) ;
  if ( new HashSet < Integer > ( Arrays . asList ( x [ n ] ) ) . size ( ) != n ) {
    System . out . println ( Math . min ( s1 , s2 , s3 ) ) ;
  }
  else {
    int s4 ;
    if ( x [ n - 1 ] [ 0 ] == x [ n ] [ 0 ] ) {
      s4 = Math . min ( s3 - x [ n - 1 ] [ 1 ] + x [ n + 1 ] [ 1 ] , s3 - x [ n - 2 ] [ 1 ] + x [ n ] [ 1 ] ) ;
    }
    else {
      s4 = s3 - x [ n - 1 ] [ 1 ] + x [ n ] [ 1 ] ;
    }
    System . out . println ( Math . min ( s1 , s2 , s4 ) ) ;
  }
  return x ;
}
