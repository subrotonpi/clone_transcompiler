public static int [ ] getMath ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] l = new int [ n ] ;
  int [ ] r = new int [ n ] ;
  int [ ] s = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    _l = Integer . parseInt ( input . nextLine ( ) ) ;
    _r = Integer . parseInt ( input . nextLine ( ) ) ;
    _s = Integer . parseInt ( input . nextLine ( ) ) ;
    l [ i ] = _l ;
    r [ i ] = _r ;
    s [ i ] = _s ;
  }
  int [ ] imos = new int [ m + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    imos [ i ] = 0 ;
  }
  return imos ;
}
