def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.stdin = sys.stdin
        self.H , self.W , self.N = sys.argv [ 1 : ]
    color = [ ]
    for i in range ( self.N ) :
        color.append ( sys.stdin.read ( ) )
    row = col = color_index = 0
    to_right = True
    while row < H :
        s = ""
        if to_right :
            while col < W :
                if color [ color_index ] == 0 :
                    color_index += 1
                s += "%d " % ( color_index + 1 )
                color [ color_index ] -= 1
                col += 1
            col -= 1
            to_right = False
        else :
            while 0 <= col :
                if color [ color_index ] == 0 :
                    color_index += 1
                s = "%d " % ( color_index + 1 ) + s
                color [ color_index ] -= 1
                col -= 1
            col += 1
            to_right = True
        row += 1
        print ( s )
