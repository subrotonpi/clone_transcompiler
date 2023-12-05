static final Scanner getScanner ( final Scanner in , final String s ) {
  final Scanner scanner = new Scanner ( in ) ;
  final String input = in . next ( ) . trim ( ) ;
  final int s = Integer . parseInt ( input ) ;
  final int n = scanner . nextInt ( ) ;
  int nn = scanner . nextInt ( ) ;
  if ( n >= A && n <= B ) {
    res += aux ( A , B , String . valueOf ( s ) , s + 2 * c ) ;
  }
  return scanner ;
}
