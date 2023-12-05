public static List < List < Integer >> A = new ArrayList < > ( ) {
  {
    for ( int i = 0 ;
    i < 4 ;
    i ++ ) {
      for ( int j = 0 ;
      j < 4 ;
      j ++ ) {
        if ( j != 3 ) {
          if ( A . get ( i ) [ j ] == A . get ( i ) [ j + 1 ] ) {
            flag = true ;
          }
        }
        if ( i != 3 ) {
          if ( A . get ( i ) [ j ] == A . get ( i + 1 ) [ j ] ) {
            flag = true ;
          }
        }
      }
    }
  }
  ;
}
