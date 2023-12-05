public static int [ ] getSortedList ( ) {
  N = Integer . parseInt ( input . nextLine ( ) ) ;
  s = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) s [ i ] = input . nextInt ( ) ;
  M = Integer . parseInt ( input . nextLine ( ) ) ;
  t = new int [ M ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) t [ i ] = input . nextInt ( ) ;
  st = new LinkedList < Integer > ( ) ;
  return st ;
}
