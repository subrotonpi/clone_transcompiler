public static int N = Integer . parseInt ( input ) {
  ArrayList < Integer > d_ok = new ArrayList < > ( ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x = Integer . parseInt ( input ) ;
    if ( x % 10 != 0 ) d_ok . add ( x ) ;
    ans ++ ;
  }
  Collections . sort ( d_ok ) ;
  return ans ;
}
