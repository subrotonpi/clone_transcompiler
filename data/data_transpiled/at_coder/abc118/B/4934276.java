public static int [ ] getMatchingValues ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] res = new int [ m ] ;
  for ( ;
  ;
  ) {
    final int [ ] o = Integer . parseInt ( input . nextLine ( ) ) ;
    for ( int x : o ) {
      res [ x - 1 ] ++ ;
    }
  }
  int ans = res . length ;
  System . out . println ( ans ) ;
  return res ;
}
