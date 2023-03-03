static final int N = Integer . parseInt ( input ) {
  int [ ] A = list ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  Counter < Integer > counter = new ClassicCounter < Integer > ( A ) ;
  int ans = 0 ;
  for ( Map . Entry < Integer , Integer > entry : counter . entrySet ( ) ) {
    ans += entry . getValue ( ) < entry . getKey ( ) ? entry . getValue ( ) : entry . getValue ( ) - entry . getKey ( ) ;
  }
  System . out . println ( ans ) ;
}
