public static int [ ] [ ] getAnsi ( Scanner input ) {
  int N = input . nextInt ( ) ;
  int L = input . nextInt ( ) ;
  int T = input . nextInt ( ) ;
  ArrayList < ArrayList < Integer >> ants = new ArrayList < ArrayList < Integer >> ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x = input . nextInt ( ) ;
    int w = input . nextInt ( ) ;
    ants . add ( new ArrayList < Integer > ( x ) ) ;
  }
  ArrayList < Integer > ants2 = new ArrayList < Integer > ( ) ;
  for ( ArrayList < Integer > ant : ants ) {
    ants2 . add ( ( ant . get ( 0 ) + T * ( 3 - 2 * ant . get ( 1 ) ) ) % L ) ;
  }
  int st = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( ants2 . indexOf ( ants2 . get ( i ) ) == 1 ) {
      break ;
    }
    st ++ ;
  }
  int cl = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( ants . get ( i ) . get ( 1 ) == ants . get ( st ) . get ( 1 ) ) {
      continue ;
    }
    else {
      if ( ants . get ( st ) . get ( 1 ) == 1 ) {
        int fc ;
        if ( ants . get ( i ) . get ( 0 ) > ants . get ( st ) . get ( 0 ) ) {
          fc = ( ants . get ( i ) . get ( 0 ) - ants . get ( st ) . get ( 0 ) ) / 2 ;
        }
        else {
          fc = ( ( L - ants . get ( st ) . get ( 0 ) ) + ants . get ( i ) . get ( 0 ) ) / 2 ;
        }
        cl += ( 2 * ( T - fc ) ) / L + 1 ;
      }
      else {
        int fc ;
        if ( ants . get ( i ) . get ( 0 ) > ants . get ( st ) . get ( 0 ) ) {
          fc = ( ( L - ants . get ( i ) . get ( 0 ) ) + ants . get ( st ) . get ( 0 ) ) / 2 ;
        }
        else {
          fc = ( ants . get ( st ) . get ( 0 ) - ants . get ( i ) . get ( 0 ) ) / 2 ;
        }
        cl -= ( 2 * ( T - fc ) )