public static int A = Integer . parseInt ( input ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] arr = {
    A , B , C }
    ;
    for ( int i = 0 ;
    i < K ;
    i ++ ) {
      int arr1 = 2 * arr [ 0 ] + arr [ 1 ] + arr [ 2 ] ;
      int arr2 = arr [ 0 ] + 2 * arr [ 1 ] + arr [ 2 ] ;
      int arr3 = arr [ 0 ] + arr [ 1 ] + 2 * arr [ 2 ] ;
      int [ ] tmp = {
        arr1 , arr2 , arr3 }
        ;
        int idx = tmp . indexOf ( max ( tmp ) ) ;
        arr [ idx ] *= 2 ;
      }
      System . out . println ( Arrays . toString ( arr ) ) ;
      return K ;
    }
    