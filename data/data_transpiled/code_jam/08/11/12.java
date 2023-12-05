static final Scanner scanner = new Scanner ( new File ( "/etc/scanner.txt" ) ) {
  private final Scanner fitr = new Scanner ( new FileInputStream ( "/etc/scanner.txt" ) ) ;
  for ( int testCase = 0 ;
  testCase < Integer . parseInt ( fitr . next ( ) ) ;
  ++ testCase ) {
    int size = Integer . parseInt ( fitr . next ( ) ) ;
    int [ ] a = new int [ size ] ;
    int [ ] b = new int [ size ] ;
    for ( int i = 0 ;
    i < size ;
    ++ i ) {
      a [ i ] = Integer . parseInt ( fitr . next ( ) ) ;
    }
    for ( int i = 0 ;
    i < size ;
    ++ i ) {
      b [ i ] = Integer . parseInt ( fitr . next ( ) ) ;
    }
    Arrays . sort ( a ) ;
    Arrays . sort ( b ) ;
    Arrays . reverse ( b ) ;
    int c = 0 ;
    for ( int i = 0 ;
    i <= size ;
    ++ i ) {
      c += a [ i ] * b [ i ] ;
    }
    System . out . printf ( "Case #%d: %d%n" , testCase + 1 , c ) ;
  }
  return fitr ;
}
