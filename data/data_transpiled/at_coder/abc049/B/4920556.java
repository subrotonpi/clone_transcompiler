static final Scanner input = new Scanner ( System . in ) {
  final Scanner input = new Scanner ( System . in ) ;
  final int h = input . nextInt ( ) ;
  final int w = input . nextInt ( ) ;
  final List < String > pic = new LinkedList < > ( ) ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    pic . add ( input . next ( ) ) ;
  }
  for ( int i = 0 ;
  i < w ;
  i ++ ) {
    System . out . println ( pic . get ( i ) . charAt ( 0 ) ) ;
    System . out . println ( pic . get ( i ) . charAt ( 0 ) ) ;
  }
  return new Scanner ( System . in ) ;
}
