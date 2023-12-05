public static void input ( ) {
  String x = input ( ) ;
  List S = list ( input ( ) ) ;
  List A = new ArrayList ( ) ;
  x = x . charAt ( 0 ) ;
  for ( String s : S ) {
    if ( s != x ) A . add ( s ) ;
  }
  System . out . println ( A . toString ( ) + "" ) ;
}
