private static String solve ( ) {
  int N = Integer . parseInt ( r . nextLine ( ) ) ;
  int [ ] P = ArrayUtil . parseInt ( r . nextLine ( ) ) ;
  char [ ] names = ArrayUtil . charArray ( N ) ;
  StringBuilder ans = new StringBuilder ( ) ;
  while ( true ) {
    int mx = Collections . max ( P ) ;
    if ( mx == 0 ) break ;
    int [ ] cands = Stream . of ( P ) . filter ( i -> P [ i ] == mx ) . toArray ( ) ;
    if ( cands . length == 2 ) {
      ans . append ( names [ cands [ 0 ] ] ) . append ( names [ cands [ 1 ] ] ) ;
      P [ cands [ 0 ] ] -- ;
      P [ cands [ 1 ] ] -- ;
    }
    else {
      ans . append ( names [ cands [ 0 ] ] ) ;
      P [ cands [ 0 ] ] -- ;
    }
  }
  return ans . toString ( ) ;
}
