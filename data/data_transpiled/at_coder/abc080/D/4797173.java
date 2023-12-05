public static int n ( ) {
  int c = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > stc = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) stc . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  Collections . sort ( stc ) ;
  int [ ] [ ] R = new int [ 3 ] [ ] ;
  R [ 0 ] [ 0 ] = stc . get ( 0 ) [ 1 ] ;
  for ( int i = 1 ;
  i < stc . size ( ) ;
  i ++ ) {
    int s = stc . get ( i ) ;
    int t = stc . get ( i ) [ 0 ] ;
    c = stc . get ( i ) [ 1 ] ;
    for ( int j = 0 ;
    j < R . length ;
    j ++ ) {
      int tr = R [ j ] [ 0 ] ;
      int cr = R [ j ] [ 1 ] ;
      if ( c == cr && tr <= s ) {
        R [ j ] [ 0 ] = t ;
        break ;
      }
      if ( c != cr && tr < s ) {
        R [ j ] [ 1 ] = t ;
        break ;
      }
    }
  }
  System . out . println ( R . length ) ;
  return R . length ;
}
