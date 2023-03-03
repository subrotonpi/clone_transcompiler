public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  int [ ] [ ] maps = new int [ n ] [ m ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int a = Integer . parseInt ( input ) ;
    int b = Integer . parseInt ( input ) ;
    a = a - 1 ;
    b = b - 1 ;
    maps [ a ] [ b ] = b ;
    maps [ b ] [ a ] = a ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int [ ] frends = maps [ i ] ;
    HashSet < Integer > J = new HashSet < Integer > ( ) ;
    for ( int j = 0 ;
    j < frends . length ;
    j ++ ) {
      int [ ] frendss = maps [ j ] ;
      for ( int k = 0 ;
      k < frendss . length ;
      k ++ ) {
        if ( ! frends [ k ] == frendss [ k ] ) {
          J . add ( frendss [ k ] ) ;
        }
      }
    }
    try {
      J . remove ( i ) ;
    }
    catch ( Exception e ) {
    }
    System . out . println ( J . size ( ) ) ;
  }
}
