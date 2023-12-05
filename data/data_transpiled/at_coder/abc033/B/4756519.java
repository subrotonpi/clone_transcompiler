public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  String [ ] S = new String [ N ] ;
  int [ ] P = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    S [ i ] = input . split ( " " ) ;
    P [ i ] = Integer . parseInt ( P [ i ] ) ;
  }
  int flag = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( P [ i ] > Integer . parseInt ( P [ i ] ) / 2 ) {
      System . out . println ( S [ i ] ) ;
      flag = 1 ;
    }
  }
  if ( flag == 0 ) {
    System . out . println ( "atcoder" ) ;
  }
}
