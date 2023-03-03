@ MoreRequires public static void main ( String [ ] args ) {
  final List < String > O = new LinkedList < > ( ) ;
  for ( int i = 0 ;
  i < input . length ;
  i ++ ) {
    O . add ( input . charAt ( i ) ) ;
  }
  final List < String > E = new LinkedList < > ( ) ;
  for ( int i = 0 ;
  i < input . length ;
  i ++ ) {
    E . add ( input . charAt ( i ) ) ;
  }
  StringBuilder ans = new StringBuilder ( ) ;
  for ( int i = 0 ;
  i < E . size ( ) ;
  i ++ ) {
    ans . append ( O . get ( i ) ) ;
    ans . append ( E . get ( i ) ) ;
  }
  if ( ( O . size ( ) > E . size ( ) ) && ( O . size ( ) > 0 ) ) {
    ans . append ( O . get ( O . size ( ) - 1 ) ) ;
  }
  System . out . println ( ans . toString ( ) ) ;
}
