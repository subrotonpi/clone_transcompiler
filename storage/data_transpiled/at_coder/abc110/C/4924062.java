static String S = list ( input ) ;
String T = list ( input ) ;
/* Replace replacement */
Map < Character , Character > m = new HashMap < Character , Character > ( ) ;
int i = ( char ) 'A' ;
/* Replace replacement */
synchronized ( m ) {
  if ( ! m . containsKey ( c ) ) {
    m . put ( c , ( char ) i ++ ) ;
  }
}
