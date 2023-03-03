public static void input ( ) {
  n = input . nextInt ( ) ;
  a = new int [ n . length - 2 ] ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    a [ i ] = Math . abs ( Integer . parseInt ( n . substring ( i , i + 3 ) ) - 753 ) ;
  }
  System . out . println ( min ( a ) ) ;
}
