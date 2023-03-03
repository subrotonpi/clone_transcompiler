def round1 ( ) :
    import os
    import sys
    import os
    import sys
    class B2 ( object ) :
        def __init__ ( self ) :
            self.N , self.M = 0 , 0
            self.MS = [ ]
            self.likes = [ ]
        def clear ( self , k ) :
            for i in range ( self.M ) :
                j = 0
                while j < len ( self.likes [ i ] ) :
                    t = self.likes [ i ] [ j ]
                    if t [ 0 ] == k and t [ 1 ] == 0 :
                        self.likes [ i ].pop ( j )
                    else :
                        j += 1
    def main ( ) :
        f = open ( 'B-large.in' , 'r' )
        out = open ( 'B-large-out' , 'w' )
        T = int ( f.readline ( ) )
        for i in range ( 1 , T + 1 ) :
            N = int ( f.readline ( ) )
            M = int ( f.readline ( ) )
            self.MS = [ ]
            self.likes = [ ]
            for i in range ( M ) :
                self.likes.append ( [ ] )
                L = f.readline ( ).split ( )
                C = int ( L [ 0 ] )
                for k in range ( 2 * C , 2 ) :
                    self.likes [ i ].append ( [ int ( L [ k + 1 ] ) - 1 , int ( L [ k + 2 ] ) ] )
        one_more , imp = False , False
        while True :
            one_more = False
            for i in range ( self.M ) :
                if len ( self.likes [ i ] ) == 0 :
                    imp = True
                    break
                if len ( self.likes [ i ] ) == 1 and self.likes [ i ].firstElement [ 1 ] == 1 :
                    if not self.MS [ self.likes [ i ].firstElement [ 0 ] ] :
                        self.MS [ self.likes [ i ].firstElement [ 0 ] ] = True
                        self.clear ( self.likes [ i ].firstElement [ 0 ] )
            out.flush ( )
