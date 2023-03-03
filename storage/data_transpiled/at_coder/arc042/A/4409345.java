public static int [ ] [ ] getNegativeInstances ( ) {
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int M = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] L = new int [ M ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) L [ i ] = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] tmp = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) tmp [ i ] = N - i ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) if ( tmp [ tmp . length - i - 1 ] != L [ i ] ) tmp [ i ] = L [ i ] ;
  boolean [ ] [ ] flag = new boolean [ N ] [ M ] ;
  for ( int i = 0 ;
  i < tmp . length ;
  i ++ ) flag [ i ] = false ;
  for ( int i = 0 ;
  i < tmp . length ;
  i ++ ) if ( flag [ tmp [ tmp . length - i - 1 ] - 1 ] == false ) {
    flag [ tmp . length - i - 1 ] = true ;
    System . out . println ( tmp [ tmp . length - i - 1 ] ) ;
  }
  return flag ;
}
