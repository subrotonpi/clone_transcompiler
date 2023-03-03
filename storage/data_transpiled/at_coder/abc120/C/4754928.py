def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.data = sys.stdin.read ( )
    def __call__ ( self , data ) :
        data = data.decode ( )
        rb = [ 0 , 0 ]
        for x in data.split ( '' ) :
            if x == '0' :
                rb [ 0 ] += 1
            else :
                rb [ 1 ] += 1
        print ( min ( rb ) * 2 )
