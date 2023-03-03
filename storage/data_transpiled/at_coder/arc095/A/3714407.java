public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] array = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    array [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] newarray = new int [ n ] ;
  Arrays . sort ( array ) ;
  Map < Integer , Integer > ans = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int xx = newarray [ i ] ;
    if ( i + 1 <= n / 2 ) {
      ans . put ( xx , newarray [ n / 2 ] ) ;
    }
    else {
      ans . put ( xx , newarray [ n / 2 - 1 ] ) ;
    }
  }
  for ( int xx : array ) {
    System . out . println ( ans . get ( xx ) ) ;
  }
  if ( getClass ( ) . isClassPresent ) {
    Main . main ( args ) ;
  }
}
