public static int A , int B , int C ;
int flg = 0 ;
for ( int i = A ;
i <= A * B ;
i ++ ) {
  if ( i % A == 0 && i % B == C ) {
    flg = 1 ;
    break ;
  }
}
return flg == 1 ? 1 : 0 ;
}
