public static void input ( ) {
  String s = input . nextLine ( ) ;
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  char [ ] p = new char [ 26 ] ;
  for ( int i = 0 ;
  i < 26 ;
  i ++ ) {
    p [ i ] = ( char ) ( 'a' + i ) ;
  }
  List < String > l = new ArrayList < String > ( ) ;
  for ( int i = 0 ;
  i < 26 ;
  i ++ ) {
    if ( s . contains ( p [ i ] ) ) {
      int [ ] h = new int [ s . length ( ) ] ;
      for ( int j = 0 ;
      j < h . length ;
      j ++ ) {
        h [ j ] = j ;
      }
      for ( int t = 0 ;
      t < h . length ;
      t ++ ) {
        for ( int d = 0 ;
        d < 5 ;
        d ++ ) {
          if ( h [ t ] + d > s . length ( ) - 1 ) {
            break ;
          }
          else {
            l . add ( s . substring ( h [ t ] , h [ t ] + d + 1 ) ) ;
          }
        }
      }
    }
    else {
      int size = l . size ( ) ;
      if ( size >= k ) {
        Collections . sort ( l ) ;
        System . out . println ( l . get ( k - 1 ) ) ;
        break ;
      }
    }
  }
}
