public static int S = Integer . parseInt ( input ) {
  int [ ] stu = new int [ S ] ;
  int zyousyou = 1 ;
  int kakou = 0 ;
  int u = 1 ;
  int s = 1 ;
  int ans = 1 ;
  for ( int i = 0 ;
  i < S ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( ( i > 0 ) && ( a > ba ) ) {
      u ++ ;
      if ( ( a > ba ) && ( kakou == 1 ) ) {
        if ( ( ans < u - s ) ) ans = u - s ;
        s = i ;
        kakou = 0 ;
        zyousyou = 1 ;
      }
    }
    else if ( ( a < ba ) && ( zyousyou == 1 ) ) {
      kakou = 1 ;
      zyousyou = 0 ;
    }
  }
  ba = a ;
}
