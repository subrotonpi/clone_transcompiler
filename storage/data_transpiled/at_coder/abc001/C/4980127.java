public static String a = list ( map . get ( ) ) ;
String res0 ;
String res1 = "" ;
if ( a . length ( ) < 15 ) {
  res0 = "0" ;
}
else if ( a . length ( ) < 93 ) {
  res0 = "1" ;
}
else if ( a . length ( ) < 201 ) {
  res0 = "2" ;
}
else if ( a . length ( ) < 327 ) {
  res0 = "3" ;
}
else if ( a . length ( ) < 477 ) {
  res1 = "4" ;
}
else if ( a . length ( ) < 645 ) {
  res1 = "5" ;
}
else if ( a . length ( ) < 831 ) {
  res1 = "6" ;
}
else if ( a . length ( ) < 1029 ) {
  res1 = "7" ;
}
else if ( a . length ( ) < 1245 ) {
  res1 = "8" ;
}
else if ( a . length ( ) < 1467 ) {
  res1 = "9" ;
}
else if ( a . length ( ) < 1707 ) {
  res1 = "10" ;
}
else if ( a . length ( ) < 1959 ) {
  res1 = "11" ;
}
else {
  res1 = "12" ;
}
if ( res1 . equals ( "0" ) ) {
  res0 = "C" ;
}
else if ( a . length ( ) >= 1687.5 && a . length ( ) < 1912.5 ) {
  res0 = "S" ;
}
else if ( a . length ( ) >= 112.5 && a . length ( ) < 337.5 ) {
  res0 = "NNE" ;
}
else if ( a . length ( ) >= 1912.5 && a . length ( ) < 2137.5 ) {
  res0 = "SSW" ;
}
else if ( a . length ( ) >= 337.5 && a . length ( ) < 562.5 ) {
  res0 = "NE" ;
}
else if ( a . length ( ) >= 2137.5 && a . length ( ) < 2362.5 ) {
  res0 = "SW" ;
}
else if ( a . length ( ) >= 562.5 && a . length ( ) < 787.5 ) {
  res0 = "ENE" ;
}
else if ( a . length ( ) >= 2362.5 && a . length ( ) < 2587.5 ) {
  res0 = "WSW" ;
}
else if ( a . length ( ) >= 1012.5 ) {
  res0 = "E" ;
}
return