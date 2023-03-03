@ org . python . Method ( __doc__ = "" ) public static org . python . Object raw_input ( ) {
  final int T = Integer . parseInt ( raw_input ( ) ) ;
  for ( int i = 1 ;
  i <= T ;
  i ++ ) {
    System . out . print ( "Case #" + i + ":" ) ;
    final int n = Integer . parseInt ( raw_input ( ) ) ;
    final int [ ] p = new int [ n ] ;
    for ( int x = 0 ;
    x < n ;
    x ++ ) p [ x ] = Integer . parseInt ( raw_input ( ) ) ;
    while ( true ) {
      final int [ ] pp = new int [ n ] ;
      for ( int x = 0 ;
      x < p . length ;
      x ++ ) if ( p [ x ] != 0 ) break ;
      if ( pp . length == 2 && p [ pp [ 0 ] ] == p [ pp [ 1 ] ] ) {
        System . out . print ( " " ) ;
        System . out . print ( string . uppercase ( pp [ 0 ] ) ) ;
        System . out . print ( string . uppercase ( pp [ 1 ] ) ) ;
        p [ pp [ 0 ] ] -- ;
        p [ pp [ 1 ] ] -- ;
      }
      else {
        final int q = Arrays . binarySearch ( p , 0 , n , 1 ) ;
        System . out . print ( " " ) ;
        System . out . print ( string . uppercase ( q ) ) ;
        p [ q ] -- ;
      }
    }
    System . out . println ( "" ) ;
  }
  return new org . python . Object ( ) {
    public int run ( ) {
      return Integer . parseInt ( raw_input ( ) ) ;
    }
  }
  ;
}
