public static int [ ] getDigits ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  ArrayList < Integer > clist = new ArrayList < Integer > ( ) ;
  clist . add ( - 1 ) ;
  int mod = 10 * 9 + 7 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int t = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( t == clist . get ( clist . size ( ) - 1 ) ) continue ;
    clist . add ( t ) ;
  }
  clist . remove ( clist . size ( ) - 1 ) ;
  N = clist . size ( ) ;
  int [ ] colorlast = new int [ 3 * 10 * 5 ] ;
  int [ ] poslp = new int [ N + 1 ] ;
  for ( int e = 0 ;
  e < clist . size ( ) ;
  e ++ ) {
    if ( colorlast [ c ] != - 1 ) {
      poslp [ e ] = colorlast [ c ] ;
      colorlast [ c ] = e ;
    }
    else colorlast [ c ] = e ;
  }
  dp = new int [ N + 100 ] ;
  dp [ 0 ] = 1 ;
  return dp ;
}
