public static void main ( ) {
  String s [ ] = input . nextLine ( ) . split ( " " ) ;
  Set < String > mySet = new HashSet < String > ( ) ;
  mySet . add ( s [ 0 ] ) ;
  mySet . add ( s [ 1 ] ) ;
  mySet . add ( s [ 2 ] ) ;
  int m = mySet . size ( ) ;
  System . out . println ( m ) ;
}
