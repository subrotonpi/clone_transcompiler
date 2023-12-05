, n = Integer . MAX_VALUE , x = Integer . MIN_VALUE ) ;
List < Integer > a = Lists . newArrayList ( ) ;
for ( int i = 0 ;
i < n ;
i ++ ) {
  a . add ( i ) ;
}
int b [ ] = a . toArray ( ) ;
int d = Integer . MIN_VALUE ;
for ( int magic = 0 ;
magic < n ;
magic ++ ) {
  b = Math . min ( b [ i ] , a [ i - magic ] ) ;
  d = Math . min ( d , b [ i ] + magic * x ) ;
}
System . out . println ( d ) ;
}
