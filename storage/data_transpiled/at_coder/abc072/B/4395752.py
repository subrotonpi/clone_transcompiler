def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.__main__ = sys.argv [ 0 ]
    def __call__ ( self , po ) :
        s = po.split ( '' , 1 )
        for i , s in enumerate ( s ) :
            sys.stdout.write ( ( s [ i ] if i % 2 == 0 else '' ) )
        print ( )
