def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.stdin.read ( )
        self.m = sys.stdin.read ( )
        self.x = sys.stdin.read ( )
        self.y = sys.stdin.read ( )
        self.x_list = [ ]
        self.y_list = [ ]
        self.xmax = - 100
        self.ymin = 100
        for i in range ( self.n ) :
            self.x_list.append ( sys.stdin.read ( ) )
            if self.x_list [ i ] > xmax :
                xmax = self.x_list [ i ]
        for i in range ( self.m ) :
            self.y_list.append ( sys.stdin.read ( ) )
            if self.y_list [ i ] < ymin :
                ymin = self.y_list [ i ]
    judge = False
    for i in range ( self.x + 1 , self.y + 1 ) :
        if xmax < i <= ymin :
            judge = True
    if judge :
        print ( "No War" )
    else :
        print ( "War" )
