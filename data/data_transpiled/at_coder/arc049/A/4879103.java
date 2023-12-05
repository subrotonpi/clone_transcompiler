public static void main ( String [ ] args ) {
  String s = input ( ) ;
  int a = Integer . parseInt ( input ( ) ) ;
  int b = Integer . parseInt ( input ( ) ) ;
  int c = Integer . parseInt ( input ( ) ) ;
  int d = Integer . parseInt ( input ( ) ) ;
  StringBuilder l = new StringBuilder ( ) ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    l . insert ( d , '\' ');l.insert(c,' \ '' ) ;
    l . insert ( b , '\' ');l.insert(a,' \ '' ) ;
    System . out . println ( l . toString ( ) ) ;
  }
  if ( getClass ( ) . equals ( String . class ) ) {
    main ( ) ;
  }
}
