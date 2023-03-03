public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  ArrayList < String > hoge = new ArrayList < String > ( ) ;
  String ansName = "hoge" ;
  int ansCoun = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    hoge . add ( input ) ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( ( hoge . indexOf ( hoge . get ( i ) ) >= ansCoun ) ) {
      ansName = hoge . get ( i ) ;
      ansCoun = hoge . indexOf ( hoge . get ( i ) ) ;
    }
  }
  System . out . println ( ansName ) ;
}
