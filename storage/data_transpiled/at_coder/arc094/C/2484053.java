public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] a = new int [ n ] , b = new int [ n ] , c = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int [ ] ab = new int [ 2 ] ;
    for ( int j = 0 ;
    j < a . length ;
    j ++ ) {
      ab [ j ] = Integer . parseInt ( input . substring ( i , j + 1 ) ) ;
      a [ i ] = ab [ 0 ] ;
      b [ i ] = ab [ 1 ] ;
      if ( ( ab [ 0 ] > ab [ 1 ] ) && ( ab [ 1 ] > b [ 0 ] ) ) {
        c [ i ] = ab [ 1 ] ;
      }
    }
  }
  if ( ( c . length == 0 ) && ( a [ 0 ] == 0 ) ) {
    System . out . println ( 0 ) ;
  }
  else {
    System . out . println ( Arrays . toString ( a ) - Math . min ( c , a [ 0 ] ) ) ;
  }
}
