def _ _ main _ _ ( ) :
    import sys
    import os
    import sys
    import random
    import struct
    import struct
    import struct
    import struct
    import os
    import sys
    class C :
        def __init__ ( self , type , num , n , dp ) :
            self.type = type
            self.num = num
            self.n = n
            self.dp = dp
        def f ( self , mask ) :
            if mask == ( 1 << n ) - 1 :
                return 0
            if self.n >= 16 :
                return 16
            if self.dp [ self.n ] [ mask ] != - 1 :
                return self.dp [ self.n ] [ mask ]
            result = 16
            left = mask ^ ( ( 1 << n ) - 1 )
            for j in range ( left , 0 , - 1 ) :
                nice_mask = True
                last = 3
                for k in range ( self.n ) :
                    if ( j & 1 << k ) :
                        if self.num [ k ] != i and self.num [ k ] != 0 :
                            nice_mask = False
                        else :
                            if ( last & self.type [ k ] ) != self.type [ k ] :
                                nice_mask = False
                            else :
                                last = 3 ^ self.type [ k ]
                    else :
                        if self.num [ k ] == i :
                            nice_mask = False
                if nice_mask :
                    add = 0
                    if last == 2 :
                        add = 1
                    result = min ( result , add + f ( self.n + 1 , mask | j ) )
                if j == 0 :
                    break
            return self.dp [ self.n ] [ mask ]
    f = C.f
    tc = f.count ( )
    for cc in range ( 1 , tc + 1 ) :
        n = f.count ( )
        self.type = [ ]
        self.num = [ ]
        self.dp = [ ]
        for a in self.dp :
            a.append ( a )
    f.close ( )
