public static String N , A , B = map ( Integer . parseInt , input ) ;
return N % ( A + B ) != 0 && N % ( A + B ) <= A ? "Ant" : "Bug" ;
}
