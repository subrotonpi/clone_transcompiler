public static String input ( ) {
  String s = list ( input ) ;
  List < String > alpha = Arrays . asList ( "a" , "b" , "c" , "d" , "e" , "f" , "g" , "h" , "i" , "j" , "k" , "l" , "m" , "n" , "o" , "p" , "q" , "r" , "s" , "t" , "u" , "v" , "w" , "x" , "y" , "z" ) ;
  for ( String s : s ) {
    if ( alpha . contains ( s ) ) alpha . remove ( s ) ;
  }
  return alpha . size ( ) > 0 ? alpha . get ( 0 ) : "None" ;
}
