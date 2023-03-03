def import __main__
class Main ( ) :
    def __init__ ( self , * args , ** kwargs ) :
        sc = __main__ ( )
        n = sc.__next__ ( )
        s = sc.__next__ ( )
        t = sc.__next__ ( )
        a = 2 * n
        for i in range ( 0 , n ) :
            p = s [ n - i : n ]
            q = t [ : i ]
            if p == q : a = 2 * n - i
        print ( a )
