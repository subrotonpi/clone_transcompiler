public static List < Integer > createRow ( int S , int E ) {
  List < Integer > list = new ArrayList < Integer > ( ) ;
  int start = S ;
  while ( start <= E ) {
    list . add ( start ) ;
    start += start ;
  }
  return list ;
}
