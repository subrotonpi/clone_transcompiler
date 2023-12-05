public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > alist = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) alist . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  int maxa = Collections . max ( alist ) , mina = Collections . min ( alist ) ;
  List < Integer > ans = new ArrayList < Integer > ( ) ;
  if ( Math . abs ( maxa ) >= Math . abs ( mina ) ) {
    int p = alist . indexOf ( maxa ) + 1 ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      alist . set ( i , maxa ) ;
      ans . add ( new Integer ( p ) ) ;
    }
    for ( int i = 0 ;
    i < n - 1 ;
    i ++ ) {
      alist . set ( i + 1 , alist . get ( i ) ) ;
      ans . add ( new Integer ( i + 1 ) ) ;
      ans . add ( new Integer ( i + 2 ) ) ;
    }
  }
  else {
    int p = alist . indexOf ( mina ) + 1 ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      alist . set ( i , mina ) ;
      ans . add ( new Integer ( p ) ) ;
    }
    for ( int i = n - 2 ;
    i >= 0 ;
    i -- ) {
      alist . set ( i , alist . get ( i + 1 ) ) ;
      ans . add ( new Integer ( i + 2 ) ) ;
    }
  }
  System . out . println ( ans . size ( ) ) ;
  for ( Integer a : ans ) {
    System . out . println ( ( Integer ) a ) ;
  }
}
