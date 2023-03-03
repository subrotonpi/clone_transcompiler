public static String input ( ) {
  String s = input ( ) + " " ;
  List < Integer > num = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( num . contains ( i ) ) {
      t += "\" " ; } t += s . charAt ( i ) ; } return t . substring ( 0 , t . length ( ) - 1 ) ; }