public static String [ ] getNames ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  String [ ] name = new String [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    name [ i ] = input . nextLine ( ) ;
  }
  int max = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( max < name [ i ] ) {
      maxName = name [ i ] ;
      max = name [ i ] ;
    }
  }
  return name ;
}
