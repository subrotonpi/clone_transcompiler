def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sys = sys
        self.H , self.W = self.sys.argv [ 1 ] , self.sys.argv [ 2 ]
        list = [ ]
        for i in range ( self.H ) :
            temp = sys.stdin.readline ( )
            list.append ( temp )
        for i in range ( self.W + 2 ) :
            print ( "#" , end = '' )
        print ( )
        for i in range ( self.H ) :
            print ( "#" , end = '' )
            print ( list [ i ] , end = '' )
            print ( )
        for i in range ( self.W + 2 ) :
            print ( "#" , end = '' )
        print ( )
