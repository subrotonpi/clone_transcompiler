public static void print ( int n ) {
  int [ ] a = Integer . parseInt ( input ( ) ) ;
  boolean [ ] use = new boolean [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    use [ i ] = false ;
  }
  int mx = Math . max ( a . length , n ) ;
  if ( mx < 0 ) {
    use [ a . length - mx ] = true ;
  }
  else {
    int evn = Integer . highestOneBit ( a [ 0 ] ) ;
    int odd = Integer . highestOneBit ( a [ 1 ] ) ;
    mx = Math . max ( evn , odd ) ;
    for ( int i = Integer . highestOneBit ( evn < odd ) ;
    i < n ;
    i += 2 ) {
      if ( a [ i ] > 0 ) use [ i ] = true ;
    }
  }
  System . out . println ( mx ) ;
  int beg = 0 ;
  while ( ! use [ beg ] ) beg ++ ;
  int [ ] res = new int [ beg + 1 ] ;
  res [ beg ] = 1 ;
  int end = n - 1 ;
  while ( beg < end ) {
    if ( use [ end ] ) {
      if ( use [ end - 2 ] ) {
        a [ end - 2 ] += a [ end ] ;
        res [ end - 1 ] = end - beg ;
        end -= 2 ;
        use [ end ] = true ;
      }
      else {
        res [ end - 1 ] = end - beg - 1 ;
        a [ end - 2 ] = a [ end ] ;
        end -= 2 ;
        use [ end ] = true ;
      }
    }
    else {
      res [ end - beg + 1 ] = end - 1 ;
      end -- ;
    }
  }
  System . out . println ( res . length ) ;
  for ( int i : res ) {
    System . out . println ( i ) ;
  }
}
