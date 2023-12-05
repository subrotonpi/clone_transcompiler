static final String [ ] S = new String [ ] {
}
;
String S1 = Arrays . toString ( S ) ;
String T = Arrays . toString ( S ) ;
String T1 = Arrays . toString ( T ) ;
String F [ ] = new String [ T . length ( ) ] ;
String F1 = Arrays . toString ( F ) ;
List < String > l = new ArrayList < String > ( ) ;
List < String > M = new ArrayList < String > ( ) ;
List < Integer > index = new ArrayList < Integer > ( ) ;
StringBuilder B = new StringBuilder ( S ) ;
for ( int i = 0 ;
i < S . length - T . length ( ) + 1 ;
i ++ ) {
  StringBuilder A = new StringBuilder ( S ) ;
  StringBuilder c = new StringBuilder ( A ) ;
  while ( c . length ( ) > 0 ) {
    c . append ( "?" ) ;
  }
  if ( c . equals ( T ) ) {
    A = new StringBuilder ( S ) ;
    A . append ( c ) ;
    while ( A . length ( ) > 0 ) {
      A . append ( "a" ) ;
    }
    M . add ( A ) ;
  }
}
if ( 0 < M . size ( ) ) {
  Collections . sort ( M ) ;
  System . out . println ( Arrays . toString ( M . toArray ( ) ) ) ;
}
else {
  System . out . println ( "UNRESTORABLE" ) ;
}
return l . toArray ( ) ;
}
