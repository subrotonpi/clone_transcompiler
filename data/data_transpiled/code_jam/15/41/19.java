static final String print ( ) throws IOException {
  final Scanner fin = new Scanner ( System . in ) ;
  int T = Integer . parseInt ( fin . nextLine ( ) . trim ( ) ) ;
  for ( int i = 1 ;
  i <= T ;
  i ++ ) {
    R = Integer . parseInt ( fin . nextLine ( ) . trim ( ) ) ;
    C = Integer . parseInt ( fin . nextLine ( ) . trim ( ) ) ;
    if ( d == '.' ) {
      rd = 0 ;
      cd = 0 ;
      maxmoves = - 1 ;
    }
    if ( d == '^' ) {
      rd = - 1 ;
      cd = 0 ;
      maxmoves = r ;
    }
    if ( d == '>' ) {
      rd = 0 ;
      cd = 1 ;
      maxmoves = C - c - 1 ;
    }
    if ( d == '<' ) {
      rd = 0 ;
      cd = - 1 ;
      maxmoves = c ;
    }
    if ( d == 'v' ) {
      rd = 1 ;
      cd = 0 ;
      maxmoves = R - r - 1 ;
    }
  }
  int [ ] [ ] getmm ( ) ;
  int [ ] [ ] move = new int [ T ] [ ] ;
  int i ;
  int rd = 0 ;
  int cd = 0 ;
  for ( i = 0 ;
  i < R . length ;
  i ++ ) {
    grid [ i ] = 0 ;
  }
  int [ ] [ ] move = new int [ C ] [ ] ;
  for ( i = 0 ;
  i < C . length ;
  i ++ ) {
    grid [ i ] [ rd ] = i ;
  }
  int [ ] [ ] move = new int [ R ] [ C ] ;
  for ( i = 0 ;
  i < C . length ;
  i ++ ) {
    int [ ] rp = move [ i ] ;
    int cp = move [ i ] ;
    if ( grid [ rp ] [ cp ] != '.' ) return true ;
  }
  Set < String > full = new LinkedHashSet < String > ( ) ;
  full . add ( ">" ) ;
  full . add ( "<" ) ;
  full . add ( "v" ) ;
  full . add ( "^" ) ;
  int count = 0 ;
  for ( int r = 0 ;
  r < R . length ;
  r ++ ) {
    for ( int c = 0 ;
    c < C . length ;
    c ++ ) {
      if ( grid [ r ] [ c ] == '.' ) continue ;
      if ( checkgood ( r , c , grid [ r ] [ c ] ) )