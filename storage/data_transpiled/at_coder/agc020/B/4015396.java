public static int k = Integer . parseInt ( input ) {
  int * a , r ;
  a = Integer . parseInt ( input . readLine ( ) ) ;
  int l = 2 , r = 2 ;
  for ( int i = a . length - 1 ;
  i >= 0 ;
  i -- ) {
    l = ( l + a . get ( i ) - 1 ) / a . get ( i ) * a . get ( i ) ;
    if ( r < l ) {
      System . out . println ( - 1 ) ;
      break ;
    }
    r = ( r / a . get ( i ) + 1 ) * a . get ( i ) - 1 ;
  }
  return l + r ;
}
