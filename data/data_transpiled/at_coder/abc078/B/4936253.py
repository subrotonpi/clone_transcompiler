def main ( ) :
    from sys import stdin
    class B ( object ) :
        def __init__ ( self ) :
            self.B = B
        def A ( self ) :
            with open ( 'a' , 'r' ) as sc :
                s1 = sc.read ( )
                s2 = sc.read ( )
                if s1 < s2 :
                    print ( '<' )
                elif s1 == s2 :
                    print ( '=' )
                else :
                    print ( '>' )
        def B ( self ) :
            with open ( 'b' , 'r' ) as sc :
                X , Y , Z = sc.read ( )
                if X < Y or X < Z :
                    print ( 0 )
                    return
                X -= Z
                print ( X / ( Y + Z ) )
    return B
