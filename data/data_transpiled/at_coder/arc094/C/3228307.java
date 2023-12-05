public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int [ ] A = new int [ N ] ;
  int [ ] B = new int [ N ] ;
  int hoge = Integer . MIN_VALUE ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = Integer . parseInt ( input . substring ( 0 , i ) ) ;
    int b = Integer . parseInt ( input . substring ( i + 1 , i + 1 ) ) ;
    A [ i ] = a ;
    B [ i ] = b ;
    if ( a > b ) {
      hoge = Math . min ( hoge , b ) ;
    }
  }
  if ( hoge == Integer . MIN_VALUE ) {
    System . out . println ( 0 ) ;
  }
  else {
    System . out . println ( Arrays . toString ( B ) - hoge ) ;
  }
}
