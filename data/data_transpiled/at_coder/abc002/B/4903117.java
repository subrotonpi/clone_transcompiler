public static int mi ( int s ) {
  return s - 1 ;
}
String t = input . next ( ) ;
StringBuilder k = new StringBuilder ( t ) ;
StringBuilder b = new StringBuilder ( ) ;
for ( int i = 0 ;
i < k . length ( ) ;
i ++ ) {
  k . delete ( b . length ( ) ) ;
  b . delete ( 0 ) ;
}
