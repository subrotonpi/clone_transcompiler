public static boolean belmanford ( int x ) {
  int h = Integer . parseInt ( input . readLine ( ) ) ;
  int w = Integer . parseInt ( input . readLine ( ) ) ;
  int t = Integer . parseInt ( input . readLine ( ) ) ;
  String [ ] [ ] sw = new String [ w + 2 ] [ ] ;
  int [ ] Stt = new int [ 2 ] ;
  int [ ] End = new int [ 2 ] ;
  for ( int i = 1 ;
  i <= h ;
  i ++ ) {
    String [ ] tmp = new String [ 2 ] ;
    tmp [ 0 ] = "" + new String ( input . readLine ( ) ) + "" ;
    sw [ i ] = tmp ;
    for ( int j = 0 ;
    j < tmp . length ;
    j ++ ) {
      if ( tmp [ j ] . equals ( "S" ) ) {
        Stt [ j ] = i ;
      }
      else if ( tmp [ j ] . equals ( "G" ) ) {
        End [ j ] = i ;
      }
    }
  }
  sw [ 0 ] = new String [ w + 2 ] ;
  /* belmanford */
  int [ ] [ ] countSW = new int [ h + 2 ] [ w + 2 ] ;
  for ( int i = 0 ;
  i < h + 2 ;
  i ++ ) {
    countSW [ i ] [ i ] = t + 1 ;
    countSW [ i ] [ i ] = Stt [ i ] ;
  }
  List < String [ ] > nextTurn = new ArrayList < String [ ] > ( ) ;
  nextTurn . add ( Stt ) ;
  while ( nextTurn . size ( ) > 0 ) {
    String [ ] n = nextTurn . remove ( 0 ) ;
    for ( int [ ] d : new int [ ] [ ] {
      {
        1 , 0 }
        , {
          - 1 , 0 }
          , {
            0 , 1 }
            , {
              0 , - 1 }
            }
            ) {
              String [ ] tmpn = new String [ 2 ] ;
              tmpn [ 0 ] = n [ 0 ] + d [ 0 ] ;
              tmpn [ 1 ] = n [ 1 ] + d [ 1 ] ;
              if ( sw [ tmpn [ 0 ] ] [ tmpn [ 1 ] ] . equals ( "" ) ) {
                continue ;
              }
              else if ( sw [ tmpn [ 0 ] ] [ tmpn [ 1 ] ] . equals ( "#" ) ) {
                if ( countSW [ n [ 0 ] ] [ n [ 1 ]