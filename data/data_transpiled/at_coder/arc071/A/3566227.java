static String [ ] s = new String [ Integer . MAX_VALUE ] ;
for ( int i = 0 ;
i < s . length ;
i ++ ) {
  s [ i ] = input . next ( ) ;
}
String w = "" ;
for ( int i = 97 ;
i <= 97 + 26 ;
i ++ ) {
  char x = ( char ) i ;
  int [ ] a = new int [ s . length ] ;
  for ( int t = 0 ;
  t < s . length ;
  t ++ ) {
    a [ t ] = s [ t ] . indexOf ( x ) ;
  }
  w += x * Math . min ( a , s . length ) ;
}
System . out . println ( w ) ;
return s ;
}
