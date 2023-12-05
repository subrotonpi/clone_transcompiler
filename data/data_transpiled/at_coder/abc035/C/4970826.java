public static void print ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int Q = Integer . parseInt ( input ) ;
  int [ ] li = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    int l = Integer . parseInt ( input ) ;
    int r = Integer . parseInt ( input ) ;
    li [ l - 1 ] ++ ;
    li [ r ] -- ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    li [ i + 1 ] += li [ i ] ;
  }
  String ans = "" ;
  for ( int n = li . length - 1 ;
  n >= 0 ;
  n -- ) {
    if ( n % 2 == 0 ) {
      ans += "0" ;
    }
    else {
      ans += "1" ;
    }
  }
  System . out . println ( ans ) ;
}
