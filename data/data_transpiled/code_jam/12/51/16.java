static final String solve ( ) {
  final Scanner input = new Scanner ( System . in ) ;
  final int T = input . nextInt ( ) ;
  final String [ ] split = input . nextLine ( ) . split ( "\\s+" ) ;
  final int [ ] L = split ( Integer . parseInt ( split [ 0 ] ) ) ;
  final int [ ] P = split ( Integer . parseInt ( split [ 1 ] ) ) ;
  final Comparator < Integer > cmp = new Comparator < Integer > ( ) {
    @ Override public int compare ( Integer i1 , Integer i2 ) {
      if ( i1 . intValue ( ) != i2 . intValue ( ) ) {
        return i1 . intValue ( ) > i2 . intValue ( ) ? - 1 : 1 ;
      }
      else if ( i1 . intValue ( ) != i2 . intValue ( ) ) {
        return i1 . intValue ( ) > i2 . intValue ( ) ? - 1 : 1 ;
      }
      return i1 . intValue ( ) < i2 . intValue ( ) ? - 1 : 1 ;
    }
  }
  ;
  final List < String > items = new ArrayList < String > ( Arrays . asList ( L , P ) ) ;
  items . sort ( cmp ) ;
  return StringUtils . join ( items , " " ) ;
}
