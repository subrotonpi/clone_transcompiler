public static List < String > convert ( String input ) {
  int N = Integer . parseInt ( input ) ;
  List < String > a = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a . add ( input ) ;
  }
  Map < Integer , Integer > r = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    r . put ( i , i ) ;
  }
  List < String > s = new ArrayList < > ( ) ;
  for ( String n : a ) {
    int x = 0 ;
    for ( char c : n . toCharArray ( ) ) {
      x *= 10 ;
      x += r . get ( ( int ) c ) ;
    }
    s . add ( Integer . toString ( x ) . replaceAll ( " " , "" ) ) ;
  }
  Collections . sort ( s ) ;
  for ( String n : s ) {
    int x = 0 ;
    for ( char c : n . toCharArray ( ) ) {
      x *= 10 ;
      x += b . get ( ( int ) c ) ;
    }
    System . out . println ( x ) ;
  }
  return s ;
}
