input ;
s = input ;
x = Integer . parseInt ( input . readLine ( ) ) ;
y = Integer . parseInt ( input . readLine ( ) ) ;
int sl [ ] = Arrays . stream ( s . split ( "T" ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
Map a = new HashMap ( 0 ) , b = new HashMap ( 0 ) ;
for ( int i = 2 ;
i < sl . length ;
i += 2 ) {
  if ( i == 0 ) continue ;
  Map b2 = new HashMap ( ) ;
  for ( int j = 0 ;
  j < b . size ( ) ;
  j ++ ) {
    b2 . put ( j + i , 1 ) ;
    b2 . put ( j - i , 1 ) ;
  }
  b = b2 ;
}
if ( a . containsKey ( x - sl [ 0 ] ) && b . containsKey ( y ) ) System . out . println ( "Yes" ) ;
else System . out . println ( "No" ) ;
}
