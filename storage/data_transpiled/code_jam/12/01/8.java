static private Map < String , String > makemap ( ) {
  final String ALPHA = "abcdefghijklmnopqrstuvwxyz" ;
  final Map < String , String > M = new HashMap < String , String > ( ) ;
  M . put ( "y" , "a" ) ;
  M . put ( "e" , "o" ) ;
  M . put ( "q" , "z" ) ;
  final String G = "ejp mysljylc kd kxveddknmc re jsicpdrysi" + "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd" + "de kr kd eoya kw aej tysr re ujdr lkgc jv" ;
  final String E = "our language is impossible to understand" + "there are twenty six factorial possibilities" + "so it is okay if you want to just give up" ;
  assert ( G . length ( ) == E . length ( ) ) ;
  for ( int i = 0 ;
  i < G . length ( ) ;
  i ++ ) {
    final String g = G . substring ( i , i + 1 ) ;
    final String e = E . substring ( i , i + 1 ) ;
    if ( ALPHA . contains ( g ) ) {
      assert ( ALPHA . contains ( e ) ) ;
      if ( ! M . containsKey ( g ) ) M . put ( g , e ) ;
      else assert ( M . get ( g ) . equals ( e ) ) ;
    }
    else {
      assert ( ! ALPHA . contains ( e ) ) ;
    }
  }
  assert ( M . size ( ) == 25 || M . size ( ) == 26 ) ;
  assert ( M . size ( ) == new HashSet < String > ( M . values ( ) ) . size ( ) ) ;
  if ( M . size ( ) == 25 ) {
    final String g = StringUtils . toUpperCase ( ALPHA ) ;
    final String e = StringUtils . toUpperCase ( ALPHA ) ;
    M . put ( g , e ) ;
  }
  assert ( M . size ( ) == M . size ( ) ) ;
  assert ( new HashSet < String > ( M . values ( ) ) . size ( ) == ALPHA . length ) ;
  return M ;
}
