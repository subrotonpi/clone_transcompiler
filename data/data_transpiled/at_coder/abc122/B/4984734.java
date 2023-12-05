input ;
int x = input . nextInt ( ) ;
int count = 0 ;
int [ ] d = new int [ x ] ;
for ( int i = 0 ;
i < x ;
i ++ ) {
  if ( ( i == 'A' ) || ( i == 'C' ) || ( i == 'G' ) || ( i == 'T' ) ) {
    count = count + 1 ;
    d [ i ] = count ;
  }
  else count = 0 ;
}
System . out . println ( max ( d ) ) ;
}
