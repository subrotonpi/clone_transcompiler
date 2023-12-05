def googlejam ( ) :
    import re
    import sys
    import os
    import sys
    import os
    import sys
    import os
    import sys
    import sys
    class BribethePrisoner2 ( object ) :
        def __init__ ( self ) :
            self.min = 0
        def __init__ ( self ) :
            self.m = { }
    f = open ( 'c:\\C-large.in.txt' , 'r' )
    pr = open ( 'C:\\Clargeout.txt' , 'w' )
    T = int ( f.readline ( ).strip ( ) )
    for i in range ( T ) :
        temp = f.readline ( ).strip ( ).split ( '[ ]+' )
        p = int ( temp [ 0 ] )
        q = int ( temp [ 1 ] )
        br = [ - 1 , p ]
        temp1 = f.readline ( ).strip ( ).split ( '[ ]+' )
        for j in range ( q ) :
            br [ j + 1 ] = int ( temp1 [ j ] ) - 1
        self.m = { }
        print ( i )
        pr.write ( 'Case #%d: %d\n' % ( i + 1 , search ( 0 , len ( br ) - 1 , br ) ) )
    pr.close ( )
    def search ( l , r , br ) :
        if self.m.has_key ( '%d %d' % ( l , r ) ) :
            return self.m [ '%d %d' % ( l , r ) ]
        if l + 1 == r :
            return 0
        result = - 1
        for i in range ( l + 1 , r ) :
            t = search ( l , i , br ) + search ( i , r , br ) + br [ r ] - br [ l ] - 2
            if result == - 1 or result > t :
                result = t
        if result == - 1 :
            print ( '!!!!' )
        self.m [ '%d %d' % ( l , r ) ] = result
        return result
    return
