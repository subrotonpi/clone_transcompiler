static final Scanner fin = new Scanner ( System . in ) {
  int tc = Integer . parseInt ( fin . nextLine ( ) ) ;
  {
    int ans = 0 ;
    Map < String , Integer > cur = dirs ;
    for ( String d : seq ) {
      if ( ! cur . containsKey ( d ) ) {
        cur . put ( d , new Integer ( ++ ans ) ) ;
      }
      cur = cur . get ( d ) ;
    }
    return ans ;
  }
}
