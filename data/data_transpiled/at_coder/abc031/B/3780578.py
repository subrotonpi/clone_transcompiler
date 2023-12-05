def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.name = sys.argv [ 0 ]
    def __call__ ( self , * args , ** kwargs ) :
        with open ( self.name , 'r' ) as f :
            line = f.readline ( ).split ( )
            l = int ( line [ 0 ] )
            h = int ( line [ 1 ] )
            n = int ( args [ 2 ] )
            for i in range ( n ) :
                a = int ( args [ 3 ] )
                if h < a :
                    print ( - 1 )
                elif a < l :
                    print ( l - a )
                else :
                    print ( 0 )
