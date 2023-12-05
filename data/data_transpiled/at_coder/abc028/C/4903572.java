static final List < Integer > getSmallerList ( ) {
  List < Integer > l1 = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < l1 . size ( ) ;
  i ++ ) l1 . add ( i ) ;
  List < Integer > l2 = Lists . newArrayList ( ) ;
  l2 . add ( 3 ) ;
  List < Integer > l3 = Lists . newArrayList ( ) ;
  for ( int l : l2 ) l3 . add ( l ) ;
  l3 . add ( l ) ;
  l3 . sort ( ) ;
  return l3 ;
}
