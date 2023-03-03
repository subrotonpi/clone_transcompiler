public static void main ( ) {
  N = Integer . parseInt ( input ( ) ) ;
  A = [ Integer . parseInt ( j ) for j in input ( ) . split ( " " ) ] ;
  A . sort ( ) ;
  System . out . println ( Math . abs ( A [ N - 1 ] - A [ 0 ] ) ) ;
}
