def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.num = sys.argv.index ( 'num' )
    def run ( self ) :
        self.num = int ( self.num )
        ans = 0
        prv = - 1
        tmp = - 1
        for i in range ( self.num ) :
            prv = tmp
            tmp = sys.argv.index ( 'prv' )
            if prv == tmp :
                tmp = - 1
                ans += 1
        print ( ans )
