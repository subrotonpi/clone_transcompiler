public static double a = 0 ;
for ( int i = 0 ;
i < Integer . parseInt ( input ) ;
i ++ ) {
  String v = input . nextLine ( ) ;
  String u = input . nextLine ( ) ;
  if ( u . equals ( "JPY" ) ) {
    a += Integer . parseInt ( v ) ;
  }
  else {
    a += Double . parseDouble ( v ) * 380000 ;
  }
}
return a ;
}
