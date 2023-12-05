def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.s = sys.stdin.read ( )
    def __call__ ( self , s ) :
        po = s.split ( '' )
        for i in po :
            if i == 0 :
                print ( ( ''.join ( [ chr ( i ) if i < 96 else chr ( i - 32 ) for i in range ( 0 , len ( po ) , 2 ) ] ) ) , end = '' )
            else :
                print ( ( ''.join ( [ chr ( i ) if i < 96 else chr ( i + 32 ) for i in range ( 0 , len ( po ) , 2 ) ] ) ) , end = '' )
        print ( )
