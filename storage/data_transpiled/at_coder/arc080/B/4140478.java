public static final String getHex ( ) {
  final String input = System . getProperty ( "line.separator" ) ;
  final int H = Integer . parseInt ( input ) ;
  final int W = Integer . parseInt ( input ) ;
  final int N = Integer . parseInt ( input ) ;
  final int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < A . length ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input ) ;
  }
  final int [ ] l = new int [ H * W ] ;
  int prev = 0 ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    final int a = A [ i ] ;
    final int color = i + 1 ;
    int cnt = 0 ;
    while ( cnt < a ) {
      l [ cnt + prev ] = color ;
      cnt ++ ;
    }
    prev = prev + a ;
  }
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    final int [ ] subL = Arrays . copyOfRange ( l , W * i , W * ( i + 1 ) ) ;
    if ( i % 2 == 0 ) {
      System . out . println ( Arrays . toString ( subL ) ) ;
    }
    else {
      subL = Arrays . copyOfRange ( subL , 0 , subL . length ) ;
      System . out . println ( Arrays . toString ( subL ) ) ;
    }
  }
  return "" ;
}
