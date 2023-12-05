public static List < Integer > convert ( String input ) {
  List < Integer > a = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < 3 ;
  i ++ ) {
    a . add ( i ) ;
  }
  Collections . sort ( a ) ;
  List < Integer > aa = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < 3 ;
  i ++ ) {
    aa . add ( i ) ;
  }
  return aa ;
}
