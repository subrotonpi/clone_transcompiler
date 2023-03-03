static final String getScanner ( ) {
  System . setProperty ( "line.separator" , " " ) ;
  System . setProperty ( "line.separator" , " " ) ;
  final Function < Integer , Integer > readInts = input -> {
    int [ ] b = Ints . toByteArray ( input . nextLine ( ) . split ( " " ) ) ;
    return b ;
  }
  ;
  final Function < Integer , Integer > readInt = input ;
  for ( int noT : xrange ( 1 , readInt . nextInt ( ) + 1 ) ) {
    int b = readInts . apply ( b ) ;
    int n = b -- ;
    int [ ] a = readInts . apply ( b ) ;
    int lo = 0 , hi = 2 * 100 ;
    while ( lo + 1 < hi ) {
      int md = ( lo + hi ) / 2 ;
      int s = Integer . valueOf ( ( md + b - 1 ) / b ) ;
      if ( s <= n ) {
        lo = md ;
      }
      else {
        hi = md ;
      }
    }
    int already = Integer . valueOf ( ( lo + b - 1 ) / b ) ;
    int [ ] just = Arrays . copyOf ( a , a . length + 1 ) ;
    int ans = just [ n - already ] + 1 ;
    System . out . format ( "Case #%d: %s%n" , noT , ans ) ;
  }
  return new String ( a ) ;
}
