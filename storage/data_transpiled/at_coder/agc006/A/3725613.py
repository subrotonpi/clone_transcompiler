def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.maxint
        s = self.s
        t = self.t
        ans = ""
        for i in range ( 0 , N ) :
            tmp = s + t [ i ]
            if s == tmp [ : N ] == t and tmp [ - N : len ( tmp ) ] == "" :
                ans = tmp
        print ( len ( ans ) )
