public static int [ ] getDistance ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] h = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    h [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( h ) ;
  int [ ] diff = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    diff [ i ] = h [ i ] - h [ i ] ;
  }
  Arrays . sort ( diff ) ;
  return diff ;
}
