@ inFile ( "C-large.in" ) public static String inFile = "C-large.in" ;
boolean debug = true ;
/* PatrickAdd L */
return Stream . iterate ( 0 , L ) . filter ( a -> a ^ b ) . map ( a -> a ) . flatMap ( b -> Stream . iterate ( 0 , b -> a ^ b ) ) . map ( a -> a ) . map ( b -> b ) . map ( a -> a ) . orElse ( "NO" ) ;
}
