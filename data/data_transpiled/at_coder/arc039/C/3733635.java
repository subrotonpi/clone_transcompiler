public static int K = Integer . parseInt ( input ) {
  String s = input . nextLine ( ) ;
  int unit = 400001 ;
  int center = 200000 ;
  int currentPos = center * unit + center ;
  Map < Integer , Integer > map = new HashMap < > ( ) ;
  map . put ( currentPos , new Integer [ ] {
    currentPos + unit , currentPos + 1 , currentPos - unit , currentPos - 1 }
    ) ;
    Map < Integer , Integer > _dir = new HashMap < > ( ) ;
    _dir . put ( "U" , 0 ) ;
    _dir . put ( "R" , 1 ) ;
    _dir . put ( "D" , 2 ) ;
    _dir . put ( "L" , 3 ) ;
    for ( char c : s . toCharArray ( ) ) {
      int dir1 = _dir . get ( c ) , dir2 = ( _dir . get ( c ) + 2 ) % 4 ;
      int opposite = map . get ( currentPos ) . get ( dir2 ) ;
      int nextPos = map . get ( currentPos ) . get ( dir1 ) ;
      while ( map . containsKey ( nextPos ) ) {
        map . get ( nextPos ) . put ( dir2 , opposite ) ;
        nextPos = map . get ( nextPos ) . get ( dir1 ) ;
      }
      map . put ( nextPos , new Integer [ ] {
        nextPos + unit , nextPos + 1 , nextPos - unit , nextPos - 1 }
        ) ;
        map . get ( nextPos ) . put ( dir2 , opposite ) ;
        map . get ( currentPos ) . put ( dir1 , map . get ( nextPos ) . get ( dir1 ) ) ;
        currentPos = nextPos ;
      }
      System . out . println ( currentPos % unit - center + " " + ( currentPos / unit - center ) ) ;
      return currentPos / unit - center ;
    }
    