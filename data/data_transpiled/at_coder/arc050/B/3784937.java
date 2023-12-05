@ iipt public static int iipt ( ) {
  IntFunction miipt = ( IntFunction ) input -> Integer . parseInt ( input . nextLine ( ) ) ;
  final int R = miipt . nextInt ( ) ;
  final int B = miipt . nextInt ( ) ;
  final int x = miipt . nextInt ( ) ;
  final int y = miipt . nextInt ( ) ;
  int a = 0 ;
  int b = Math . min ( R , B ) + 1 ;
  if ( Math . min ( R , B ) > 1e18 ) {
    ++ a / 0 ;
  }
  while ( b - a > 1 ) {
    int c = ( a + b ) / 2 ;
    if ( c <= ( R - c ) / ( x - 1 ) + ( B - c ) / ( y - 1 ) ) {
      a = c ;
    }
    else {
      b = c ;
    }
  }
  System . out . println ( a ) ;
  return a ;
}
