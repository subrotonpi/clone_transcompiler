public static int N ( ) {
  int L = Integer . parseInt ( input . nextLine ( ) ) ;
  String S = input . nextLine ( ) ;
  int t = 1 ;
  int cr = 0 ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    if ( S . charAt ( i ) == '+' ) {
      t ++ ;
      if ( t > L ) {
        cr ++ ;
        t = 1 ;
      }
    }
    else {
      if ( S . charAt ( i ) == '-' ) {
        if ( t > 1 ) t -- ;
      }
    }
  }
  return cr ;
}
