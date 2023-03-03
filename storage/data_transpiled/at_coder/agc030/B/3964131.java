static final int [ ] getMath ( int p , int n ) {
  int L = ( int ) input . nextInt ( ) , N = ( int ) input . nextInt ( ) ;
  List < Integer > X = new ArrayList < > ( N ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) X . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  X . add ( 0 , 0 ) ;
  List < Integer > X_r = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < X . size ( ) ;
  i ++ ) X_r . add ( L - i ) ;
  X_r . add ( 0 , 0 ) ;
  X_r . remove ( X_r . size ( ) - 1 ) ;
  {
    int s = 0 ;
    for ( int i = 0 ;
    i < X . size ( ) ;
    i ++ ) {
      s += X . get ( i ) ;
    }
  }
  List < Integer > X_sum = new ArrayList < > ( ) ;
  List < Integer > X_rsum = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < X_r . size ( ) ;
  i ++ ) X_sum . add ( X_r . get ( i ) ) ;
  {
    int N_tmp = N - n ;
    int a = N_tmp / 2 ;
    if ( N_tmp == 0 ) return 0 ;
    else if ( N_tmp % 2 == 0 ) return 2 * X_sum . get ( a ) + X_rsum . get ( a + n ) + X_rsum . get ( a + n - 1 ) - 2 * X_rsum . get ( n ) + p ;
    else return X_sum . get ( a + 1 ) + X_rsum . get ( a ) + 2 * X_sum . get ( a + n ) - 2 * X_rsum . get ( n ) + p ;
  }
  int max_l = Math . max ( X . get ( i ) + f_r ( X . get ( i ) , i ) , i ) ;
  int max_r = Math . max ( X_r . get ( i ) + f_l ( X_r . get ( i ) , i ) , i ) ;
  System . out . println ( Math . max ( max_l , max_r ) ) ;
  return X ;
}
