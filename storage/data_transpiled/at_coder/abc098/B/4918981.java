public static int N = Integer . parseInt ( input ) {
  String S = input ;
  int max_cnt = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int [ ] li1 = new int [ 26 ] ;
    int [ ] li2 = new int [ 26 ] ;
    int cnt = 0 ;
    for ( int j = 0 ;
    j < S . length ( ) ;
    j ++ ) {
      li1 [ ( int ) j - 97 ] ++ ;
    }
    for ( int j = 0 ;
    j < S . length ( ) ;
    j ++ ) {
      li2 [ ( int ) j - 97 ] ++ ;
    }
    for ( int j = 0 ;
    j < 26 ;
    j ++ ) {
      if ( ( li1 [ j ] > 0 ) && ( li2 [ j ] > 0 ) ) cnt ++ ;
    }
    max_cnt = Math . max ( max_cnt , cnt ) ;
  }
  System . out . println ( max_cnt ) ;
  return max_cnt ;
}
