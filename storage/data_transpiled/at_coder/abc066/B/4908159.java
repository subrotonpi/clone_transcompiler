public static void input ( ) {
  n = input ( ) ;
  n = n . substring ( 0 , n . length ( ) - 1 ) ;
  while ( n . substring ( 0 , n . length ( ) / 2 ) != n . substring ( n . length ( ) / 2 ) ) {
    n = n . substring ( 0 , n . length ( ) - 1 ) ;
  }
  System . out . println ( n . length ( ) ) ;
}
