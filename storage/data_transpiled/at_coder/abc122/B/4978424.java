public static String S = String . valueOf ( input ) ;
int counter = 0 ;
int max = 0 ;
for ( int i = 0 ;
i < S . length ( ) ;
i ++ ) {
  switch ( S . charAt ( i ) ) {
    case 'A' : case 'T' : case 'C' : case 'G' : counter ++ ;
    if ( counter >= max ) max = counter ;
  }
  else counter = 0 ;
}
System . out . println ( max ) ;
return null ;
}
