private static List < Integer > S = list ( String . valueOf ( input ) ) ;
List < Integer > T = list ( String . valueOf ( input ) ) ;
String moji = "abcdefghijklmnopqrstuvwxyz" ;
List < Integer > tmp_1 = new ArrayList < Integer > ( ) ;
List < Integer > tmp_2 = new ArrayList < Integer > ( ) ;
for ( int i = 0 ;
i < 26 ;
i ++ ) {
  int count = S . indexOf ( moji . charAt ( i ) ) ;
  tmp_1 . add ( count ) ;
}
for ( int i = 0 ;
i < 26 ;
i ++ ) {
  int count = T . indexOf ( moji . charAt ( i ) ) ;
  tmp_2 . add ( count ) ;
}
Collections . sort ( tmp_1 ) ;
Collections . sort ( tmp_2 ) ;
if ( tmp_1 . equals ( tmp_2 ) ) {
  System . out . println ( "Yes" ) ;
}
else {
  System . out . println ( "No" ) ;
}
return S ;
}
