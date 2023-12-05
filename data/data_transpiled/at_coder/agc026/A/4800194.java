public static void n ( ) {
  int n = Integer . parseInt ( input ( ) ) ;
  List < Integer > alist = Lists . newArrayList ( ) ;
  for ( int a : alist ) {
    if ( preva == null ) {
      preva = a ;
    }
    else {
      if ( preva == a ) {
        ans ++ ;
        preva = null ;
      }
      else {
        preva = a ;
      }
    }
  }
  System . out . println ( ans ) ;
}
