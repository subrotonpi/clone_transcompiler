static final void main ( String [ ] args ) {
  final Scanner input = new Scanner ( System . in ) ;
  final int s = input . nextInt ( ) ;
  final int len = input . nextInt ( ) ;
  int cur = ( int ) 'a' ;
  for ( int i = 0 ;
  i < len ;
  i ++ ) {
    if ( cur == ( int ) input . nextInt ( ) ) {
      cur = cur + 1 ;
    }
    else {
      System . out . println ( ( char ) cur ) ;
      exit ( ) ;
    }
  }
  if ( cur == ( int ) 'z' + 1 ) {
    System . out . println ( "null" ) ;
  }
  else {
    System . out . println ( ( char ) cur ) ;
  }
}
