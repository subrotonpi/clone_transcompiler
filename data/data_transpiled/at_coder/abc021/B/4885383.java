public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  List < Integer > hoge = Lists . newArrayList ( ) ;
  int m = Integer . parseInt ( input ) ;
  List < Integer > huga = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    hoge . add ( huga . get ( i ) ) ;
  }
  List < Integer > hoge2 = Lists . newArrayList ( ) ;
  hoge2 . addAll ( hoge ) ;
  if ( ( hoge . size ( ) == hoge2 . size ( ) ) && ( hoge . get ( 0 ) == hoge2 . get ( 0 ) ) ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
}
