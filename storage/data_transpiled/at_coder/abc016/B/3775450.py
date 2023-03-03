def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.name = sys.argv [ 0 ]
    def __call__ ( self , * args , ** kwargs ) :
        with open ( self.name , 'r' ) as f :
            line = f.readline ( ).split ( )
            a = int ( line [ 0 ] )
            b = int ( line [ 1 ] )
            c = int ( line [ 2 ] )
            if a + b == c and a - b != c :
                print ( '+' )
            elif a + b != c and a - b == c :
                print ( '-' )
            elif a + b == c and a - b == c :
                print ( '?' )
            else :
                print ( '!' )
