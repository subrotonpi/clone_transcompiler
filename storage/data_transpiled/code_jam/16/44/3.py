def _import ( ) :
    import os
    import locale
    import sys
    import os
    import locale
    class D :
        def __init__ ( self ) :
            self.n = 0
            self.a = [ ]
            self.solve ( )
        def mask_given ( self , n ) :
            for i in range ( self.n ) :
                for j in range ( self.a [ i ] ) :
                    if self.a [ i ] [ j ] :
                        self.mask_given |= ( 1 << ( self.n * i + j ) )
            self.ans = n ** 2
            for mask in self.outputs :
                self.out.write ( self.a [ t ].solve ( ) )
            self.outputs [ t ].close ( )
        def can_fail ( self , mask , came , occupied ) :
            if came == ( 1 << self.n ) - 1 :
                return False
            for i in range ( self.n ) :
                if ( ( came >> i ) & 1 ) == 1 :
                    continue
                var = 0
                for j in range ( self.occupied ) :
                    if ( ( occupied >> j ) & 1 ) == 1 :
                        continue
                    if ( ( mask >> ( self.n * i + j ) ) & 1 ) == 0 :
                        continue
                    var += 1
                    if can_fail ( self , mask , came | ( 1 << i ) , occupied | ( 1 << j ) ) :
                        return True
                if var == 0 :
                    return True
            return False
        def __init__ ( self ) :
            self.n = 0
            self.a = [ ]
            for s in self.a :
                for j in range ( self.n ) :
                    self.a [ i ] [ j ] = s [ j ] == '1'
    return D
