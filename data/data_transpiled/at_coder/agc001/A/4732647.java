static final int binarySearch ( ) {
  int N = input ( ) ;
  int [ ] Ls = map ( Integer . parseInt , input ( ) ) ;
  Arrays . sort ( Ls ) ;
  int ans = Arrays . binarySearch ( Ls , N ) ;
  return ans ;
}
