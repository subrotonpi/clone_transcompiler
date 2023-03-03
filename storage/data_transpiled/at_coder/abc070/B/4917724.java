static final Supplier < Integer > NANO_SUPPLIER = new Supplier < Integer > ( ) {
  @ Override public Integer get ( ) {
    return System . in . nextInt ( ) ;
  }
}
;
Supplier < Integer > ni = ( ) -> Integer . parseInt ( ns . get ( ) ) ;
Supplier < Integer > nm = ( ) -> map ( Integer :: parseInt , Integer :: parseInt ) ;
Supplier < List < Integer >> nl = ( ) -> Collections . singletonList ( nl . get ( ) ) ;
int a = nm . get ( ) ;
int b = nm . get ( ) ;
int c = nm . get ( ) ;
int d = nm . get ( ) ;
if ( b <= c || d <= a ) {
  System . out . println ( 0 ) ;
}
else {
  System . out . println ( Math . min ( b , d ) - Math . max ( a , c ) ) ;
}
}
