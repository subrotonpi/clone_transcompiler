public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int keta = String . valueOf ( n ) . length ( ) ;
  List < Integer > li = new ArrayList < > ( ) ;
  for ( int i = 1 ;
  i <= 9 * keta ;
  i ++ ) {
    int x = n - i ;
    if ( f ( x ) == i ) {
      li . add ( x ) ;
    }
  }
  Collections . sort ( li ) ;
}
