public static void print ( int h , int w ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > alist = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) alist . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  int [ ] [ ] cmap = new int [ w ] [ h ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) cmap [ i ] = new int [ w ] ;
  int i = 0 ;
  for ( int ai = 0 , a = alist . size ( ) ;
  ai < a ;
  ai ++ ) {
    int a = alist . get ( ai ) ;
    for ( int _a = 0 ;
    _a < a ;
    _a ++ ) {
      if ( ( ( i + _a ) / w ) % 2 == 0 ) cmap [ ( i + _a ) / w ] [ ( i + _a ) % w ] = ai ;
      else cmap [ ( i + _a ) / w ] [ - ( ( i + _a ) % w + 1 ) ] = ai ;
    }
    i += a ;
  }
  for ( int [ ] cm : cmap ) {
    print ( ( String ) cm [ 0 ] , " " ) ;
  }
}
