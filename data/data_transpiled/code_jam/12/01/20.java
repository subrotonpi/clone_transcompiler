static final String getWordString ( ) {
  String sampin = "y qee ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv" ;
  String sampout = "a zoo our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up" ;
  String chars = " abcdefghijklmnopqrstuvwxyz" ;
  Map < Integer , String > m = new HashMap < Integer , String > ( ) ;
  Set < Integer > ileft = new HashSet < Integer > ( chars ) ;
  Set < Integer > oleft = new HashSet < Integer > ( chars ) ;
  for ( int i = 0 ;
  i < sampin . length ( ) ;
  i ++ ) {
    String i = sampin . substring ( i , i + 1 ) ;
    String o = sampout . substring ( i , i + 1 ) ;
    m . put ( i , o ) ;
    ileft . remove ( i ) ;
    oleft . remove ( o ) ;
  }
  Integer ilast = Collections . singleton ( ileft ) . get ( 0 ) ;
  Integer olast = Collections . singleton ( oleft ) . get ( 0 ) ;
  m . put ( ilast , olast ) ;
  int T = Integer . parseInt ( scanner . nextLine ( ) ) ;
  for ( int t = 1 ;
  t <= T ;
  t ++ ) {
    String line = scanner . nextLine ( ) ;
    System . out . println ( "Case #" + t + ": " + StringUtils . leftPad ( line , 2 , ' ' ) ) ;
  }
  return m . get ( ilast ) ;
}
