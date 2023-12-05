def _import ( ) :
    import os
    import os
    import os
    import os
    import collections
    import collections
    import collections
    import os
    import os
    import os
    import sys
    class C :
        def __init__ ( self ) :
            with open ( 'c:/input.txt' , 'w' ) as f :
                self.write ( f.read ( ) )
        def get_sum ( self , value , counts ) :
            idx = counts.indexes [ value ]
            result = 0
            bit = 0
            while idx & 1 :
                result = ( result + counts.sums [ bit ] ) % 1000000007
            idx = idx >> 1
            bit += 1
        def set_sum ( self , value , counts ) :
            idx = counts.indexes [ value ]
            bit = 0
            for i in range ( self.bits ) :
                self.do_case ( self.bits + 1 , value , counts )
        def set_sum ( self , value , counts ) :
            idx = counts.indexes [ value ]
            bit = 0
            for i in range ( self.bits ) :
                self.do_case ( self.bits + 1 , value , counts )
    class Counts :
        def __init__ ( self ) :
            self.indexes = { }
            self.num = 0
            self.sums = [ ]
            self.bits = 0
            self.sums = [ ]
            self.bits = 0
            self.sums = [ ]
            self.bits = 0
            self.sums = [ ]
            self.bits = 0
            for i in range ( self.bits ) :
                self.sums.append ( [ self.bits + 100 ] )
                cnt += 1
                self.bits = self.bits + 1
                self.sums.append ( [ self.bits + 100 ] )
        def do_case ( self , case_number , sc , wr ) :
            n , m , X , Y , Z = sc.unpack ( '!I' )
            n = int ( n )
            m = int ( m )
            self.X = X
            self.Y = Y
            self.Z = Z
            self.counts = counts.counts [ int ( n ) ]
    C.__name__ = 'C'
    return C
