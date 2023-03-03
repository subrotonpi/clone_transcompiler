public static void main ( String [ ] args ) {
  for ( int i = 0 ;
  i < 3 ;
  i ++ ) {
    s [ i ] = input . next ( ) ;
  }
  int flg = 1 ;
  while ( ( flg = System . in . nextInt ( ) ) != 0 ) {
    switch ( flg ) {
      case 1 : if ( s [ 0 ] . equals ( "" ) ) {
        System . out . println ( "A" ) ;
        break ;
      }
      else if ( s [ 0 ] . charAt ( 0 ) == 'a' ) {
        s [ 0 ] = s [ 0 ] . substring ( 1 ) ;
        flg = 1 ;
      }
      else if ( s [ 0 ] . charAt ( 0 ) == 'b' ) {
        s [ 0 ] = s [ 0 ] . substring ( 1 ) ;
        flg = 2 ;
      }
      else if ( s [ 0 ] . charAt ( 0 ) == 'c' ) {
        s [ 0 ] = s [ 0 ] . substring ( 1 ) ;
        flg = 3 ;
      }
      break ;
      case 2 : if ( s [ 1 ] . equals ( "" ) ) {
        System . out . println ( "B" ) ;
        break ;
      }
      else if ( s [ 1 ] . charAt ( 0 ) == 'a' ) {
        s [ 1 ] = s [ 1 ] . substring ( 1 ) ;
        flg = 1 ;
      }
      else if ( s [ 1 ] . charAt ( 0 ) == 'b' ) {
        s [ 1 ] = s [ 1 ] . substring ( 1 ) ;
        flg = 2 ;
      }
      else if ( s [ 1 ] . charAt ( 0 ) == 'c' ) {
        s [ 1 ] = s [ 1 ] . substring ( 1 ) ;
        flg = 3 ;
      }
      break ;
      case 3 : if ( s [ 2 ] . equals ( "" ) ) {
        System . out . println ( "C" ) ;
        break ;
      }
      else if ( s [ 2 ] . charAt ( 0 ) == 'a' ) {
        s [ 2 ] = s [ 2 ] . substring ( 1 ) ;
        flg = 1 ;
      }
      else if ( s [ 2 ] . charAt ( 0 ) == 'b' ) {
        s [ 2 ] = s [ 2 ] . substring ( 1 ) ;
        flg = 2 ;
      }
      else if ( s [ 2 ] . charAt ( 0 ) == 'c' ) {
        s [ 2 ] = s [ 2 ] . substring ( 1 ) ;
        