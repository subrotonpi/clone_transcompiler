public static void main ( String input ) {
  int H = Integer . parseInt ( input . split ( " " ) [ 0 ] ) ;
  int W = Integer . parseInt ( input . split ( " " ) [ 1 ] ) ;
  List < String > A = new ArrayList < String > ( ) ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    A . add ( new String ( input . split ( " " ) [ 0 ] ) ) ;
  }
  int a = 0 ;
  for ( int h = 0 ;
  h < H ;
  h ++ ) {
    for ( int w = 0 ;
    w < W ;
    w ++ ) {
      if ( A . get ( h ) . charAt ( w ) == '#' ) {
        a ++ ;
      }
    }
  }
  int h = 0 ;
  int w = 0 ;
  int d = 0 ;
  boolean fh = false ;
  boolean fw = false ;
  do {
    if ( h == H - 1 && w == W - 1 ) break ;
    if ( h == H - 1 ) fh = true ;
    if ( w == W - 1 ) fw = true ;
    if ( h < H - 1 ) {
      if ( A . get ( h + 1 ) . charAt ( w ) == '#' ) {
        h ++ ;
        d ++ ;
      }
      else if ( fw ) break ;
    }
    if ( w < W - 1 ) {
      if ( A . get ( h ) . charAt ( w + 1 ) == '#' ) {
        w ++ ;
        d ++ ;
      }
      else if ( fh ) break ;
    }
  }
  while ( fh ) ;
  if ( a == d + 1 ) System . out . println ( "Possible" ) ;
  else System . out . println ( "Impossible" ) ;
}
