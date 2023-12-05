public static int [ ] getNegativeInstances ( ) {
  String s = input ( ) ;
  int [ ] ans = new int [ s . length ( ) - 2 ] ;
  for ( int i = 0 ;
  i < ans . length ;
  i ++ ) {
    ans [ i ] = Math . abs ( Integer . parseInt ( s . substring ( i , i + 3 ) ) - 753 ) ;
  }
  System . out . println ( min ( ans ) ) ;
  return ans ;
}
