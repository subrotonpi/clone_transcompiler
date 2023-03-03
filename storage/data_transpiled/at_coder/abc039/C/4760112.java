public static String input ( ) {
  String S = input ( ) ;
  Map < String , String > map = new HashMap < String , String > ( ) ;
  map . put ( "WBWBWBWBWBWBW" , "Do" ) ;
  map . put ( "WBWBWBWBWBWBWBWB" , "Re" ) ;
  map . put ( "WBWBWBWBWBWBWB" , "Mi" ) ;
  map . put ( "WBWBWBWBWBWBW" , "Fa" ) ;
  map . put ( "WBWBWBWBWBWBWBWBWBWB" , "So" ) ;
  map . put ( "WBWBWBWBWBWBWBWBWBWB" , "La" ) ;
  map . put ( "WBWBWBWBWBWBWBWBWBWBWBWB" , "Si" ) ;
  System . out . println ( map . get ( S . substring ( 0 , 12 ) ) ) ;
  return S ;
}
