public static String m = input . next ( ) ;
String VV ;
if ( m < 100 ) {
  VV = "00" ;
}
else if ( m < 1000 ) {
  VV = "0" + String . valueOf ( m / 100 ) ;
}
else if ( m <= 5000 ) {
  VV = String . valueOf ( m / 100 ) + 50 ;
}
else if ( m <= 70000 ) {
  VV = "89" ;
}
return VV . substring ( 0 , 2 ) ;
}
