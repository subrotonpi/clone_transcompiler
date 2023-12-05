public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  String [ ] [ ] l = new String [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) l [ i ] [ 1 ] = input . split ( " " ) ;
  int sm = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) sm += l [ i ] [ 1 ] ;
  sm /= 2 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( ( l [ i ] [ 1 ] > sm ) && ( l [ i ] [ 0 ] > sm ) ) {
      System . out . println ( l [ i ] [ 0 ] ) ;
      exit ( 0 ) ;
    }
  }
  System . out . println ( "atcoder" ) ;
}
