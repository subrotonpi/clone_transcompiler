static final int input ( ) {
  int num = Integer . parseInt ( input ( ) ) ;
  List < Integer > arr = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < num ;
  i ++ ) {
    arr . add ( i ) ;
  }
  List < Integer > arr_new = new ArrayList < > ( arr ) ;
  arr_new . sort ( ) ;
  int ans = 0 ;
  int index = 0 ;
  for ( int i = 0 ;
  i < num / 2 ;
  i ++ ) {
    ans += arr_new . get ( index ) ;
    index += 2 ;
  }
  System . out . println ( ans ) ;
}
