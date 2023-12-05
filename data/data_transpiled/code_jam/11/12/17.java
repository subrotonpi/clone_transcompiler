@ WrapFunction public static String [ ] [ ] findAll ( String str , String substr ) {
  List < String > out = new ArrayList < String > ( ) ;
  int last = str . indexOf ( substr ) ;
  while ( last != - 1 ) {
    out . add ( last ) ;
    last = str . indexOf ( substr , last + 1 ) ;
  }
  return out . toArray ( new String [ 0 ] [ ] ) ;
}
