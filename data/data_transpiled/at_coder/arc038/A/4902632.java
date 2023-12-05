public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > aa = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    aa . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  Collections . sort ( aa ) ;
  int score = aa . stream ( ) . filter ( i -> i % 2 == 0 ) . mapToInt ( a -> a ) . sum ( ) ;
  System . out . println ( score ) ;
}
