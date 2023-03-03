def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.S = sys.stdin.read ( )
    def __call__ ( self , S ) :
        S = S.lower ( )
        i = S.find ( "i" )
        if i == - 1 :
            print ( "NO" )
            return
        i = S.find ( "c" , i )
        if i == - 1 :
            print ( "NO" )
            return
        i = S.find ( "t" , i )
        if i == - 1 :
            print ( "NO" )
            return
        print ( "YES" )
