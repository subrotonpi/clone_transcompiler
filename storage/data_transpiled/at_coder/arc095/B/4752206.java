public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  ArrayList < Integer > alist = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    alist . add ( i ) ;
  }
  int maxa = alist . get ( alist . size ( ) - 1 ) ;
  int mina = maxa / 2 ;
  int a2 = mina ;
  for ( int a : alist ) {
    if ( Math . abs ( halfa - a2 ) > Math . abs ( halfa - a ) ) {
      a2 = a ;
    }
  }
  System . out . println ( maxa + " " + a2 ) ;
}
