public static void main ( String input ) {
  final Set < String > a = new HashSet < > ( input . split ( " " ) ) ;
  final Set < String > b = new HashSet < > ( input . split ( " " ) ) ;
  System . out . println ( len ( a & b ) / len ( a | b ) ) ;
}
