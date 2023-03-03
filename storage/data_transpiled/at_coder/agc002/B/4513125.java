public static int [ ] [ ] input ( ) {
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  int m = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] [ ] xy = new int [ m ] [ ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    xy [ i ] = Integer . parseInt ( input . readLine ( ) ) ;
  }
  int [ ] [ ] red = new int [ n ] [ ] ;
  Arrays . fill ( red , 1 ) ;
  int [ ] ball = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ball [ i ] = 1 ;
  }
  return ball ;
}
