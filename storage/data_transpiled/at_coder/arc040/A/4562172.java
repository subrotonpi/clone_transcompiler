public static int c = 0 ;
for ( int i = 0 ;
i < Integer . parseInt ( input ) ;
i ++ ) {
  String s = input . next ( ) ;
  c += s . indexOf ( "R" ) - s . indexOf ( "B" ) ;
}
return c ;
}
