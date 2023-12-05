public static int [ ] getM ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int L = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] m = new int [ N ] ;
  for ( int i = 0 ;
  i < L ;
  i ++ ) m [ i ] = i ;
  return m ;
}
