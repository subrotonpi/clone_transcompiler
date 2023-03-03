def _import ( ) :
    import os
    import sys
    import os
    import sys
    import os
    import sys
    class C ( object ) :
        def __init__ ( self ) :
            self.file = 'c-large'
        def read ( self ) :
            self.file = self.file
            self.file = self.file
            self.file = self.file
            self.file = self.file
            self.file = self.file
            self.file.write ( self.file )
            self.file.write ( '\n' )
        def calc_sums ( self ) :
            sums = [ ]
            for i in range ( self.file.read ( ) ) :
                if self.file.read ( ) % 3 == 0 :
                    for j in range ( 1 , self.file.read ( ) , 3 ) :
                        sums.append ( self.file [ i ] [ j ] )
                else :
                    for j in range ( 0 , self.file.read ( ) , 3 ) :
                        sums [ i ] += self.file [ i ] [ j ]
            return sums
        def solve_sys ( self ) :
            cx = [ ]
            ax = [ ]
            cx.append ( 1 )
            ax.append ( 0 )
            cx.append ( - 1 )
            ax.append ( sums [ 0 ] )
            for i in range ( 1 , self.file.read ( ) - 1 ) :
                cx.append ( - cx [ i ] - cx [ i - 1 ] )
                ax.append ( sums [ i ] - ax [ i ] - ax [ i - 1 ] )
            if not cx [ r // 2 ] :
                ans = ax [ r // 2 ]
                return ans
            x = ( sums [ r - 1 ] - ax [ r - 1 ] - ax [ r - 2 ] ) / ( cx [ r - 1 ] + cx [ r - 2 ] )
            ans = cx [ r // 2 ] * x + ax [ r // 2 ]
        def solve ( self ) :
            ntest = int ( self.read_word ( ) )
            for test in range ( 1 , ntest + 1 ) :
                r , c = int ( self.read_word ( ) ) , int ( self.read_word ( ) )
                table =