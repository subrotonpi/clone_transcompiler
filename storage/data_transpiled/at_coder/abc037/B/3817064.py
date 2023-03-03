def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.readline ( ) )
        self.q = int ( sys.stdin.readline ( ) )
        self.ar = [ ]
        for i in range ( self.q ) :
            tmpl = self.env.get_template ( )
            tmpr = self.env.get_template ( )
            tmp = self.env.get_template ( )
            for j in range ( tmpl - 1 , tmpr ) :
                self.ar.append ( tmp )
        for i in range ( self.n ) :
            print ( self.ar [ i ] )
