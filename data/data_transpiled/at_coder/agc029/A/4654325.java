, count = 0 , ans = 0 ) ;
s = input ( ) ;
for ( int i = 0 ;
i < s . length ( ) ;
i ++ ) {
  if ( s . charAt ( i ) == 'W' ) {
    ans += i - count ;
    count ++ ;
  }
}
System . out . println ( ans ) ;
}
