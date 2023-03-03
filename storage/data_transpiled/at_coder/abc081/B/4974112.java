public static int N = Integer . parseInt ( input ) {
  List < Integer > s = Lists . newArrayList ( ) ;
  for ( String s : input . split ( " " ) ) {
    s . add ( Integer . parseInt ( s . get ( 0 ) ) ) ;
  }
  int c = 0 ;
  int kaisu = 1000 ;
  for ( Integer x : s ) {
    while ( x % 2 == 0 ) {
      c = c + 1 ;
      x = x / 2 ;
    }
    if ( kaisu >= c ) kaisu = c ;
    c = 0 ;
  }
  return kaisu ;
}
