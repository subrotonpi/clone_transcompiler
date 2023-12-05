public static int [ ] [ ] getDistance ( String input ) {
  int h = Integer . parseInt ( input . substring ( 0 , input . indexOf ( " " ) ) ) ;
  int w = Integer . parseInt ( input . substring ( input . indexOf ( " " ) + 1 ) ) ;
  int d = Integer . parseInt ( input . substring ( input . indexOf ( " " ) + 1 ) ) ;
  List < List < Integer >> a = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) a . add ( Collections . singletonList ( Integer . parseInt ( input . substring ( input . indexOf ( " " ) + 1 ) ) ) ) ;
  int q = Integer . parseInt ( input . substring ( input . indexOf ( " " ) + 1 ) ) ;
  List < List < Integer >> l = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < q ;
  i ++ ) l . add ( Collections . singletonList ( Integer . parseInt ( input . substring ( input . indexOf ( " " ) + 1 ) ) ) ) ;
  Map < Integer , Integer > dic = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < a . size ( ) ;
  i ++ ) for ( int j = 0 ;
  j < a . get ( i ) . size ( ) ;
  j ++ ) dic . put ( a . get ( i ) . get ( j ) , new Integer [ ] {
    i , j }
    ) ;
    int [ ] sum = new int [ h * w + 1 ] ;
    for ( int i = d + 1 ;
    i <= h * w ;
    i ++ ) sum [ i ] = sum [ i - d ] + Math . abs ( dic . get ( i ) . get ( 0 ) - dic . get ( i - d ) . get ( 0 ) ) + Math . abs ( dic . get ( i ) . get ( 1 ) - dic . get ( i - d ) . get ( 1 ) - dic . get ( i - d ) . get ( 1 ) ) ;
    for ( List < Integer > l_ : l ) System . out . println ( sum [ l_ . get ( 1 ) ] - sum [ l_ . get ( 0 ) ] ) ;
    return sum ;
  }
  