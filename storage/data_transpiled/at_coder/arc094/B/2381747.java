public static int [ ] [ ] getPairs ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] arr = new int [ n ] [ 2 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    arr [ i ] = new int [ 2 ] ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      arr [ i ] [ j ] = Integer . parseInt ( input . nextLine ( ) ) ;
    }
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int [ ] pair = arr [ i ] ;
    int a = pair [ 0 ] ;
    int b = pair [ 1 ] ;
    int t = a * b ;
    int s = ( int ) ( t * 0.5 ) ;
    if ( t < 3 ) {
      System . out . println ( 0 ) ;
    }
    else if ( a == b ) {
      if ( ( a - 1 ) * ( b + 1 ) < t ) {
        System . out . println ( ( a - 1 ) * 2 ) ;
      }
      else {
        System . out . println ( ( a - 1 ) * 2 - 1 ) ;
      }
    }
    else if ( s * s == t ) {
      System . out . println ( ( s - 1 ) * 2 - 1 ) ;
    }
    else if ( s * ( s + 1 ) < t ) {
      System . out . println ( s * 2 - 1 ) ;
    }
    else {
      System . out . println ( ( s - 1 ) * 2 ) ;
    }
  }
  return arr ;
}
