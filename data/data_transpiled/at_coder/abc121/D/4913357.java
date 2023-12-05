public static int A = Integer . parseInt ( input ) {
  A -- ;
  if ( A % 4 == 1 ) A = 1 ;
  else if ( A % 4 == 2 ) A ++ ;
  else if ( A % 4 == 3 ) A = 0 ;
  if ( B % 4 == 1 ) B = 1 ;
  else if ( B % 4 == 2 ) B ++ ;
  else if ( B % 4 == 3 ) B = 0 ;
  int answer = A ^ B ;
  return answer ;
}
