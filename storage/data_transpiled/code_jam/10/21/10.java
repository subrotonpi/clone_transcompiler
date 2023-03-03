public static int tn = Integer . parseInt ( Scanner in ) {
  int loop ;
  int cnt = 0 ;
  if ( ! in . hasNext ( ) ) {
    return 0 ;
  }
  cnt = 0 ;
  if ( ! in . hasNext ( ) ) {
    in . next ( ) ;
    cnt = 1 ;
  }
  return cnt + update ( in . nextInt ( ) , in . nextInt ( ) ) ;
}
