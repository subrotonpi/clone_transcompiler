public static boolean better ( String c , int j , String aC , String aJ ) {
  if ( aC . equals ( "-1" ) ) return true ;
  if ( Math . abs ( Integer . parseInt ( aC ) - Integer . parseInt ( aJ ) ) != Math . abs ( Integer . parseInt ( c ) - Integer . parseInt ( j ) ) ) {
    return Math . abs ( Integer . parseInt ( aC ) - Integer . parseInt ( aJ ) ) > Math . abs ( Integer . parseInt ( c ) - Integer . parseInt ( j ) ) ;
  }
  if ( Integer . parseInt ( aC ) != Integer . parseInt ( c ) ) return Integer . parseInt ( aC ) > Integer . parseInt ( c ) ;
  if ( Integer . parseInt ( aJ ) != Integer . parseInt ( j ) ) return Integer . parseInt ( aJ ) > Integer . parseInt ( j ) ;
  return false ;
}
