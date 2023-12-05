public static void print ( String input ) {
  int H = Integer . parseInt ( input ) ;
  int W = Integer . parseInt ( input ) ;
  int cnt = 0 ;
  for ( ;
  ( cnt < H ) && ( cnt < W ) ;
  ) {
    cnt += input . length ( ) ;
  }
  String ans = "Impossible" ;
  if ( ( cnt == H + W - 1 ) && ( cnt < W ) ) {
    ans = "Possible" ;
  }
  System . out . println ( ans ) ;
}
