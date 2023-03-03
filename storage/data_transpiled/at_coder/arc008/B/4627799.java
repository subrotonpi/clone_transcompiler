public static int n , int m ;
int N = Integer . parseInt ( input . nextLine ( ) ) ;
int K = Integer . parseInt ( input . nextLine ( ) ) ;
HashMap < Integer , Integer > dic_N = new HashMap < Integer , Integer > ( ) ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  if ( ! dic_N . containsKey ( i ) ) dic_N . put ( i , 1 ) ;
  else dic_N . put ( i , 1 ) ;
}
HashMap < Integer , Integer > dic_K = new HashMap < Integer , Integer > ( ) ;
for ( int i = 0 ;
i < K ;
i ++ ) {
  if ( ! dic_K . containsKey ( i ) ) dic_K . put ( i , 1 ) ;
  else dic_K . put ( i , 1 ) ;
}
int cou = 0 ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  int ni = dic_N . get ( i ) ;
  if ( ! dic_K . containsKey ( i ) ) {
    cou = - 1 ;
    break ;
  }
  int ki = dic_K . get ( i ) ;
  int re = ni / ki ;
  if ( ni % ki != 0 ) re ++ ;
  cou = Math . max ( cou , re ) ;
}
System . out . println ( cou ) ;
return m ;
}
