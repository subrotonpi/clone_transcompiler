public static int C = Integer . parseInt ( Scanner in ) {
  for ( int X = 1 ;
  X <= C ;
  X ++ ) {
    int N = in . nextInt ( ) ;
    int M = in . nextInt ( ) ;
    ArrayList < ArrayList < Integer >> customers = new ArrayList < ArrayList < Integer >> ( ) ;
    for ( int tmp = 0 ;
    tmp < M ;
    tmp ++ ) {
      int [ ] line = map . get ( in . nextInt ( ) ) . split ( "\\s+" ) ;
      ArrayList < Integer > _line = new ArrayList < Integer > ( ) ;
      for ( int _tmp = 0 ;
      _tmp < line [ 0 ] ;
      _tmp ++ ) {
        _line . add ( new Integer ( line [ _tmp * 2 + 1 ] ) ) ;
      }
      customers . add ( _line ) ;
    }
    for ( int tmp = 0 ;
    tmp < 2 * N ;
    tmp ++ ) {
      ArrayList < Integer > _list = new ArrayList < Integer > ( ) ;
      _list . add ( tmp & 1 == 1 ) ;
      _list . add ( tmp & 2 == 2 ) ;
      _list . add ( tmp & 4 == 4 ) ;
      _list . add ( tmp & 8 == 8 ) ;
      _list . add ( tmp & 16 == 16 ) ;
      _list . add ( tmp & 32 == 32 ) ;
      _list . add ( tmp & 64 == 64 ) ;
      _list . add ( tmp & 128 == 128 ) ;
      _list . add ( tmp & 256 == 256 ) ;
      _list . add ( tmp & 512 == 512 ) ;
      boolean HELLOWORLD = true ;
      for ( ArrayList < Integer > _tmp : customers ) {
        boolean _customer = false ;
        for ( int _HELLOWORLD : _tmp ) {
          if ( ( _list . get ( _HELLOWORLD ) - 1 ) ? 1 : 0 ) {
            _customer = true ;
            break ;
          }
        }
        HELLOWORLD = HELLOWORLD && _customer ;
      }
      if ( HELLOWORLD ) break ;
    }
    System . out . println ( "Case #" + X + ":" ) ;
    if ( HELLOWORLD ) {
      for ( int tmp = 0 ;
      tmp < N ;
      tmp ++ ) {
        System . out . println ( _list . get ( tmp ) ? 1 : 0 ) ;
      }
      System . out . println ( ) ;
    }
    else System . out . println ( "IMPOSSIBLE" ) ;
  }
  return C ;
}
