public static void print ( String input ) {
  int n = Integer . parseInt ( input . trim ( ) ) ;
  int [ ] s = new int [ n ] ;
  int su = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input . trim ( ) ) ;
    s [ i ] = a ;
    su += a ;
  }
  Arrays . sort ( s ) ;
  if ( su % 10 == 0 ) {
    boolean fl = false ;
    for ( int i = 0 ;
    i < s . length ;
    i ++ ) {
      int tm = su - s [ i ] ;
      if ( tm % 10 != 0 ) {
        su = tm ;
        fl = true ;
        break ;
      }
    }
  }
  else fl = true ;
  if ( fl ) System . out . println ( su ) ;
  else System . out . println ( 0 ) ;
}
