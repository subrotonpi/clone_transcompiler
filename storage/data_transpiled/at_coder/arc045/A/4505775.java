@ Parameters public static String dicts = new String [ ] {
  "Left" , "<" , "Right" , ">" , "AtCoder" , "A" }
  ;
  StringBuffer ans = new StringBuffer ( ) ;
  for ( int index = 0 ;
  index < input . length ( ) ;
  index ++ ) {
    if ( index == 0 ) {
      ans . append ( dicts . get ( input . charAt ( index ) ) ) ;
    }
    else {
      ans . append ( ( " " ) + dicts . get ( input . charAt ( index ) ) ) ;
    }
  }
  System . out . println ( ans ) ;
  return ans . toString ( ) ;
}
