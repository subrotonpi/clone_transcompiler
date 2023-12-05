public static void main ( String A , String B , String C ) {
  List < String > l = input . split ( " " ) ;
  l = new ArrayList < String > ( Arrays . asList ( A , B , C ) ) ;
  l . sort ( ) ;
  System . out . println ( Integer . parseInt ( l . get ( 0 ) + l . get ( 1 ) ) + Integer . parseInt ( l . get ( l . size ( ) - 1 ) ) ) ;
}
