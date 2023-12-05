@ Function public static String rl = new Scanner ( System . in ) {
  @ Override public String nextLine ( ) {
    return Integer . toString ( next ( ) ) ;
  }
  @ Override public String solve ( ) {
    int n = input . nextInt ( ) ;
    int l = input . nextInt ( ) ;
    int [ ] p = rl . nextInt ( ) ;
    int [ ] ps = new int [ l ] ;
    for ( int i = 0 ;
    i < p . length ;
    i ++ ) ps [ i ] = 100 - p [ i ] ;
    Stream < Integer > a = Stream . of ( ps ) ;
    a . limit ( n ) ;
    return Arrays . toString ( a . toArray ( ) ) ;
  }
}
