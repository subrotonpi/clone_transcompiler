@ Function public static int [ ] calcsalary ( ) {
  int n = Integer . parseInt ( input ( ) ) ;
  int [ ] salary = new int [ n + 1 ] ;
  Map < Integer , Integer > map = new LinkedHashMap < > ( ) ;
  for ( int i = 2 ;
  i <= n ;
  i ++ ) {
    map . put ( Integer . parseInt ( input ( ) ) , i ) ;
  }
  /*if(map.get(i).isEmpty()){
  salary[i] = 1;
  return 1;
  }*/
  int [ ] subord = new int [ n ] ;
  for ( int x : map . get ( i ) ) {
    if ( salary [ x ] > 0 ) {
      subord [ x ] = salary [ x ] ;
    }
    else {
      subord [ x ] = calcsalary ( x ) ;
    }
  }
  salary [ x ] = max ( subord ) + min ( subord ) + 1 ;
  return salary ;
}
