public static void initialize ( ) {
}
{
  int r = read ( ) ;
  int c = read ( ) ;
  int ans = 0 ;
  char [ ] [ ] grid = new char [ r ] [ c ] ;
  int [ ] [ ] lone = new int [ r ] [ c ] ;
  for ( int i = 0 ;
  i < r ;
  i ++ ) {
    grid [ i ] = read ( 0 ) ;
    lone [ i ] = new int [ c ] ;
    for ( int j = 0 ;
    j < c ;
    j ++ ) {
      write ( String . format ( "%d" , j ) ) ;
      solve ( ) ;
    }
  }
  for ( int i = 0 ;
  i < r ;
  i ++ ) {
    char fi = "" , la = "" , fo = - 1 ;
    for ( int j = 0 ;
    j < c ;
    j ++ ) {
      if ( grid [ i ] [ j ] == '.' ) continue ;
      if ( fo != - 1 ) fo = 999 ;
      if ( fo == - 1 ) {
        fo = j ;
        fi = grid [ i ] [ j ] ;
      }
      la = grid [ i ] [ j ] ;
    }
    if ( - 1 < fo && fo < 999 ) lone [ i ] [ fo ] = 1 ;
    if ( fi == '<' ) ans ++ ;
    if ( la == '>' ) ans ++ ;
    for ( int j = 0 ;
    j < c ;
    j ++ ) {
      char fi = "" , la = "" , fo = - 1 ;
      for ( int i = 0 ;
      i < r ;
      i ++ ) {
        if ( grid [ i ] [ j ] == '.' ) continue ;
        if ( fo != - 1 ) fo = 999 ;
        if ( fo == - 1 ) {
          fo = i ;
          fi = grid [ i ] [ j ] ;
        }
        la = grid [ i ] [ j ] ;
      }
      if ( - 1 < fo && fo < 999 && lone [ fo ] [ j ] > 0 ) {
        write ( "IMPOSSIBLE" ) ;
        return ;
      }
      if ( fi == '^' ) ans ++ ;
      if ( la == 'v' ) ans ++ ;
      write ( ans ) ;
    }
  }
  String outputFormat = "Case #%d: " ;
  String filename = input ( ) . trim ( ) ;
  BufferedReader sreader = null ;
  BufferedReader treader = null ;
  if ( filename != null ) {
    sreader = new BufferedReader ( new FileReader (