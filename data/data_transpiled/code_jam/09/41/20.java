public static void main ( String [ ] args ) {
  final Scanner scanner = new Scanner ( System . in ) ;
  final int t = scanner . nextInt ( ) ;
  for ( int x = 1 ;
  x <= t ;
  x ++ ) {
    final int n = scanner . nextInt ( ) ;
    final int [ ] tab = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      final String line = scanner . nextLine ( ) ;
      for ( int nr = 0 ;
      nr < Collections . frequency ( line , nr ) ;
      nr ++ ) {
        if ( line . equals ( "1" ) ) {
          tab [ i ] = nr ;
        }
      }
    }
    int ret = 0 ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      for ( int j = i ;
      j < n ;
      j ++ ) {
        if ( tab [ j ] <= i ) {
          final int a = tab [ j ] ;
          tab [ j ] -- ;
          tab [ j ] = a ;
          ret += j - i ;
          break ;
        }
      }
    }
    System . out . println ( "Case #" + x + ": " + ret ) ;
  }
}
