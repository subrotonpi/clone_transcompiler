public static int [ ] getN ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] count = new int [ N ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    count [ a - 1 ] ++ ;
    count [ b - 1 ] ++ ;
  }
  for ( int a : count ) {
    System . out . println ( a ) ;
  }
  return count ;
}
