public static void main ( ) {
  X = Integer . parseInt ( input ( ) ) ;
  lists = new ArrayList < > ( ) ;
  int max = 1 ;
  for ( int i = 1 ;
  i <= X ;
  i ++ ) {
    for ( int j = 2 ;
    j <= X ;
    j ++ ) {
      if ( i * j <= X ) {
        if ( max < i * j ) {
          max = i * j ;
        }
      }
      else if ( i * j > X ) {
        break ;
      }
    }
  }
  System . out . println ( max ) ;
}
