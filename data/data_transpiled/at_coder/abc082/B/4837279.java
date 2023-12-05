public static void print ( String s ) {
  String t = input ( ) ;
  s = new TreeSet ( s ) ;
  t = new TreeSet ( t ) . toString ( ) . substring ( 0 , t . length ( ) - 1 ) ;
  System . out . println ( s < t ? 'Yes' : 'No' ) ;
}
