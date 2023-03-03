public static String c_1 = String . valueOf ( input ) ;
String c_2 = String . valueOf ( input ) ;
String tmp = c_1 . substring ( 2 ) + c_1 . substring ( 1 ) + c_1 . substring ( 0 ) ;
if ( tmp . equals ( c_2 ) ) {
  System . out . println ( "YES" ) ;
}
else {
  System . out . println ( "NO" ) ;
}
return tmp ;
}
