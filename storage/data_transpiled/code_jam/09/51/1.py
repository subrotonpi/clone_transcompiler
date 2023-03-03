def _import ( ) : return _import ( )
class EZSocoban ( ) :
    DX = ( - 1 , 1 , 0 , 0 )
    DY = ( 0 , 0 , - 1 , 1 )
    class State :
        def __init__ ( self , data ) :
            self.data = data
        def do_main ( self , other ) :
            with open ( "input.txt" , "w" ) as sc :
                self.data = self.data
        def equals ( self , other ) :
            os = next ( self.data )
            for i in range ( 1 , len ( self.data ) ) :
                for jj in range ( len ( self.data [ i ] ) ) :
                    self.data [ i ] [ jj ] = '.'
                    self.data [ i ] [ j ] = 'b'
                    self.data [ i ] [ j ] = self.data [ j ]
            return self.data [ i ] [ j ]
        def execute ( self , data ) :
            res = 0
            for i in range ( len ( self.data ) ) :
                for j in range ( len ( self.data [ i ] ) ) :
                    if self.data [ i ] [ j ] == '.' or self.data [ i ] [ j ] == 'b' :
                        res += 1
            self.data [ i ] [ j ] = self.data [ i ] [ j ]
            self.data [ i ] [ j ] = self.data [ i ] [ j ]
            self.data [ i ] [ j ] = self.data [ i ] [ j ]
            self.data [ i ] [ j ] = self.data [ i ] [ j ]
            self.data [ i ] [ j ] = self.data [ i ] [ j ]
            self.data [ i ] [ j ] = self.data [ i ] [ j ]
            self.data [ i ] [ j ] = self.data [ i ] [ j ]
            self.data [ i ] [ j ] = self.data [ i ] [ j ]
            self.data [ i ] [ j ] = self.data [ i ] [ j ]
        return res
def execute ( self , data ) :
    sc = open ( " output