def _ _ main _ _ ( ) :
    import sys
    import os
    import sys
    import sys
    import os
    import sys
    import re
    import sys
    class Watersheds ( object ) :
        def __init__ ( self ) :
            self.m = [ ]
            self.s = [ ]
            self.H , self.W = self.H , self.W
            self.color = '#'
            self.dx = [ 0 , - 1 , 1 , 0 ]
        def print_m ( self ) :
            i , j , k = self.line.split ( )
            self.m = [ i , j ]
            self.W = self.W
            self.s = [ i , j ]
            self.color = 'a'
            for j , k in enumerate ( self.H ) :
                self.m [ j , k ] = int ( self.line [ j ] )
        def print_s ( self ) :
            i , j , k = self.line.split ( )
            self.color = '.'
            self.s [ j , k ] = '.'
            self.spread ( j , k )
            self.color += 1
        def print_s ( self ) :
            i , j , k = self.line.split ( )
            self.color += 1
            self.s [ j , k ] = '.'
            self.spread ( j , k )
            self.color += 1
        def goes ( self , y1 , x1 , y2 , x2 ) :
            i , j , k = self.line.split ( )
            self.color += 1
            self.s [ j , k ] = '.'
            self.spread ( j , k )
            self.color += 1
    return Watersheds
