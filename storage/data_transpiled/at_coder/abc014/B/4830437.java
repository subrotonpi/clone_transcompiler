, n ) ;
a = list ( map ( Integer . parseInt , input ) ) ;
String y = format ( x , "b" ) ;
int len = y . length ( ) ;
int res = 0 ;
for ( int i = 0 ;
i < len ;
i ++ ) {
  if ( y . equals ( "1" ) ) {
    res += a . get ( i ) ;
  }
}
System . out . println ( res ) ;
}
