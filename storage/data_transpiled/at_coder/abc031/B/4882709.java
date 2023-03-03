public static int a = Integer . parseInt ( input ) {
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int hoge = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( ( hoge < a ) && ( hoge > b ) ) {
      System . out . println ( a - hoge ) ;
    }
    else if ( ( b < hoge ) && ( hoge > b ) ) {
      System . out . println ( - 1 ) ;
    }
    else {
      System . out . println ( 0 ) ;
    }
  }
  return a ;
}
