public static String S = input ( ) ;
int k = Integer . parseInt ( input ( ) ) ;
for ( int i = 0 ;
i < k ;
i ++ ) {
  if ( S . charAt ( i ) != "1" ) {
    System . out . println ( S . charAt ( i ) ) ;
    exit ( ) ;
  }
}
System . out . println ( "1" ) ;
return "1" ;
}
