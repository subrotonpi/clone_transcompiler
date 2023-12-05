public static int H ( int H , int W ) {
  int h = Integer . parseInt ( input . nextLine ( ) ) ;
  int w = Integer . parseInt ( input . nextLine ( ) ) ;
  return H == h || H == w || W == h || W == w ? "YES" : "NO" ;
}
