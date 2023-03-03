public static int count = 0 ;
char c = input . charAt ( 0 ) ;
String vowelList = "aiueo" ;
for ( int i = 0 ;
i < 5 ;
i ++ ) {
  if ( c == vowelList . charAt ( i ) ) {
    count ++ ;
  }
}
if ( count == 1 ) {
  System . out . println ( "vowel" ) ;
}
else {
  System . out . println ( "consonant" ) ;
}
return count ;
}
