;
int e = Integer . parseInt ( input . readLine ( ) ) ;
int b = Integer . parseInt ( input . readLine ( ) ) ;
List < Integer > l = Lists . newArrayList ( ) ;
int ct = 0 ;
int ctb = 0 ;
for ( int i = 0 ;
i < 6 ;
i ++ ) {
  if ( e . contains ( l . get ( i ) ) ) ct ++ ;
  if ( l . get ( i ) == b ) ctb ++ ;
}
