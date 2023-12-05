static final LinkedHashMap < String , Integer > getCounts ( ) {
  String s = input . next ( ) ;
  int n = s . length ( ) ;
  Counter < String > c = new ClassicCounter < String > ( ) ;
  c . addAll ( s ) ;
  int k = 0 ;
  for ( String s : c . values ( ) ) {
    k += s . length ( ) % 2 ;
  }
  if ( k == 0 ) {
    System . out . println ( n ) ;
  }
  else {
    System . out . println ( ( ( n - k ) / 2 ) / k * 2 + 1 ) ;
  }
  return new LinkedHashMap < String , Integer > ( ) ;
}
