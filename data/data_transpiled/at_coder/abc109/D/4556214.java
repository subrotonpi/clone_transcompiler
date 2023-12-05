public static String [ ] [ ] getOperations ( ) {
  int H = Integer . parseInt ( input . readLine ( ) ) ;
  int W = Integer . parseInt ( input . readLine ( ) ) ;
  List < List < Integer >> Ai = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    List < Integer > a = new LinkedList < > ( ) ;
    for ( int j = 0 ;
    j < H ;
    j ++ ) {
      a . add ( Integer . parseInt ( input . readLine ( ) ) ) ;
    }
    Ai . add ( a ) ;
  }
  List < String > [ ] operations = new List [ H ] ;
  /* Get the text string */
  String text = String . valueOf ( y1 + 1 , x1 , y2 , x2 ) ;
  for ( int y = 0 ;
  y < H ;
  y ++ ) {
    if ( y % 2 == 0 ) {
      for ( int x = 0 ;
      x < W ;
      x ++ ) {
        if ( Ai . get ( y ) . get ( x ) % 2 == 0 ) continue ;
        if ( x == W - 1 ) {
          if ( y < H - 1 ) {
            Ai . get ( y ) . set ( x , -- 1 ) ;
            Ai . get ( y + 1 ) . set ( x , ++ 1 ) ;
            operations [ y ] . add ( text ) ;
          }
        }
        else {
          Ai . get ( y ) . set ( x , -- 1 ) ;
          Ai . get ( y + 1 ) . set ( x , ++ 1 ) ;
          operations [ y ] . add ( text ) ;
        }
      }
    }
    else {
      for ( int x = W - 1 ;
      x >= 0 ;
      x -- ) {
        if ( Ai . get ( y ) . get ( x ) % 2 == 0 ) continue ;
        if ( x == 0 ) {
          if ( y < H - 1 ) {
            Ai . get ( y ) . set ( x , -- 1 ) ;
            Ai . get ( y + 1 ) . set ( x , ++ 1 ) ;
            operations [ y ] . add ( text ) ;
          }
        }
        else {
          Ai . get ( y ) . set ( x , -- 1 ) ;
          Ai . get ( y ) . set ( x - 1 , ++ 1 ) ;
          operations [ y ] . add ( text ) ;
        }
      }
    }
  }
  System . out . println ( operations . size ( ) ) ;
  for ( String