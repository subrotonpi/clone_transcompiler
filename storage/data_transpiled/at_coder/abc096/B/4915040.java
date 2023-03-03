public static int A , int B , int C ;
int [ ] lists = {
  A , B , C }
  ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int X = 0 ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    X = Math . max ( lists [ i ] , X ) ;
  }
  return X ;
}
