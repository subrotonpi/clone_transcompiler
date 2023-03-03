public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  List < Integer > t = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    t . add ( Integer . parseInt ( input ) ) ;
  }
  int m = Integer . parseInt ( input ) ;
  int [ ] [ ] px = new int [ m ] [ n ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int p = Integer . parseInt ( input ) ;
    int x = Integer . parseInt ( input ) ;
    px [ i ] [ 0 ] = p ;
    px [ i ] [ 1 ] = x ;
  }
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int time = 0 ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( j + 1 == px [ i ] [ 0 ] ) {
        time += px [ i ] [ 1 ] ;
      }
      else {
        time += t . get ( j ) ;
      }
    }
    System . out . println ( time ) ;
  }
}
