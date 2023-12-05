public static String input ( ) {
  boolean flg = false ;
  int len = X . length ( ) ;
  char [ ] choku = {
    'C' , 'o' , 'k' , 'u' }
    ;
    for ( int i = 0 ;
    i < len ;
    i ++ ) {
      if ( ! choku [ i ] ) {
        flg = true ;
      }
    }
    return flg ? "YES" : "NO" ;
  }
  