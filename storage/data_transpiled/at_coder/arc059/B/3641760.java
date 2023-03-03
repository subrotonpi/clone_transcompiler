static final LinkedHashMap < String , Integer > S = input ( ) ;
if ( S . size ( ) == 1 ) {
  System . out . println ( - 1 + ",-1" ) ;
  exit ( ) ;
}
String tmp_s1 = "1" ;
String tmp_s2 = "2" ;
String tmp_s3 = "3" ;
for ( int i = 0 ;
i < S . size ( ) ;
i ++ ) {
  switch ( S . get ( i ) ) {
    case 0 : tmp_s1 = S . get ( i ) ;
    break ;
    case 1 : tmp_s2 = S . get ( i ) ;
    break ;
    case 3 : tmp_s3 = S . get ( i ) ;
    break ;
  }
}
return new LinkedHashMap < > ( ) ;
}
