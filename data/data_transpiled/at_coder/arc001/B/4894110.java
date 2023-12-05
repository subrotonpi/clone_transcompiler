public static void main ( String [ ] args ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  char [ ] cs = new char [ N ] ;
  for ( int i = 1 ;
  i <= 5 ;
  i ++ ) {
    cs [ i ] = Character . getNumericValue ( input . nextLine ( ) ) ;
  }
  Map < Integer , Integer > result = new HashMap < > ( ) ;
  for ( int i = 1 ;
  i <= 5 ;
  i ++ ) {
    result . put ( i , 0 ) ;
  }
  for ( char c : cs ) {
    int i = Integer . parseInt ( c ) ;
    result . put ( i , ++ i ) ;
  }
  List < Integer > sortedResultValues = new ArrayList < > ( result . values ( ) ) ;
  Collections . sort ( sortedResultValues ) ;
  System . out . println ( sortedResultValues . get ( sortedResultValues . size ( ) - 1 ) + " " + sortedResultValues . get ( 0 ) ) ;
}
