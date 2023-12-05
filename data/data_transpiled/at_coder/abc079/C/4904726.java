public static void input ( Scanner s ) {
  int a = Integer . parseInt ( s . nextLine ( ) ) ;
  int b = Integer . parseInt ( s . nextLine ( ) ) ;
  int c = Integer . parseInt ( s . nextLine ( ) ) ;
  int d = Integer . parseInt ( s . nextLine ( ) ) ;
  int one = - 1 ;
  boolean flg = false ;
  for ( int i = 0 ;
  i < 2 ;
  i ++ ) {
    for ( int j = 0 ;
    j < 2 ;
    j ++ ) {
      for ( int k = 0 ;
      k < 2 ;
      k ++ ) {
        if ( a + b * one * i + c * one * j + d * one * k == 7 ) {
          flg = true ;
          break ;
        }
      }
    }
  }
  if ( flg ) break ;
}
