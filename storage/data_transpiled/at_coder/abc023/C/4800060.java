public static int [ ] [ ] R , C , K ;
int N = Integer . parseInt ( input . readLine ( ) ) ;
int [ ] R_ary = new int [ R ] ;
int [ ] C_ary = new int [ C ] ;
int [ ] [ ] ary = new int [ N ] [ ] ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  int r = Integer . parseInt ( input . readLine ( ) ) ;
  int c = Integer . parseInt ( input . readLine ( ) ) ;
  R_ary [ r - 1 ] ++ ;
  C_ary [ c - 1 ] ++ ;
  ary [ i ] = new int [ r - 1 ] ;
  ary [ i ] [ 0 ] = c - 1 ;
}
int [ ] rlist = new int [ K + 1 ] ;
int [ ] clist = new int [ K + 1 ] ;
for ( int i = 0 ;
i < R_ary . length ;
i ++ ) if ( R_ary [ i ] <= K ) rlist [ i ] ++ ;
for ( int i = 0 ;
i < C_ary . length ;
i ++ ) {
  int [ ] ar = ary [ i ] ;
  if ( R_ary [ ar [ 0 ] ] + C_ary [ ar [ 1 ] ] == K ) cnt -- ;
  else if ( R_ary [ ar [ 0 ] ] + C_ary [ ar [ 1 ] ] == K + 1 ) cnt ++ ;
}
System . out . println ( cnt ) ;
return ary ;
}
