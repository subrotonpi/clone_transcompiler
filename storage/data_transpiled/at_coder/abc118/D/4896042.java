public static void main ( String [ ] args ) {
  B = new B [ ] {
    0 , 2 , 5 , 5 , 4 , 5 , 6 , 3 , 7 , 6 }
    ;
    N = Integer . parseInt ( input . nextLine ( ) ) ;
    M = Integer . parseInt ( input . nextLine ( ) ) ;
    A = new LinkedList < Integer > ( ) ;
    A . add ( B ) ;
    A . add ( M ) ;
    dic = new HashMap < Integer , Integer > ( ) ;
    for ( int i = 0 ;
    i < N + 1 ;
    i ++ ) {
      dic . put ( i , B . get ( i ) ) ;
    }
    dp = new int [ N + 1 ] ;
    dp [ N ] = 0 ;
  }
  