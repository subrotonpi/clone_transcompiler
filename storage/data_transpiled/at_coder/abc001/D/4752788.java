public static int [ ] [ ] SE = new int [ 3 ] [ ] ;
for ( int n = 0 ;
n < Integer . parseInt ( input ) ;
n ++ ) {
  int s = Integer . parseInt ( input . nextLine ( ) ) ;
  int e = Integer . parseInt ( input . nextLine ( ) ) ;
  s = s - s % 5 ;
  e = e + ( 5 - e ) % 5 ;
  e = e % 100 == 60 ? e : e ;
}
