public static int A1 , int A2 , int A3 ;
return Math . min ( Math . abs ( A1 - A2 ) + Math . abs ( A2 - A3 ) , Math . abs ( A1 - A3 ) + Math . abs ( A2 - A3 ) + Math . abs ( A3 - A1 ) ) ;
}
