static final int [ ] accumulate ( int [ ] colors ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] color = new int [ 1000002 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    color [ a ] ++ ;
    color [ b + 1 ] -- ;
  }
  System . out . println ( max ( Collections . unmodifiableList ( Arrays . asList ( color ) ) ) ) ;
}
