public static int N ( ) {
  int x = Integer . parseInt ( input . nextLine ( ) ) ;
  ArrayList < Integer > a = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < x ;
  i ++ ) {
    a . add ( i ) ;
  }
  int ans = 0 ;
  for ( int ai : a ) {
    x -= ai ;
    if ( x < 0 ) break ;
    ans ++ ;
  }
  if ( 0 < x ) ans -- ;
  return ans ;
}
