public static int getInt ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > L = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    L . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  Collections . sort ( L ) ;
  L . add ( 0 ) ;
  int EVEN = 0 ;
  int ODD = 0 ;
  int cnt = 1 ;
  int cur = L . get ( 0 ) ;
  int i = 0 ;
  while ( i < N ) {
    if ( L . get ( i ) == L . get ( i + 1 ) ) {
      cnt ++ ;
      i ++ ;
    }
    else {
      if ( cnt % 2 == 0 ) {
        EVEN ++ ;
      }
      else {
        ODD ++ ;
      }
      cur = L . get ( i + 1 ) ;
      i ++ ;
      cnt = 1 ;
    }
  }
  if ( EVEN % 2 == 0 ) {
    System . out . println ( EVEN + ODD ) ;
  }
  else {
    System . out . println ( EVEN + ODD - 1 ) ;
  }
  return cur ;
}
