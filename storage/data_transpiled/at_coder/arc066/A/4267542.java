public static void print ( String input ) {
  int N = Integer . parseInt ( input ) ;
  List < Integer > L = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    L . add ( Integer . parseInt ( input ) ) ;
  }
  Collections . sort ( L ) ;
  boolean flag = true ;
  if ( N % 2 == 0 ) {
    for ( int i = 0 ;
    i < N / 2 ;
    i ++ ) {
      if ( L . get ( i * 2 ) == L . get ( i * 2 + 1 ) == 2 * i + 1 ) {
        null ;
      }
      else {
        flag = false ;
        break ;
      }
    }
  }
  else {
    if ( L . get ( 0 ) != 0 ) {
      flag = false ;
    }
    else {
      for ( int i = 1 ;
      i <= N / 2 ;
      i ++ ) {
        if ( L . get ( i * 2 - 1 ) == L . get ( i * 2 ) == 2 * i ) {
          null ;
        }
        else {
          flag = false ;
          break ;
        }
      }
    }
  }
  if ( flag ) {
    System . out . println ( 2 * ( N / 2 ) % ( 7 + 10 * 9 ) ) ;
  }
  else {
    System . out . println ( 0 ) ;
  }
}
