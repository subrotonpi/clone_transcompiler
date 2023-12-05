public static void N ( ) {
  String [ ] W = new String [ N ] ;
  Arrays . sort ( W ) ;
  Map < String , String > C = new HashMap < String , String > ( ) ;
  C . put ( "b" , "1" ) ;
  C . put ( "c" , "1" ) ;
  C . put ( "d" , "2" ) ;
  C . put ( "w" , "2" ) ;
  C . put ( "t" , "3" ) ;
  C . put ( "j" , "3" ) ;
  C . put ( "f" , "4" ) ;
  C . put ( "q" , "4" ) ;
  C . put ( "l" , "5" ) ;
  C . put ( "v" , "5" ) ;
  C . put ( "s" , "6" ) ;
  C . put ( "x" , "6" ) ;
  C . put ( "p" , "7" ) ;
  C . put ( "m" , "7" ) ;
  C . put ( "k" , "8" ) ;
  C . put ( "n" , "9" ) ;
  C . put ( "g" , "9" ) ;
  C . put ( "z" , "0" ) ;
  C . put ( "r" , "0" ) ;
  List < String > ans = new ArrayList < String > ( ) ;
  for ( String word : W ) {
    String tmp = "" " ; for ( String w : word . toLowerCase ( ) ) { if ( C . keySet ( ) . contains ( w ) ) { tmp += C . get ( w ) ; } } if ( tmp . length ( ) > 0 ) { ans . add ( tmp ) ; } } System . out . println ( Arrays . toString ( ans ) ) ; }