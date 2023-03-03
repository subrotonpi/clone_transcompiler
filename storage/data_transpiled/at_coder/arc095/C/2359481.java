public static String [ ] [ ] makePairs ( String [ ] [ ] input ) {
  int H = Integer . parseInt ( input [ 0 ] ) ;
  int W = Integer . parseInt ( input [ 1 ] ) ;
  LinkedList < LinkedList < Integer >> S = new LinkedList < LinkedList < Integer >> ( ) ;
  for ( ;
  H > 0 ;
  ) S . add ( Collections . singletonList ( input [ 2 ] ) ) ;
  LinkedList < Integer > S_arr = new LinkedList < Integer > ( S ) ;
  String res = "NO" ;
  /* Check if the row is not in the list */
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    LinkedList < Integer > j_list = new LinkedList < Integer > ( ) ;
    for ( int k = 1 ;
    k < H ;
    k ++ ) {
      if ( Arrays . binarySearch ( S_arr , i , j ) != - 1 ) {
        j_list . add ( j ) ;
      }
    }
    sameRowList . add ( j_list ) ;
  }
  /* Check if the row is not in the list */
  boolean res = true ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    LinkedList < Integer > s_arr = S_arr . clone ( ) ;
    int i = 0 ;
    for ( int j = 0 ;
    j < W ;
    j ++ ) {
      if ( s_arr . get ( i , j ) == 1 ) continue ;
      if ( s_arr . get ( j ) == 1 ) continue ;
      int rev_j = S_arr . get ( 0 , ( - 1 ) , j ) ;
      for ( int k = 0 ;
      k < W ;
      k ++ ) {
        if ( Arrays . binarySearch ( S_arr , i , j ) == rev_j && j != k && s_arr . get ( j ) == 0 ) {
          s_arr . set ( j , 1 ) ;
          s_arr . set ( j , 1 ) ;
          break ;
        }
      }
      if ( s_arr . get ( j ) == 0 ) {
        if ( Arrays . binarySearch ( S_arr , i , j ) == 1 ) {
          s_arr . set ( j , 1 ) ;
          res_bar ++ ;
        }
        else {
          res_bar += 10 ;
        }
      }
    }
    if ( res_bar <= 0 ) return "YES" ;
    else return "NO" ;
  }
  /* Check if the row is in the list */
  String [ ] [