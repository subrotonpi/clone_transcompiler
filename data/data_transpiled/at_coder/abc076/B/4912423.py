def main ( ) :
    import sys
    class B ( object ) :
        def __init__ ( self ) :
            self.B = B
        def A ( self ) :
            with open ( "A.txt" , "r" ) as sc :
                r = sc.read ( )
            with open ( "B.txt" , "r" ) as g :
                print ( 2 * g - r )
        def B ( self ) :
            with open ( "B.txt" , "r" ) as sc :
                N = sc.read ( )
                K = sc.read ( )
                ret = 1
                for i in range ( N ) :
                    if ret < K :
                        ret += ret
                    else :
                        ret += K
                print ( ret )
    return B
