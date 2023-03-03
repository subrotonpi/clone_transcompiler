def import _warshall_floyd
class Main ( object ) :
    def __init__ ( self , dist ) :
        self.dist = [ ]
    def __init__ ( self , N , M ) :
        self.dist = [ ]
        self.u = [ ]
        self.v = [ ]
        self.l = [ ]
        self.dist = [ ]
        for i in range ( N ) :
            [ self.dist [ i ] ].append ( int ( self.dist [ i ] ) )
        list = [ ]
        for i in range ( M ) :
            u = [ - 1 ]
            v = [ - 1 ]
            l = [ - 1 ]
            self.dist [ u [ i ] ] [ v [ i ] ] = l [ i ]
            self.dist [ v [ i ] ] [ u [ i ] ] = l [ i ]
            if u [ i ] == 0 :
                list.append ( v [ i ] )
            if v [ i ] == 0 :
                list.append ( u [ i ] )
        self.warshall_floyd ( N )
        min = float ( self.dist [ 0 ] [ list [ 0 ] ] )
        for i in list :
            for j in list :
                if i == j :
                    continue
                min = min ( min , self.dist [ 0 ] [ list [ 0 ] ] + self.dist [ list [ 0 ] [ j ] ] + self.dist [ list [ 1 ] [ j ] ] [ 0 ] )
        print ( min == float ( self.dist [ 0 ] ) )
    def warshall_floyd ( self ) :
        for k in range ( 1 , N ) :
            for i in range ( 1 , N ) :
                for j in range ( 1 , N ) :
                    self.dist [ i ] [ j ] = min ( self.dist [ i ] [ j ] , self.dist [ i ] [ k ] + self.dist [ k ] [ j ] )
