static final String input = "Input a number of characters in a string" ;
final IO IO IO = new IO ( ) {
  @ Override public Stream < String > ioStream ( ) {
    return input . lines ( ) ;
  }
  @ Override public int [ ] bbs ( String v ) {
    int [ ] s = new int [ v . length ( ) ] ;
    for ( int ci : Collections . list ( v . toCharArray ( ) ) ) s [ ci ] = Integer . parseInt ( ci ) ;
    return Arrays . stream ( s ) ;
  }
  @ Override public int [ ] main ( IO io ) {
    int n = Integer . parseInt ( io . toString ( ) ) ;
    int a = Integer . parseInt ( io . toString ( ) ) ;
    int b = Integer . parseInt ( io . toString ( ) ) ;
    return Arrays . stream ( 1 , n + 1 ) . filter ( x -> a <= bbs ( x ) && bbs ( x ) <= b ) . collect ( Collectors . joining ( ) ) ;
  }
}
