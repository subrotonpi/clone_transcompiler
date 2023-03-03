public static void N ( int N ) {
  String [ ] W = input . nextLine ( ) . toLowerCase ( ) . split ( "\\s+" ) ;
  Map < String , String > convert_d = new HashMap < String , String > ( ) ;
  convert_d . put ( "b" , "1" ) ;
  convert_d . put ( "c" , "1" ) ;
  convert_d . put ( "d" , "2" ) ;
  convert_d . put ( "w" , "2" ) ;
  convert_d . put ( "t" , "3" ) ;
  convert_d . put ( "j" , "3" ) ;
  convert_d . put ( "f" , "4" ) ;
  convert_d . put ( "q" , "4" ) ;
  convert_d . put ( "l" , "5" ) ;
  convert_d . put ( "x" , "5" ) ;
  convert_d . put ( "v" , "5" ) ;
  convert_d . put ( "s" , "5" ) ;
  convert_d . put ( "x" , "5" ) ;
  convert_d . put ( "s" , "5" ) ;
  convert_d . put ( "x" , "6" ) ;
  convert_d . put ( "x" , "6" ) ;
  convert_d . put ( "y" , "7" ) ;
  convert_d . put ( "y" , "8" ) ;
  convert_d . put ( "z" , "8" ) ;
  convert_d . put ( "n" , "9" ) ;
  convert_d . put ( "g" , "9" ) ;
  convert_d . put ( "z" , "0" ) ;
  convert_d . put ( "z" , "0" ) ;
  convert_d . put ( "r" , "0" ) ;
  String t = "" " ; for ( int i = 0 ; i < W . length ; i ++ ) { String l = convert_d . get ( i ) ; if ( i > i ) { t += convert_d . get ( i ) ; } } System . out . println ( t . substring ( 0 , t . length ( ) - 1 ) ) ; }