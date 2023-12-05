public static int [ ] [ ] getAnsi ( ) {
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int L = Integer . parseInt ( input . readLine ( ) ) ;
  int T = Integer . parseInt ( input . readLine ( ) ) ;
  ArrayList < ArrayList < Integer >> ants = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x = Integer . parseInt ( input . readLine ( ) ) ;
    int w = Integer . parseInt ( input . readLine ( ) ) ;
    ants . add ( new ArrayList < > ( ) ) ;
  }
  ArrayList < Integer > ants2 = new ArrayList < > ( ) ;
  for ( ArrayList < Integer > ant : ants ) {
    ants2 . add ( ( ant . get ( 0 ) + T * ( 3 - 2 * ant . get ( 1 ) ) ) % L ) ;
  }
  int st = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( ants2 . indexOf ( ants2 . get ( i ) ) == 1 ) {
      st = i ;
      break ;
    }
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
        if ( ants . get ( i ) . get ( 0 ) > ants . get ( st ) . get ( 0 ) ) fc = ( ants . get ( i ) . get ( 0 ) - ants . get ( st ) . get ( 0 ) ) / 2 ;
        else fc = ( L - ( ants . get ( st ) . get ( 0 ) - ants . get ( i ) . get ( 0 ) ) ) / 2 ;
      }
      else {
        if ( ants . get ( i ) . get ( 0 ) > ants . get ( st ) . get ( 0 ) ) fc = ( L - ( ants . get ( i ) . get ( 0 ) - ants . get ( st ) . get ( 0 ) ) ) / 2 ;
        else fc = ( ants . get ( st ) . get ( 0 ) - ants . get ( i ) . get ( 0 ) ) / 2 ;
      }
      cl += ( 3 - 2 * ants . get ( st ) . get ( 1 ) ) * ( int )