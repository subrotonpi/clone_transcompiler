public static String bMnemonics ( int N , String W ) {
  String [ ] words = W . replace ( "." , "" ) . toLowerCase ( ) . split ( " " ) ;
  Map < Character , String > translationMap = new HashMap < Character , String > ( ) ;
  translationMap . put ( 'b' , '1' ) ;
  translationMap . put ( 'c' , '1' ) ;
  translationMap . put ( 'd' , '2' ) ;
  translationMap . put ( 'w' , '2' ) ;
  translationMap . put ( 't' , '3' ) ;
  translationMap . put ( 'j' , '3' ) ;
  translationMap . put ( 'f' , '4' ) ;
  translationMap . put ( 'q' , '4' ) ;
  translationMap . put ( 'l' , '5' ) ;
  translationMap . put ( 'v' , '5' ) ;
  translationMap . put ( 's' , '6' ) ;
  translationMap . put ( 'x' , '6' ) ;
  translationMap . put ( 'p' , '7' ) ;
  translationMap . put ( 'm' , '7' ) ;
  translationMap . put ( 'k' , '8' ) ;
  translationMap . put ( 'n' , '9' ) ;
  translationMap . put ( 'm' , '9' ) ;
  return " " + ans ;
}
