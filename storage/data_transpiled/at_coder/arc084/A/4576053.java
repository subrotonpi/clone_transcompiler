static final int binarySearch ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > alist = Lists . newArrayList ( ) ;
  List < Integer > blist = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    alist . add ( i ) ;
  }
  List < Integer > clist = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int ai = Arrays . binarySearch ( alist . get ( i ) , b ) ;
    int ci = Arrays . binarySearch ( clist . get ( i ) , b ) ;
    if ( ai == 0 || ci == clist . size ( ) ) {
      continue ;
    }
    else {
      ans += ai * ( clist . size ( ) - ci ) ;
    }
  }
  System . out . println ( ans ) ;
  return 0 ;
}
