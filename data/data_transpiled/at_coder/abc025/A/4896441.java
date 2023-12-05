static final int [ ] getSummarizer ( ) {
  final List < String > s = new LinkedList < > ( ) ;
  s . add ( input . nextLine ( ) ) ;
  final int n = Integer . parseInt ( input . nextLine ( ) ) ;
  final int a = Math . floor ( n / 5 ) ;
  final int b = n % 5 ;
  if ( a != 0 && b != 0 ) {
    System . out . println ( s . get ( a ) + s . get ( b - 1 ) ) ;
  }
  else if ( a == 0 && b != 0 ) {
    System . out . println ( s . get ( a ) + s . get ( b - 1 ) ) ;
  }
  else if ( a != 0 && b == 0 ) {
    System . out . println ( s . get ( a - 1 ) + s . get ( b + 4 ) ) ;
  }
  else {
    System . out . println ( s . get ( a ) + s . get ( b ) ) ;
  }
  return s . toArray ( new String [ s . size ( ) ] ) ;
}
