public static void main ( String [ ] args ) {
  int n = input . nextInt ( ) ;
  ArrayList < Integer > a = new ArrayList < > ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a . add ( i ) ;
  }
  int ai = Collections . max ( a ) ;
  a . remove ( ai ) ;
  int aj = Integer . MAX_VALUE ;
  int tmp = Integer . MIN_VALUE ;
  for ( int aa : a ) {
    int diff = Math . abs ( ai / 2 - aa ) ;
    if ( diff < tmp ) {
      tmp = diff ;
      aj = aa ;
    }
  }
  System . out . println ( ai + " " + aj ) ;
}
