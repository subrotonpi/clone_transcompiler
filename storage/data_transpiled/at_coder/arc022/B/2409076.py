def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = int ( sc.readline ( ) )
        a = [ int ( i ) - 1 for i in sc.readline ( ).split ( ) ]
        m = 0
        for i in range ( n ) :
            m = max ( m , i )
        use = [ False ] * ( m + 1 )
        s = 1
        t = 0
        use [ a [ 0 ] ] = True
        ret = 1
        while s < n :
            while t < s and use [ a [ s ] ] :
                use [ a [ t ] ] = False
                t += 1
            while s < n and not use [ a [ s ] ] :
                use [ a [ s ] ] = True
                s += 1
            ret = max ( ret , s - t )
        print ( ret )
