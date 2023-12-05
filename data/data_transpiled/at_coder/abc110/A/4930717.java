public static < A , B , C > void main ( String input ) {
  List < A > l = map ( input . split ( ) ) ;
  l = new ArrayList < > ( Arrays . asList ( A , B , C ) ) ;
  System . out . println ( l . get ( 0 ) + l . get ( 1 ) + l . get ( 2 ) * 10 ) ;
}
