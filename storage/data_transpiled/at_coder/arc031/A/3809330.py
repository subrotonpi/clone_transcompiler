def import import sys
class Main ( object ) :
    def __init__ ( self , name ) :
        self.name = name
        flag = True
        for i in range ( len ( name ) / 2 ) :
            if name [ i ] != name [ - 1 - i ] :
                flag = False
                break
        if flag :
            print ( "YES" )
        else :
            print ( "NO" )
