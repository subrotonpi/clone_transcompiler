public static void main ( String input ) {
  int h = Integer . parseInt ( input . substring ( 0 , input . length ( ) ) ) ;
  int w = Integer . parseInt ( input . substring ( input . length ( ) , input . length ( ) ) ) ;
  int [ ] num = new int [ h ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    String a = input . substring ( input . length ( ) , input . length ( ) ) ;
    for ( int j = 0 ;
    j < w ;
    j ++ ) {
      if ( a . charAt ( j ) == '#' ) num [ j ] = j + 1 ;
    }
  }
  for ( int j = 0 ;
  j < num . length - 1 ;
  j ++ ) {
    if ( num [ j ] == num [ j ] || num [ j ] + 1 == num [ j ] ) continue ;
    else {
      System . out . println ( "Impossible" ) ;
      exit ( ) ;
    }
  }
  System . out . println ( "Possible" ) ;
}
