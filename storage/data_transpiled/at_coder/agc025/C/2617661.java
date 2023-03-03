public static int [ ] getN ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] L = new int [ N ] , R = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int l = Integer . parseInt ( input . nextLine ( ) ) ;
    int r = Integer . parseInt ( input . nextLine ( ) ) ;
    L [ i ] = l ;
    R [ i ] = r ;
  }
  L [ N ] = 0 ;
  R [ N ] = 0 ;
  Arrays . sort ( L ) ;
  Arrays . sort ( R ) ;
  int Ans = 0 ;
  for ( int i = 0 ;
  i < N + 1 ;
  i ++ ) {
    if ( L [ i ] > R [ i ] ) Ans += ( L [ i ] - R [ i ] ) * 2 ;
  }
  System . out . println ( Ans ) ;
  return L ;
}
