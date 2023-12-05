static final String getMain ( ) {
  final BufferedReader ssr = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  final BufferedWriter ssw = new BufferedWriter ( new OutputStreamWriter ( System . out ) ) ;
  final String csline = ssr . readLine ( ) . trim ( ) ;
  final String csstrs = ssr . split ( " " ) ;
  final int [ ] rdints = ArrayUtil . toIntArray ( csline ) ;
  String A = "a zoo" + " our language is impossible to understand" + " there are twenty six factorial possibilities" + " so it is okay if you want to just give up" ;
  String B = "y qee" + " ejp mysljylc kd kxveddknmc re jsicpdrysi" + " rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd" + " de kr kd eoya kw aej tysr re ujdr lkgc jv" ;
  final HashMap < Character , String > map = new HashMap < Character , String > ( ) ;
  final HashMap < Character , String > e = new HashMap < Character , String > ( ) ;
  int len = A . length ( ) ;
  assert len == B . length ( ) ;
  final Iterator < Character > iter = A . iterator ( ) ;
  while ( iter . hasNext ( ) ) {
    final char c1 = iter . next ( ) ;
    final char c2 = iter . next ( ) ;
    if ( e . containsKey ( c1 ) ) assert e . get ( c1 ) . equals ( c2 ) ;
    else e . put ( c1 , c2 ) ;
    if ( map . containsKey ( c2 ) ) assert map . get ( c2 ) . equals ( c1 ) ;
    else map . put ( c2 , c1 ) ;
  }
  String nod = "" ;
  String noe = "" ;
  for ( int cc = 97 ;
  cc <= 97 ;
  cc ++ ) {
    char c = ( char ) cc ;
    if ( ! map . containsKey ( c ) ) nod += c ;
    if ( ! map . containsKey ( c ) ) noe += c ;
  }
  assert nod . length ( ) == len ;
  assert noe . length ( ) <= 1 ;
  