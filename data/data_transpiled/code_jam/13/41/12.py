def _import ( ) :
    import math
    import sys
    class A ( int ) :
        def B ( n ) :
            return int ( n )
        def A ( A , B ) :
            return A + B
        def M ( A , B ) :
            return A * B
    ans = A - new_cost
    print ( "Case #%d: %s\n" % ( cas , ans.capitalize ( ) ) )
    def cost ( ) :
        LEN = B ( )
        SUM_LEN = M ( LEN , A ( LEN , B ( - 1 ) ) ) / B ( 2 )
        ans = M ( B ( L ) , LEN )
        ans = ans - SUM_LEN
        return ans
    def main ( ) :
        with open ( "/proc/stdin" , "r" ) as f :
            T = int ( f.readline ( ) )
            for cas in range ( 1 , T + 1 ) :
                L , n = int ( f.readline ( ) )
                EV = [ ]
                old_cost = B ( 0 )
                for enter , exit , k in zip ( range ( n ) , range ( n ) ) :
                    EV.append ( [ enter , k , 1 ] )
                    EV.append ( [ exit , k , - 1 ] )
                    old_cost = A ( old_cost , M ( B ( k ) , cost ( exit - enter ) ) )
                new_cost = B ( 0 )
                EV.sort ( key = lambda A : A [ 0 ] , reverse = True )
                if ent [ 1 ] >= amt :
                    new_cost = A ( new_cost , M ( B ( amt ) , cost ( pos - ent [ 0 ] ) ) )
                else :
                    pos = ev [ 0 ]
                    amt = ev [ 1 ]
                    while 1 :
                        ent = ST.pop ( )
                        if ent [ 2 ] == 1 :
                            ST.append ( [ ev [ 0 ] , ev [ 1 ] ] )
                        else :
                            new_cost = A ( new_cost , M ( B ( amt ) , cost ( pos - ent [ 0 ] ) ) )
    return ans
