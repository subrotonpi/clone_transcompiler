static final int [ ] [ ] a ( int a , int b , int c , int d , int e , int f ) {
  int a = Integer . parseInt ( input ( ) ) ;
  int b = Integer . parseInt ( input ( ) ) ;
  int c = Integer . parseInt ( input ( ) ) ;
  int d = Integer . parseInt ( input ( ) ) ;
  int e = Integer . parseInt ( input ( ) ) ;
  int f = Integer . parseInt ( input ( ) ) ;
  int [ ] [ ] memo = new int [ 10000 ] [ 1000 ] ;
  Comparator < Integer > func = t -> t . y > 0 ? new Fraction ( t . x , t . y ) : - 10 ;
  /* dp */
  if ( w * e < s || w * 100 + s > f ) return new int [ ] [ ] {
    - 1 , - 1 }
    ;
    int [ ] m = memo [ s ] [ w ] ;
    if ( m [ 0 ] > 0 ) return m ;
    int [ ] p0 = new int [ ] {
      s , w }
      ;
      int [ ] p1 = dp ( s , w + a ) ;
      int [ ] p2 = new int [ ] {
        s , w + b }
        ;
        int [ ] p3 = new int [ ] {
          s , w + c }
          ;
          int [ ] p4 = new int [ ] {
            s , w + d }
            ;
            return memo [ s ] [ w ] ;
          }
          