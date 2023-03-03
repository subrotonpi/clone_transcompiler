public static String N = Integer . parseInt ( input ) ;
String ans = "" ;
while ( ( N != 0 ) && ( ans . length ( ) != 0 ) ) {
  if ( N % 2 != 0 ) {
    N -- ;
    ans = "1" + ans ;
  }
  else {
    ans = "0" + ans ;
  }
  N = ( int ) ( N / - 2 ) ;
}
if ( ans . equals ( "" ) ) {
  System . out . println ( "0" ) ;
}
else {
  System . out . println ( ans ) ;
}
return ans ;
}
