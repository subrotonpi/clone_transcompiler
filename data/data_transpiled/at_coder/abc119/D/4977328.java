static private int [ ] adj ( int x , int [ ] ks ) {
  final int idx = Arrays . binarySearch ( ks , x ) ;
  return ks [ idx - 1 ] ;
}
