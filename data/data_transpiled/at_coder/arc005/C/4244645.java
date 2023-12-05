public static void solve ( ) {
  /* do not check for out range */
  int h = Integer . parseInt ( input . nextLine ( ) ) ;
  int w = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] maze = new int [ h ] [ w ] ;
  int [ ] [ ] d = new int [ h ] [ w ] ;
  for ( int j = 0 ;
  j < h ;
  j ++ ) {
    int newY = y + j , newX = x + k ;
    if ( outRange ( h , w , newY , newX ) ) continue ;
    if ( maze [ newY ] [ newX ] != 2 && ! visited2 [ newY ] [ newX ] ) {
      visited2 [ newY ] [ newX ] = true ;
      queue . add ( new int [ ] [ ] {
        newY , newX , i }
        ) ;
      }
    }
    /* else {
    System.out.println("NO");
    }*/
    if ( Class . isEnum ( ) ) solve ( ) ;
  }
  