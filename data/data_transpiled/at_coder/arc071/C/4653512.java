public static void input ( ) {
  String s = input . nextLine ( ) ;
  String t = input . nextLine ( ) ;
  int ls = s . length ( ) ;
  int lt = t . length ( ) ;
  int [ ] sl = new int [ ls + 1 ] ;
  int [ ] tl = new int [ lt + 1 ] ;
  for ( int i = 0 ;
  i < ls ;
  i ++ ) {
    if ( s . charAt ( i ) == 'A' ) sl [ i + 1 ] = sl [ i ] + 1 ;
    else sl [ i + 1 ] = sl [ i ] + 2 ;
  }
  for ( int i = 0 ;
  i < lt ;
  i ++ ) {
    if ( t . charAt ( i ) == 'A' ) tl [ i + 1 ] = tl [ i ] + 1 ;
    else tl [ i + 1 ] = tl [ i ] + 2 ;
  }
  for ( ;
  ;
  ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    int c = Integer . parseInt ( input . nextLine ( ) ) ;
    int d = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( ( sl [ b ] - tl [ d ] - sl [ a - 1 ] + tl [ c - 1 ] ) % 3 == 0 ) System . out . println ( "YES" ) ;
    else System . out . println ( "NO" ) ;
  }
}
