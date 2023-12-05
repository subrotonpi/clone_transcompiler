static final long honyaku ( ) {
  String S = String . valueOf ( input . nextLine ( ) ) ;
  int N = S . length ( ) - 1 ;
  /* honyaku */
  long [ ] ans = new long [ n ] ;
  for ( int i = n - 1 ;
  i >= 0 ;
  i -- ) {
    ans [ i ] = ini % 2 ;
    ini = ini / 2 ;
  }
  /* sumList */
  long tmp = listS [ 0 ] ;
  long ans = 0 ;
  for ( int i = 0 ;
  i < listDomain . length ;
  i ++ ) {
    if ( listDomain [ i ] == 0 ) {
      tmp = tmp * 10 + listS [ i + 1 ] ;
    }
    else {
      ans += tmp ;
      tmp = listS [ i + 1 ] ;
    }
  }
  /* sum */
  listS = new long [ N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    listDomain = honyaku ( i , N ) ;
    ans += sumList ( listDomain , listS ) ;
  }
  System . out . println ( ( int ) ans ) ;
  return ans ;
}
